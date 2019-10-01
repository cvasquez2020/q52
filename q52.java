import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	
	System.out.print("enter top: ");
        double top = in.nextDouble();
	System.out.print("enter bottom: ");
	double bottom = in.nextDouble();
	
	System.out.print("enter height: ");
	double height = in.nextDouble();
	
	double area = height*((top+bottom)/2);

	
	
	System.out.print("The area of the trapezoid is ");
	System.out.printf("%.1f", area);
	System.out.print(".");
        in.close();
    }
}