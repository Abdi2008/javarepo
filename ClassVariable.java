class Color {               //ignore this it's just i'm inputing colors to the output
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
}
public class ClassVariable {
    static int classCount =0;   // class variables  you can use this code in any instance
    String name; // instance variables
    String location;    //instance variables
    int age;
    public ClassVariable (String name,String location,int a){       //This is a constructor it is used to initialize an object's initial status
        this.name=name;
        this.location=location;
        age=a; // you can use nicknames to avoid repetion of code like the lines above
        classCount++;   // This number goes up after every student entry
    }
    public void display(){
        System.out.println(Color.BLUE+"My Name is "+name+" I live in "+location+" My Age is "+age+Color.RESET);
    }
    public static void main(String[] args) {
        ClassVariable student1 = new ClassVariable("Abdirahman", "Nairobi", 23); // Constructor runs here when you use new
        ClassVariable student2 = new ClassVariable("Kinuthia", "Kiambu", 24);
        student1.display(); //i'm displaying the output
        student2.display(); //i'm displaying the output
        int CAT=2;  //local variable
        System.out.println(Color.RED+"\t\t Total students in the class: "+classCount+Color.RESET);
        System.out.println(Color.GREEN+"This is our CAT"+CAT+Color.RESET);
    }
}
