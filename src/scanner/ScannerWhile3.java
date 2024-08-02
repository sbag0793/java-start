package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        while (true) {
            System.out.print("출력값에 누적할 수를 입력해주세요(0 입력시 종료):");
            double num = scanner.nextDouble();

            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("누적된 값의 총계는 " + sum + "입니다.");
    }
}
