import java.util.Scanner;

public class PerbedaanTipeData {
    public static void main(String[] args) {

        //1. Contoh Tipe Data Primitif
        int umur = 20;
        double ipk = 3.8;
        float berat = 65.5f;
        char golonganDarah = 'A';
        boolean isMahasiswa = true;

        //2. Contoh Tipe Data Primitif
        String nama = "Galih Wira";
        double[] nilaiUjian = {80.5, 90.0, 75.5};
        Scanner input = new Scanner(System.in);

        System.out.println("--- Data Primitif ---");
        System.out.println(nama + " (Umur: " + umur + ", IPK: " + ipk + ", Berat: " + berat + ", Gol. Darah: " + golonganDarah + ", Mahasiswa: " + isMahasiswa + ")");

        System.out.println("--- Data Referensi ---");
        System.out.println("Nama (String): " + nama.toLowerCase());
        System.out.println("Nilai (Array): " + nilaiUjian[0]);
        System.out.println("Scanner Object: " + input);
        input.close();
    }
}
