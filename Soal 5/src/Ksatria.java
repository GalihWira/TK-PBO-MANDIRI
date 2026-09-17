public class Ksatria {
    public void serang(){
        System.out.println("Ksatria memukul musuh! (Damage: 50)");
    }
    public void serang(String senjata, int damage){
        System.out.println("Ksatria menebas musuh dengan " + senjata + "! (Damage: " + damage + ")");
    }
}