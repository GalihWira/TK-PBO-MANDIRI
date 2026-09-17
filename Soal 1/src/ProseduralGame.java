public class ProseduralGame {
    public static void main(String[] args) {
        String namaKarakter = "Galih";
        int hpKarakter = 100;
        System.out.println(namaKarakter + " HP awal: " + hpKarakter);

        hpKarakter = terimaSerangan(hpKarakter, 25);
        System.out.println(namaKarakter + " terkena serangan! Sisa HP: " + hpKarakter);
    }
    public static int terimaSerangan(int hpSekarang, int damage){
        return hpSekarang - damage;
    }
}