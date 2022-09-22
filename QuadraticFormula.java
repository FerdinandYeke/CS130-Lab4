import java.util.Scanner;


public class QuadraticFormula {
	
	public static void main(String []args){
		
	Scanner scan = new Scanner(System.in);
	
	int a;
	int b;
	int c;
	double x,x1;
	
	System.out.print("Enter a, b, c: ");
	a = scan.nextInt();
	b = scan.nextInt();
	c = scan.nextInt();
	
	x = -b + Math.sqrt(Math.pow(b,2)-4*a*c) / 2*a;
	x1 = -b - Math.sqrt(Math.pow(b,2)-4*a*c) / 2*a;
	
	System.out.println("The answers are: " +x + " and " +x1);
	
	
	
	}
}