public class Buku extends Media{
    String penulis;
    int jumlahHalaman;

    public Buku(String judul, int tahun, String penulis, int jumlahHalaman){
        super(judul, tahun);
        this.penulis = penulis;
        this.jumlahHalaman =jumlahHalaman;
    }
    @Override
    public void displayInfo(){
        System.out.println("--- Kategori: BUKU ---");
        super.displayInfo();
        System.out.println("Penulis: " + penulis + " | Halaman: " + jumlahHalaman + "hal\n");
    }
}