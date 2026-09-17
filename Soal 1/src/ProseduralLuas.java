public class ProseduralLuas {
    public static void main(String[] args) {
        double radius = 10.0;
        double hasil = kalkulasiLuas(radius);
        System.out.println("Luas: " + hasil);
    }
    public static double kalkulasiLuas(double r){
        return Math.PI * r * r;
    }
}