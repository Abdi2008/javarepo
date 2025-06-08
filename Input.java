// import java.util.Scanner;
//  // i want a check if i can remind my self how to ask someone their name and age
// public  class Input{
//     public static void main(String[] args) {
//         Scanner myObj= new Scanner(System.in); // you create an object you can give it any name i chose to give it myobj so that i don't find it hard to understand.
//         System.out.println("Enter your name: ");
//         // now you initialize a variable to store the data which you collected
//         String name= myObj.nextLine(); // now this is where you specify what your variable will store .nextLine() is for strings nextInt is for numbers
//         //Scanner myObj2= new Scanner(System.in); // it's not a must for you to create it everytime you can use one obj
//         System.out.println("Enter your age: ");
//         int age = myObj.nextInt();

//         System.out.println("Hey "+name+" welcome your are : "+age+"yrs old");
//     }
// }
import java.util.Scanner;
class Color {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLUE_BACKGROUND="\\u001B[44m";
}
public class Input{
    public static void main(String[] args){
        Scanner myObj=new Scanner(System.in);
        System.out.println(Color.CYAN+"=============================================="+Color.RESET);
        System.out.println(Color.GREEN+"         STUDENT GRADE CALCULATOR           "+Color.RESET);
        System.out.println(Color.PURPLE+"=============================================="+Color.RESET);
        System.out.print(Color.BLUE+"Hello what's your name? "+Color.RESET);
        String fullName = myObj.nextLine();
        System.out.println("I want you to tell me all your subject marks so that i can calculate your Grade");
        System.out.print(Color.RED+"JAVA PROGRMAMMING: "+Color.RESET);
        int sub1=myObj.nextInt();
        System.out.print(Color.RED+"INTRO TO DATABASE: "+Color.RESET);
        int sub2=myObj.nextInt();
        System.out.print(Color.RED+"PRINCIPLES OF MANAGEMENT 1: "+Color.RESET);
        int sub3=myObj.nextInt();
        System.out.print(Color.RED+"SYSTEM ANALYSIS & DESIGN: "+Color.RESET);
        int sub4=myObj.nextInt();
        System.out.print(Color.RED+"QUANTATIVE METHODS: "+Color.RESET);
        int sub5=myObj.nextInt();
        System.out.print(Color.RED+"INTRO TO STRUCTURED PROGRAMMING: "+Color.RESET);
        int sub6=myObj.nextInt();
        System.out.print(Color.RED+"SOFTWARE ENGINEERING: "+Color.RESET);
        int sub7=myObj.nextInt();
        int totalMarks=sub1+sub2+sub3+sub4+sub5+sub6+sub7;
        float avgMarks=totalMarks/7;
        System.out.println(Color.CYAN+"Your total marks: "+totalMarks+Color.RESET);
        System.out.println(Color.GREEN+"\tYour average marks: "+avgMarks+Color.RESET);
        if (avgMarks>=70 && avgMarks<100) {
            System.out.println(Color.BLUE+"GRADE A"+Color.RESET);
        } else if (avgMarks>=60 && avgMarks<70) {
            System.out.println(Color.CYAN+"GARDE B"+Color.RESET);
        } else if (avgMarks>=50 && avgMarks <60) {
            System.out.println(Color.GREEN+"GRADE C"+Color.RESET);
        } else if (avgMarks>=40 && avgMarks <50){
            System.out.println(Color.YELLOW+"GRADE D"+Color.RESET);
        } else if (avgMarks<40) {
            System.out.println(Color.RED+"GRADE F"+Color.RESET);
        } else {
            System.out.println(Color.PURPLE+"Invalid choice"+Color.RESET);
        }
    }
}
