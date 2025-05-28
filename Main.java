// public class main {
//     public static void main(String[] args){
//         System.out.println("Hello Abdirahman \n Welcome to Java world\n \t it isn't easy but unajituma tu at the end of the day");
//         int b = 3
//         System.out.println("Hey in how many years will you have all your life together? ", b+ " yrs");
//     }
// }
            // Simple intrest calculator
// 
        // A corrected version
//import java.security.Principal;
//import java.sql.Time;
// import java.util.Scanner;

// public class main{
//     public static void main(String args []) {
//         Scanner scanner = new Scanner(System.in);

//         // Input principal
//         System.out.print("What's the principal: ");
//         double principal = scanner.nextDouble();

//         // Interest rate (fixed for now)
//         double rate = 3.0;

//         // Input time (in years)
//         System.out.print("Duration in years: ");
//         double time = scanner.nextDouble();

//         // Calculate simple interest
//         double interest = (principal * rate * time) / 100;

//         // Output result
//         System.out.println("Here's the principal with interest: " + (principal + interest));
//     }
// }
        // creating variables
/**public class Main{
        public static void main(String[] args) {
            int num1 =300, num2 = 211, num4=800;
            int sum= num1+num2+num4;
            String boh= "Abdi", boh2="Zuhuur",boh3="Abshir",boh4="Mohammed";
            System.out.println("Hello "+ boh +" Your total water bill for this month is: "+sum);
            System.out.println("Hello "+ boh2 +" Your total water bill for this month is: "+sum);
            System.out.println("Hello "+ boh3 +" Your total water bill for this month is: "+sum);
            System.out.println("Hello "+ boh4 +" Your total water bill for this month is: "+sum);

        }
}**/
class Main {
        public static void main(String[] args) {
                final int num1=2;               // you use final to make a variable constant
                //num1=4;                         // this will cause an error because num1 is declared as final 
                System.out.println("It's an int data type: "+num1);
                float num2;
                num2=4;
                System.out.println("It's a Float data type: "+num2);
                String name="Abdirahman";
                System.out.println("Here's your name: "+ name);
                String String;
                String="Abcd";          // one can use String it's not a reserved keyword.
                System.out.println(String);
        }
}