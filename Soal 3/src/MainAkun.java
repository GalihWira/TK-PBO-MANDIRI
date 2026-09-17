import java.util.Scanner;

public class MainAkun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AkunGame akunSaya = new AkunGame(100);
        System.out.println("---SISTEM TOP-UP---");
        System.out.println("Gems awal anda: " + akunSaya.getJumlahGems());

        System.out.print("\nMasukkan jumlah gems yang ingin saya beli: ");
        int nominalTopUp = input.nextInt();

        System.out.println("\nMemproses transaksi...");
        akunSaya.topUpGems(nominalTopUp);

        System.out.println("Gems anda saat ini: " + akunSaya.getJumlahGems());
        input.close();
    }
}
