import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] arg) {
	System.out.println("Calculate, please wait...");
		
			Scanner vv = new Scanner(System.in);
		
				System.out.print("Vvedite chislo 1: ");
				double a = vv.nextDouble();
				System.out.print("Vvedite chislo 2: ");
				double b = vv.nextDouble();
				double c = a + b;
				System.out.println("Summ: " + c);
	}
	
}