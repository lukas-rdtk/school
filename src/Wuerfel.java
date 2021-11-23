public class Wuerfel {
    private int augen;
    private int Seitenanzahl;

    public Wuerfel() {
        Seitenanzahl=6;
    }
    public Wuerfel(int s) {
        Seitenanzahl=s;
    }
    public void wuerfeln() {
        augen = (int)(Math.random()*Seitenanzahl+1);
    }

    public int getAugen() {
        return augen; /* Augen zurueck*/
    }
}

