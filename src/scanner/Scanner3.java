package scanner;

import java.util.Scanner;

public class Scanner3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("두 수는 동일합니다.");
        } else if (num1 > num2) {
            System.out.println("더 큰 값은 " + num1 + "입니다.");
        } else {
            System.out.println("더 큰 값은 " + num2 + "입니다.");
        }
    }
}
