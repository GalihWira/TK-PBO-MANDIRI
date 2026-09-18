public class MainBank {
    public static void main(String[] args) {
        Bank bankUdayana = new Bank("Bank Udayana Jaya");

        Akun akun1 = new Akun("888001", "Galih Wira", 5000000.0);
        Akun akun2 = new Akun("8888002", "Satya Kinanta", 3500000.0);

        bankUdayana.menambahAkun(akun1);
        bankUdayana.menambahAkun(akun2);

        bankUdayana.menampilkanSemuaAkun();

        String nomorCarian = "888001";
        System.out.println("Mencari data nasabah dengan nomor: " + nomorCarian + "...");

        Akun hasilPencarian = bankUdayana.mencariAkun(nomorCarian);

        if(hasilPencarian != null){
            System.out.println("Data Ditemukan! -> Pemilik: " + hasilPencarian.getNamaPemilik() + ", Saldo: Rp" + hasilPencarian.getSaldo());
        }else{
            System.out.println("Data dengan nomor akun tersebut tidak ditemukan.");
        }
    }
}

