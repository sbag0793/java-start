package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("두 수를 입력받으면 더한 값을 반환합니다.");
            System.out.println("모두 0을 입력한다면 프로그램이 종료됩니다.");

            System.out.print("첫 번째 숫자를 입력해주세요:");
            double num1 = scanner.nextDouble();
            System.out.print("두 번째 숫자를 입력해주세요:");
            double num2 = scanner.nextDouble();

            if (num1 == 0 && num2 == 0) {
                break;
            } else {
                double sum = num1 + num2;
                System.out.println("두 수의 합은 " + sum + "입니다.");
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
