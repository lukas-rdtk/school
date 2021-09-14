public class Spardose {
    private final int ziel;
    private int betrag = 0;

    public Spardose(double zielEuro) {
        this.ziel = (int) (zielEuro * 100);
    }

    public Spardose(int zielCent) {
        this.ziel = zielCent;
    }

    public void einzahlen(double betragEuro) {
        this.betrag += (int) (betragEuro * 100);
    }

    public void einzahlen(int betragCent) {
        this.betrag += betragCent;
    }

    public boolean sparzielErreicht() {
        return betrag >= ziel;
    }

    public double getCent() {
        return betrag;
    }
}