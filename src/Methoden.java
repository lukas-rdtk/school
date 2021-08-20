public class Methoden {
    public Methoden() {
    }

    public static void main(String[] args) {
        int[] x = new int[]{4, 2, 3, 1};
        int y = 2;
        add(x, y);
        int[] a = add(add(x, y), y);
    }

    public static int[] add(int[] a, int b) {
        for(int i = 0; i < a.length; ++i) {
            a[i] += b;
        }

        return a;
    }
}
