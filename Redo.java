import  java.util.Scanner;
public class Redo {
    public static void main(String[] args) {
        System.out.println("\t \t Hey Abdirahman\n INPUT YOUR MARKS FOR THIS SEMESTER");
        Scanner myObj= new Scanner(System.in);
        System.out.print("JAVA: ");
        int sub1=myObj.nextInt();
        System.out.print("DATABSE: ");
        int sub2=myObj.nextInt();
        System.out.print("PRINCIPLES OF MANAGEMENT: ");
        int sub3=myObj.nextInt();
        System.out.print("SYSTEM DESIGN: ");
        int sub4=myObj.nextInt();
        System.out.print("QUANTATIVE METHODS: ");
        int sub5=myObj.nextInt();
        System.out.print("INTRO TO STRUCTURED PROGRAMMING: ");
        int sub6=myObj.nextInt();
        System.out.print("SOFTWARE ENGINEERING: ");
        int sub7=myObj.nextInt();
        int sub=sub1+sub2+sub3+sub4+sub5+sub6+sub7;
        System.out.println("The Total Marks is : "+sub);
        int avsub=sub/7;
        System.out.println("The Average Marks is : "+avsub);
        if (avsub>=70 && avsub<100) {
            System.out.println("A");
        }else if(avsub>=60 && avsub<70){
            System.out.println("B");
        }else if(avsub>=50 && avsub<60){
            System.out.println("C");
        }else if(avsub>=40 && avsub<50){
            System.out.println("D");
        }else if(avsub>=0 && avsub<40){
            System.out.println("F");
        }else{
            System.out.println("INVALID CHOICE");
        }
    }
}
