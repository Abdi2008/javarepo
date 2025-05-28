            //System.out.println("Hey This is my second ever file of java i'm happy!!");
// public class zero {
//     public static void main(String[] args){
//         // double myNum= 4.98d;
//         // int myNum2 = (int) myNum;
//         // System.out.println(myNum);
//         // System.out.println(myNum2);
//         int user_max_score=100;     // State the max score
//         int user_score=61;          // State the actual score
//         System.out.println("\t\tThis is the maximum Score one Can Score: "+ user_max_score);
//         System.out.println("\tThis is the user's Score: "+ user_score);
//         // We should look the percantage the user got
//         float percantage= (float) user_score/user_max_score * 100.0f;
//         System.out.println("The percent the user got: "+ percantage+"%");
//     }
// }
import java.util.Scanner;

public class zero{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //check if a number is even or odd
        System.out.println("Input a number to check if it's even or odd: ");
        int num = scanner.nextInt();
        if (num%2==0) {
            System.out.println("Even number");
        } else{
            System.out.println("Odd Number");
        }

    }
}