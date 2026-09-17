public class Karakter {
    String nama;
    int hp;

    public Karakter(String nama, int HP){
        this.nama = nama;
        this.hp = HP;
    }
    public void terimaSerangan(int damage){
        this.hp -= damage;
        System.out.println(this.nama + " terkena serangan! " + this.hp);
    }
}
