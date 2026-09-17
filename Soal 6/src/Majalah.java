public class Majalah extends Media{
    String edisi;
    String penerbit;

    public Majalah(String judul, int tahun, String edisi, String penerbit){
        super(judul, tahun);
        this.edisi = edisi;
        this.penerbit = penerbit;
    }
    @Override
    public void displayInfo(){
        System.out.println("--- Kategori: Majalah ---");
        super.displayInfo();
        System.out.println("Edisi: " + edisi + " | Penerbit: " + penerbit + "\n");
    }
}
