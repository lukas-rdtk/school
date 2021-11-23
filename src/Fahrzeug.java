public class Fahrzeug {
    private double gewicht;
    private long laufleistung;
    public Fahrzeug(double _gewicht, long _laufleistung)  //Gebrauchtwagen
    {
        gewicht=_gewicht;
        laufleistung=_laufleistung;
    }
    public Fahrzeug(){		//Neuwagen
        laufleistung=0;
        gewicht=1000;
    }
    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public long getLaufleistung() {
        return laufleistung;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return "Laufleistung="+getLaufleistung()+" Gewicht="+getGewicht();
    }
    public void drive(int distance){
        laufleistung = laufleistung + distance;
    }

    public void drive(int time, int speed){
        laufleistung = laufleistung + time * speed;
    }
}
