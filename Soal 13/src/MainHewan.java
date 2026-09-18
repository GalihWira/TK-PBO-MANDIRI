public class MainHewan {
    public static void main(String[] args) {
        System.out.println("--- Polimorfisme ---");

        Hewan makhlukTakDikenal = new Hewan();
        makhlukTakDikenal.bersuara();

        Anjing buldog = new Anjing();
        buldog.bersuara();

        Kucing anggora = new Kucing();
        anggora.bersuara();
    }
}
