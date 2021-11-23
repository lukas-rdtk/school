public class Fahrzeugmarke extends Fahrzeug {
    Double preis;
    String hersteller;

    public Fahrzeugmarke(Double preis, String hersteller) {
        this.preis = preis;
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return " Preis=" + preis +
                "Name=" + hersteller +
                " Laufleistung=" + super.getLaufleistung() +
                " Gewicht=" + super.getGewicht();
    }
}