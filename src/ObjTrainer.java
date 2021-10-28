public class ObjTrainer {
    public static void main(String[] args) {
        KlasseA a1=new KlasseA();
        System.out.println(a1.calc(2));
        System.out.println(a1.calc(2,4));
        System.out.println(a1.calc(a1.calc(2, 3),4));
        System.out.println(a1.calc(a1.calc(2, 1),a1.calc()));
        }
}
