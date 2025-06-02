        //Project 1: Simple Calculator
// import java.util.Scanner;
// public class Projects {
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);           //i'm creating an object called scanner
//         System.out.println("Input your 1st number: ");
//         int num1 =scanner.nextInt();
//         System.out.println("Input your 2nd number: ");
//         int num2 =scanner.nextInt();
//         System.out.println("Enter an operator so that you make your calculations: *,+,-,/.");
//         char operator= scanner.next().charAt(0); // scanner is the object which i created .we use charAt(here you input the position of the character you wanna take , the first one is 0)
//         if (operator=='*'){
//             System.out.println("This is the answer "+num1*num2);
//         }
//         else if (operator=='+'){
//             System.out.println("This is the answer: "+ num1+num2);
//         }
//         else if (operator=='-'){
//             System.out.println(num1-num2+" This is the answer"); // Java syntax won't allow minus an addition to be done in the same sentence. you gotta make the subtraction of the intergers first then you add a string.
//         }
//         else if (operator=='/'){
//             System.out.println("This is the answer: "+ num1/num2);
//         }
//     }
// }
// import java.util.Scanner;
// public class Projects{
//     public static void main(String[] args) {
//         Scanner myObj= new Scanner(System.in);
//         System.out.println("Hey What's your Name? ");
//         String myName =myObj.nextLine();
//         System.out.println("Hey "+myName+" Welcome");
//     }
// }
            // Project 2: Temperature Converter
            // Description: Convert temperature between Celsius and Fahrenheit based on user choice.
// import java.util.Scanner;
// public class Projects{
//     public static void main(String[] args){
//         Scanner obj= new Scanner(System.in);
//         System.out.println("Choose your prefered type of measurement");
//         System.out.println("1 for ");
//     }
// }
            // Project 3: Grade Calculator
            // Description: Takes a student's score and assigns a grade (A, B, C, D, F).
import java.util.Scanner;
public class Projects{
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        System.out.println("Input the points you Scored on \n \t Average so as to Determine your Grade");
        int marks = myObj.nextInt();
        char grade;
        if (marks > 100){
            System.out.println("Invalid Choice!! \n \t NUMBER TOO BIG.");
        } else if (marks >= 70){
            grade = 'A' ;
            System.out.println("You've Got Grade: "+grade); 
        } else if (marks>=60){
            grade='B';
            System.out.println("You've Got Grade: "+grade);
        } else if (marks >=50){
            grade='C';
            System.out.println("You've Got Grade: "+grade);
        } else if (marks >=40){
            grade='D';
            System.out.println("You've Got Grade: "+grade);
        } else if (marks <=39){
            grade='F';
            System.out.println("You've Got Grade: "+grade);
        }
    }
}