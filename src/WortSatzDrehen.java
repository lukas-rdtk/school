public class WortSatzDrehen {
    public WortSatzDrehen() {
    }

    public static void main(String[] args) {
        String oroginal = "Die MMBBS ist kacke";
        System.out.println(drehDenSatz(oroginal));
    }

    private static String drehDenSatz(String s) {
        StringBuilder gedreht = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(s);
        String[] split = stringBuilder.reverse().toString().split("\\s+");

        for(int i = split.length - 1; i >= 0; --i) {
            gedreht.append(split[i]).append(" ");
        }

        return gedreht.toString();
    }
}
