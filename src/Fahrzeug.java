public class Fahrzeug {

    double gewicht;
    double laufleistung;

    public Fahrzeug(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getLaufleistung() {
        return laufleistung;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
}