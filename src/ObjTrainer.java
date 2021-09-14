public class ObjTrainer {
    public static void main(String[] args) {
            Flasche f1 = new Flasche();
            f1.setInhalt("Cola");
            Flasche f2 = new Flasche();
            Flasche f3 = new Flasche();
            f1.setVolumen(1.0);
            f2.setInhalt("Fanta");
            f3.setInhalt(f1.getInhalt());
            f2.setVolumen(0.5);
            f3.setVolumen(f1.getVolumen()+f2.getVolumen());
            f2.setInhalt(f1.getInhalt());

        System.out.println(f1.getVolumen());
        System.out.println(f1.getInhalt());

        System.out.println("------------------");

        System.out.println(f2.getVolumen());
        System.out.println(f2.getInhalt());

        System.out.println("------------------");

        System.out.println(f3.getVolumen());
        System.out.println(f3.getInhalt());
        }
}
