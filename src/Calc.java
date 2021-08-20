public class Calc {
    public Calc() {
    }

    public static void main(String[] args) {
        int b = calc(2, 2);
        System.out.println(b);
        int c = calc(b, 2);
        System.out.println(c);
        int d = calc(calc(2, 2), calc(2, 1));
        System.out.println(d);
    }

    public static int calc(int a, int b) {
        return a < b ? a * b : a + b;
    }
}
