import java.util.Scanner;

public class NenChuoiRLE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi cần nén: ");
        String input = scanner.nextLine();

        // 2. Kiểm tra nếu chuỗi rỗng thì trả về chuỗi rỗng
        if (input == null || input.isEmpty()) {
            System.out.println("Chuỗi nén: \"\"");
            scanner.close();
            return;
        }

        // 3. Sử dụng StringBuilder để thực hiện nén chuỗi hiệu quả
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            // Nếu ký tự hiện tại trùng với ký tự tiếp theo, tăng biến đếm
            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                // Nếu khác hoặc đến cuối chuỗi, ghi ký tự và số lần đếm vào kết quả
                compressed.append(input.charAt(i)).append(count);
                // Reset lại biến đếm cho chuỗi/ký tự tiếp theo
                count = 1;
            }
        }

        // 4. In kết quả nén
        System.out.println("Chuỗi nén: \"" + compressed.toString() + "\"");

        scanner.close();
    }
}