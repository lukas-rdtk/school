public class Reifen {

    int durchmesser;
    double luftdruck;

    public Reifen(int durchmesser) {
        this.durchmesser = durchmesser;
    }

    public void aufpumpen() {
        luftdruck += 0.1;
    }

    public int getDurchmesser() {
        return durchmesser;
    }

    public double getLuftdruck() {
        return luftdruck;
    }
}
