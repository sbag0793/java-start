package variable;

public class Var8 {

    public static void main(String[] args) {
        //정수
        byte b = 127; //-128 ~ 127 (1byte)
        short s = 32767; //-32,767 ~ 32,767 (2byte)
        int i = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 21.4억) (4byte)

        //-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (8byte)
        long l = 9223372036854775807L;

        //실수
        float f = 10.0f; //(4byte)
        double d = 10.0; //(8byte)
    }
}
