public class Cat {
    String names="Lisa";

    public void sound(){
        System.out.println("meoww!!");
    }
    public static  void main(String[] args) {
        Cat myCat = new Cat();
        myCat.sound();
        System.out.println("This Cat named: "+myCat.names+" produces this sound: "+ myCat.sound);
    }
    
}
    