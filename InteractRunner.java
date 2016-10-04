import java.util.Scanner;

public class InteractRunner 
{
	
	public static void main(String[] arg) 
	{
			Scanner vv = new Scanner(System.in);
		try
			{
				Calculator calc = new Calculator();
				String exit = "no";
				while (!exit.equals("yes")) 
				{
					System.out.print("Vvedite 1-e chislo: ");
					double a = vv.nextDouble();
					System.out.print("Vvedite deistvie: ");
					String operator = vv.next();
					System.out.print("Vvedite 2-e chislo: ");
					double b = vv.nextDouble();
					System.out.println("Result: " + calc.methodCalc(a, operator, b));
					calc.clearResult();
					System.out.print("Exit(yes/no): ");
					exit = vv.next();
						
				}
				
			}
		finally
		{
			vv.close();
		}
				
	}
	
}