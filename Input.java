import java.util.Scanner;
 // i want a check if i can remind my self how to ask someone their name and age
public  class Input{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in); // you create an object you can give it any name i chose to give it myobj so that i don't find it hard to understand.
        System.out.println("Enter your name: ");
        // now you initialize a variable to store the data which you collected
        String name= myObj.nextLine(); // now this is where you specify what your variable will store .nextLine() is for strings nextInt is for numbers
        //Scanner myObj2= new Scanner(System.in); // it's not a must for you to create it everytime you can use one obj
        System.out.println("Enter your age: ");
        int age = myObj.nextInt();

        System.out.println("Hey "+name+" welcome your are : "+age+"yrs old");
    }
}
