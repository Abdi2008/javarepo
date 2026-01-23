// class Ifsample {
//     public static void main(String[] args) {
//         int x,y;
//         x=30;
//         y=20;
//         if (x>y) System.out.println("X is greater than Y");
//         else System.out.println("Y is greater than X");
//     }
// }
// import java.util.Scanner;
// public class Ifsample{
//     public static void main(String[] args){
//         Scanner myObj=new Scanner(System.in);
//         int x,y;
//         System.out.println("input integer X");
//         x=myObj.nextInt();
//         System.out.println("input integer Y");
//         y=myObj.nextInt();
//         int z = x+y;
//         System.out.println("The sum is: "+z);
//     }
// }
import java.util.Scanner;
public class Ifsample{
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        int Num1,Num2;
        System.out.println("Input Num1: ");
        Num1=myObj.nextInt();
        System.out.println("Input Num2: ");
        Num2=myObj.nextInt();
        int Num =Num1+Num2;
        System.out.println("The Sum of the two numbers is: "+Num);
    }
}