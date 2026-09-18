public class MainBuku {
    public static void main(String[] args) {
        Buku[] rakBuku = new Buku[3];

        rakBuku[0] = new Buku("Belajar Java", "Kinanta", 2026);
        rakBuku[1] = new Buku("Belajar C++", "Galih", 2019);
        rakBuku[2] = new Buku("Belajar Python", "Gung Yuda", 2018);

        rakBuku[0].setTahunTerbit(2008);
        System.out.println("--- DAFTAR RAK BUKU ---");
        for(int i = 0; i < rakBuku.length; i++){
            System.out.println("- " + rakBuku[i].getJudul() + " | Oleh: " + rakBuku[i].getPengarang() + " | Tahun: " + rakBuku[i].getTahunTerbit());
        }
    }
}
