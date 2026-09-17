public class MainGame {
    public static void main(String[] args) {
        Karakter hero = new Karakter("Galih", 100);
        System.out.println(hero.nama + " HP awal: " + hero.hp);
        hero.terimaSerangan(25);
    }
}
