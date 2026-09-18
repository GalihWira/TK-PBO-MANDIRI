import java.util.ArrayList;
public class Bank {
    private String namaBank;
    private ArrayList<Akun> daftarAkun;

    public Bank(String namaBank){
        this.namaBank = namaBank;
        this.daftarAkun = new ArrayList<>();
    }
    public void menambahAkun(Akun akunBaru){
        daftarAkun.add(akunBaru);
        System.out.println("Nasabah atas nama " + akunBaru.getNamaPemilik() + " berhasil didaftarkan");
    }
    public Akun mencariAkun(String nomor){
        for(Akun akun : daftarAkun){
            if(akun.getNomorAkun().equals(nomor)){
                return akun;
            }
        }
        return null;
    }
    public void menampilkanSemuaAkun(){
        System.out.println("\n--- Daftar Akun di " + this.namaBank + "---");
        if(daftarAkun.isEmpty()){
            System.out.println("Belum ada akun yang terdaftar.");
        }else{
            for(Akun akun : daftarAkun){
                System.out.println("No: " + akun.getNomorAkun() + "| Nama: " +akun.getNamaPemilik() + " | Saldo: Rp" + akun.getSaldo());
            }
        }
    }
}
