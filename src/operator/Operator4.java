package operator;

public class Operator4 {

    public static void main(String[] args) {

        int sum3 = 2 * 2 + 3 * 3; //(2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); //sum3과 동일하지만 명시적으로 괄호를 사용하는게 유지보수에 수월하다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
