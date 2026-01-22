// class Ifsample {
//     public static void main(String[] args) {
//         int x,y;
//         x=30;
//         y=20;
//         if (x>y) System.out.println("X is greater than Y");
//         else System.out.println("Y is greater than X");
//     }
// }
import java.util.Scanner;
public class Ifsample{
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        int x,y;
        System.out.println("input integer X");
        x=myObj.nextInt();
        System.out.println("input integer Y");
        y=myObj.nextInt();
        int z = x+y;
        System.out.println("The sum is: "+z);
    }
}
