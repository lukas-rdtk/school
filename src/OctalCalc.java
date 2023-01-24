public class OctalCalc {
    public static void main(String[] args) {
        int decimal = 9;
//        int octal = toOctal(decimal);
        String octal = betterToCalc(decimal);
        System.out.println("decimal= " + decimal + "\noctal= " + octal);
    }

    public static Integer toOctal(Integer decimal) {

        if (decimal < 0) {
            throw new IllegalArgumentException();
        }

        if (decimal < 8) {
            return decimal;
        }

        int octal = 0;
        int i = 1;
        while (decimal != 0) {
            octal += (decimal % 8) * i;
            decimal /= 8;
            i *= 10;
        }
        return octal;
    }

    public static String betterToCalc(Integer decimal) {
        return Integer.toOctalString(decimal);
    }
}
