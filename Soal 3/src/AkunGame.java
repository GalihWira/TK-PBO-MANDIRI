public class AkunGame {
    private int jumlahGems;

    public AkunGame(int gemsAwal){
        this.jumlahGems = gemsAwal;
    }
    public int getJumlahGems(){
        return jumlahGems;
    }
    public void topUpGems(int tambahan){
        if(tambahan > 0){
            this.jumlahGems += tambahan;
            System.out.println("Top up berhasil! Transaksi valid.");
        }else{
            System.out.println("Status: Error! Jumlah top up tidak boleh negatif atau nol.");
        }
    }
}
