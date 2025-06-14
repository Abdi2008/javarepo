import java.util.Scanner;
public class Paralellogram {
    public static void main(String[] args) {
        Scanner wantam= new Scanner(System.in);
        int base,height,area;
        System.out.println("\t \t \t AREA OF A PARALELOGRAM");
        System.out.print("Input the base of the parallelogram: ");
        base = wantam.nextInt();
        System.out.print("Input the height of the parallelogram: ");
        height = wantam.nextInt();
        area = base*height;
        System.out.println("The area of the paralelogram is : "+area);
    }
}
