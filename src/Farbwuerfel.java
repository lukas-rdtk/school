public class Farbwuerfel extends Wuerfel {

    public String getFarbe() {
        String[] array = {"blau", "rot", "lila", "pink", "braun", "gelb"};
        return array[super.getAugen() - 1];
    }
}