        //Project 1: Simple Calculator
import java.util.Scanner;
public class Projects {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);           //i'm creating an object called scanner
        System.out.println("Input your 1st number: ");
        int num1 =scanner.nextInt();
        System.out.println("Input your 2nd number: ");
        int num2 =scanner.nextInt();
        System.out.println("Enter an operator so that you make your calculations: *,+,-,/.");
        char operator= scanner.next().charAt(0); // scanner is the object which i created .we use charAt(here you input the position of the character you wanna take , the first one is 0)
        if (operator=='*'){
            System.out.println("This is the answer "+num1*num2);
        }
        else if (operator=='+'){
            System.out.println("This is the answer: "+ num1+num2);
        }
        else if (operator=='-'){
            System.out.println(num1-num2+" This is the answer"); // Java syntax won't allow minus an addition to be done in the same sentence. you gotta make the subtraction of the intergers first then you add a string.
        }
        else if (operator=='/'){
            System.out.println("This is the answer: "+ num1/num2);
        }
    }
}
