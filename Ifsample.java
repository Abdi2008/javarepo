// class Ifsample {
//     public static void main(String[] args) {
//         int x,y;
//         x=30;
//         y=20;
//         if (x>y) System.out.println("X is greater than Y");
//         else System.out.println("Y is greater than X");
//     }
// }
    // i want a check if i can remind my self how to ask someone their name and age
import java.util.Scanner;
public  class Ifsample{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in); // you create an object you can give it any name i chose to give it myobj so that i don't find it hard to understand.
        System.out.println("Enter your name: ");
        // now you initialize a variable to store the data which you collected
        String name= myObj.nextLine(); // now this is where you specify what your variable will store .nextLine() is for strings nextInt is for numbers
        Scanner myObj2= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = myObj2.nextInt();
        System.out.println("Hey "+name+" welcome your are : "+age+"yrs old");
    }
}
