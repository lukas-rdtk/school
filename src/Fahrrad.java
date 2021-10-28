public class Fahrrad {

    String marke;
    int rahmenhoehe;
    Reifen vorne;
    Reifen hinten;

    public Fahrrad(String marke, int rahmenhoehe) {
        this.marke = marke;
        this.rahmenhoehe = rahmenhoehe;
    }

    public String getMarke() {
        return marke;
    }

    public int getRahmenhoehe() {
        return rahmenhoehe;
    }

    public Reifen getVorderrad() {
        return vorne;
    }

    public Reifen getHinterrad() {
        return hinten;
    }
}
