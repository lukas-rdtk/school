public class Wuerfel {

    int augen;

    public Wuerfel() {
        wuerfeln();
    }

    public void wuerfeln() {
        augen = (byte) (Math.random() * 6 + 1);
    }

    public int getAugen() {
        return augen;
    }
}
