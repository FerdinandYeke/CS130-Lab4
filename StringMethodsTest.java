
public class StringMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "Change is inevitable";
		
		String mutation1, mutation2, mutation3;
		
		System.out.println(phrase);
		
		System.out.println(phrase +	" Except from vending machines");
		
		System.out.println("The Length of phrase:"
				+ " "+phrase.length());
		
		mutation1 = phrase + " Except from vending"
				+ "machines";
		
		mutation2 = mutation1.toUpperCase();
		
		mutation3 = mutation1.substring(3);
		
		System.out.println("The Length of mutation1: "
				+mutation1.length());
		System.out.println("The Length of mutation2: "
				+mutation2.length());
		System.out.println("The Length of mutation3: "
				+mutation3.length());
		
	}
}
