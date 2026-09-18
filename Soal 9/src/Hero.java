public class Hero {
    String nama;

    public Hero(String nama){
        // Menggunakan 'this' untuk menegaskan bahwa 'this.nama' adalah
        // atribut kelas, sedangkan 'nama' adalah nilai dari parameter.
        this.nama = nama;
    }
    public void cetakInfo(){
        System.out.println("Nama Karakter: " + this.nama);
    }
}