package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2; //Scope3_1보다 스코프가 줄어듬.
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
