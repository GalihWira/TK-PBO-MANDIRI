public class Mage extends Hero{
    int mana;

    public Mage(String nama, int mana){
        // Menggunakan 'super' untuk memanggil constructor milik kelas induk (Hero)
        super(nama);
        this.mana = mana;
    }
    @Override
    public void cetakInfo(){
        // Menggunakan 'super' untuk menjalankan method asli cetakInfo() dari kelas induk
        super.cetakInfo();
        System.out.println("Jumlah mana : " + this.mana);
    }
}
