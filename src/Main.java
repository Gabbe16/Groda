public class Main {
    public static void main(String[] args) {
        Groda grodis = new Groda(10,5,20, 0x008000);
        grodis.Croack();
        Groda jens = new Groda(20,10,40, 0xFFFF00);
        jens.Eat();
    }
}