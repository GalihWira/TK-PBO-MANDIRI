public class MainPolimorfisme {
    public static void main(String[] args) {
        System.out.println("--- 1. Overloading");
        Ksatria galih = new Ksatria();
        galih.serang();
        galih.serang("Pedang Excalibur", 500);

        System.out.println("\n--- 2. Overriding");
        Monster monsterBiasa = new Monster();
        monsterBiasa.keluarkanSuara();

        Naga hydra = new Naga();
        hydra.keluarkanSuara();
    }
}
