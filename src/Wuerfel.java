public class Wuerfel {

    int augen;

    public int wuerfeln() {
        augen = (byte) (Math.random() * 6 + 1);
        return augen;
    }

    public int getAugen() {
        return augen;
    }
}
