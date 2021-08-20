public class Quersumme {
    public Quersumme() {
    }

    public static void main(String[] args) {
        String s = "12";
        int quersumme = qsum(s);
        System.out.println(quersumme);
    }

    public static int qsum(String s) {
        int quersumme = 0;

        for(int i = 0; i < s.length(); ++i) {
            char c = (char)Integer.parseInt(String.valueOf(s.charAt(i)));
            quersumme += c;
        }

        return quersumme;
    }
}
