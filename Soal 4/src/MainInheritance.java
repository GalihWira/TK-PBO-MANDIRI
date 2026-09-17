public class MainInheritance {
    public static void main(String[] args) {
        Zombie zombiesatu = new Zombie();
        
        zombiesatu.nama = "Zombie 1";
        zombiesatu.hp = 150;
        zombiesatu.kecepatanJalan = 5;

        zombiesatu.muncul();
        zombiesatu.gigit();
    }
}
