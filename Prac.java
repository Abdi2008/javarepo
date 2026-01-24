// import java.util.Random;
// import java.util.Scanner;
// public class Prac{
//     public static void main(String[] args) {
//         Scanner myScanner= new Scanner(System.in);  //Creating a Scanner Object
//         Random rand = new Random();                 //Creating a Random object 
//         System.out.print("Hey welcome to THEE ARENA \n  \t Let's play a game with the computer \n    \t \t choose between rock,scissor,paper: ");
//         String myChoice= myScanner.nextLine().toLowerCase();
//         //Random computer;
//         String[] options={"rock","paper","scissor"};      //an array
//         String botChoice=options[rand.nextInt(options.length)]; //rand.nextInt(options.length) generates a random number: 0, 1, or 2.
//         if((myChoice.equals(botChoice))){
//             System.out.println("It's a draw!");
//         }
//         else if (myChoice.equals("rock") && botChoice.equals("paper")||
//         (myChoice.equals("paper") && botChoice.equals("scissor"))||
//         (myChoice.equals("scissor") && botChoice.equals("rock"))){
//             System.out.println("Bot Wins!");
//         } else if ((myChoice.equals("rock") && botChoice.equals("scissor"))||
//         (myChoice.equals("paper") && botChoice.equals("rock"))||
//         (myChoice.equals("scissor") && botChoice.equals("paper"))){
//             System.out.println("You Win!!");
//         } else{
//             System.out.println("Invalid Choice!!");
//         }
//         myScanner.close();
//         System.out.println("Bot chose: " + botChoice);  //This prints what the bot chose
//     }
// }
public class Prac{
    public static void main(String[] args) {
        int[] myArray={200,700,54,87,32};
        System.out.println(myArray[2]);
        int i = 0;
        while (i<5) { 
            System.out.println("This is the value of i: "+i);
            i++;
        }
        int countdown=3;
        while (countdown>0) { 
            System.out.println("Countdown: "+countdown);
            countdown--;
        }
        System.out.println("\t \tHappy new Year");
        int b=0;
        do { 
            System.out.println("b is : "+b);
            b++;
        } while (b<5);
        int sum =0;
        for(int i= 1;i<=5;i++){
            System.out.println("The numbers are: "+i);
            sum=sum+i;
        }
        System.out.println("The sum is: "+sum);
                // Let's say a question asks you to do the sum of the even numbers from 0-30
    
    }
}