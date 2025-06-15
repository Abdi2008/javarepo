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
public class Paralellogram {
    public static void main(String[] args) {
        Scanner wantam= new Scanner(System.in);
        int base,height,area;
        System.out.println(Color.RED+"\t \t \t AREA OF A PARALELOGRAM"+Color.RESET);
        System.out.print(Color.YELLOW+"Input the base of the parallelogram: "+Color.RESET);
        base = wantam.nextInt();
        System.out.print(Color.PURPLE+"Input the height of the parallelogram: "+Color.RESET);
        height = wantam.nextInt();
        area = base*height;
        System.out.println(Color.BLUE+"The area of the paralelogram is : "+area+Color.RESET);
    }
}
