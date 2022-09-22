import java.util.Random;


public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		
		int num1;
		num1 = generator.nextInt(3,10);
		
		int num2;
		num2 = generator.nextInt(20,44);
		
		int num3;
		num3 = generator.nextInt(-20,30);
		
		System.out.println("The random generated number"
				+ " between 3 and 11 is: "+num1);
		System.out.println("The random generated number"
				+ " between 20 and 45 is: "+num2);
		System.out.println("The random generated number"
				+ " between -20 and 30 is: "+num3);
		
		
	}

}
