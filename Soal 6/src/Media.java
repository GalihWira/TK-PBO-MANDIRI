public class Media {
    String judul;
    int tahun;

    public Media(String judul, int tahun){
        this.judul = judul;
        this.tahun = tahun;
    }
    public void displayInfo(){
        System.out.println("Judul: " + judul + " | Tahun: " + tahun);
    }
}
