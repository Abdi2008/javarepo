import java.util.Scanner;
public class Student {
    String fullname, course;
    double invoice, amountpaid;
    // constructor 
    Student (String fullname,String course, double invoice, double amountPaid) {
        this.fullname=fullname;
        this.course=course;
        this.invoice=invoice;
        this.amountpaid=amountPaid;
    }
    public double CalcBal(){
        return invoice - amountpaid;
    }
    public void displayDetails() {
        System.out.println("Student Details \n"+fullname+"\t"+course+"\t Balance: "+CalcBal());
    }
    public static void main(String[] args) {
        Scanner myObj= new Scanner(System.in);
        Student s1 = myObj.nextLine();
        s1.displayDetails();
        Student s2 = new  Student("KEVIN","CIT",500,500);
        s2.displayDetails();
        Student s3 = new  Student("ABIOLA","BIT",4520,4520);
        s3.displayDetails();
        Student s4 = new  Student("FRANKLIN","BBIT",400,400);
        s4.displayDetails();
    }
}
