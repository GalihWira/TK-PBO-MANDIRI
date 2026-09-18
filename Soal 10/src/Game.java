import java.util.Random;
public class Game {
    private int angkaRahasia;
    private boolean selesai;

    public Game(){
        Random rand = new Random();
        this.angkaRahasia = rand.nextInt(100)+1;
        this.selesai = false;
    }
    public boolean isSelesai(){
        return selesai;
    }
    public void checkGuess(Player pemain, int tebakan){
        if(tebakan > angkaRahasia){
            System.out.println("Feedback: Tebakan " + pemain.getNama() + " TERLALU TINGGI");
        }else if(tebakan < angkaRahasia){
            System.out.println("Feedback: Tebakan " + pemain.getNama() + " TERLALU RENDAH");
        }else{
            System.out.println("Feedback: TEPAT SEKALI " + pemain.getNama() + " berhasil menebak angka " + angkaRahasia + "!");
            this.selesai = true;
        }
    }
}
