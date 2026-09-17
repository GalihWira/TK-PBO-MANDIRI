public class DVD extends Media{
    String sutradara;
    int durasiMenit;

    public DVD(String judul, int tahun, String sutradara, int durasiMenit){
        super(sutradara, durasiMenit);
        this.sutradara = sutradara;
        this.durasiMenit = durasiMenit;
    }
    @Override
    public void displayInfo(){
        System.out.println("--- Kategori: DVD ---");
        super.displayInfo();
        System.out.println("Sutradara: " + sutradara + " | Durasi: " + durasiMenit + " menit\n");
    }
}
