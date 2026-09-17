public class MainPerpustakaan {
    public static void main(String[] args) {
        Buku bukuPBO = new Buku("Pemrograman Java Dasar", 2023, "Kinan", 450);
        Majalah majalahIT = new Majalah("InfoKomputer", 2026,"Edisi Agustus", "Gramedia");
        DVD dvdTutorial = new DVD("Mastering JavaFx", 2024, "Kinan", 180);

        bukuPBO.displayInfo();
        majalahIT.displayInfo();
        dvdTutorial.displayInfo();
    }
}
