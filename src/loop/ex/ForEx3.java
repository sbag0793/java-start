package loop.ex;

public class ForEx3 {

    public static void main(String[] args) {
        int max = 15;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            System.out.println();
        }
    }
}
