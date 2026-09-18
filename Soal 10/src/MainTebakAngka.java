import java.util.Scanner;
public class MainTebakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- GAME TEBAK ANGKA (1-100) ---");
        System.out.print("Masukkan nama Player: ");
        String namaPemain = input.nextLine();

        Player player1 = new Player(namaPemain);
        Game sesiGame = new Game();

        System.out.println("\nGame dimulai! Sistem telah menyimpan angka rahasia!");
        while(!sesiGame.isSelesai()){
            System.out.print("\nMasukkan tebakan Anda: ");
            int tebakan = input.nextInt();
            if(tebakan < 1 || tebakan > 100){
                System.out.println("Peringatan: Angka tidak valid! Harap masukan angka 1 hingga 100");
                continue;
            }
            sesiGame.checkGuess(player1, tebakan);
        }
        System.out.println("Terima kasih telah bermain!");
        input.close();
    }
}
