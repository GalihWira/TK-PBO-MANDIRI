public class Akun {
    private String nomorAkun;
    private  String namaPemilik;
    private double saldo;

    public Akun(String nomorAkun, String namaPemilik, double saldo){
        this.nomorAkun = nomorAkun;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    public String getNomorAkun(){
        return nomorAkun;
    }
    public String getNamaPemilik(){
        return namaPemilik;
    }
    public double getSaldo() {
        return saldo;
    }
}