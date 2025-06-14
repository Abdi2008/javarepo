public class Dog {
    // Class variable - shared by ALL dogs
    static int totalDogs = 5;  // Like a dog population counter
    
    // Instance variables - each dog has its own
    String name;  // Each dog's name
    String breed; // Each dog's breed
    
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        totalDogs++;  // Every new dog increases the count
    }
    
    public void bark() {
        // Local variable - only exists during bark()
        String sound = "Woof! Woof!";
        System.out.println(name + " says: " + sound);
    }
    
    public static void main(String[] args) {
        Dog d1 = new Dog("Fido", "Labrador");
        Dog d2 = new Dog("Spot", "Dalmatian");
        
        d1.bark();
        d2.bark();
        
        System.out.println("Total dogs: " + totalDogs);
    }
}