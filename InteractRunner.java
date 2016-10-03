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
					System.out.print("Vvedite chislo 1: ");
					String a = vv.next();
					System.out.print("Vvedite chislo 2: ");
					String b = vv.next();
					calc.add(Integer.valueOf(a), Integer.valueOf(b));
					System.out.println("Result: " + calc.getResult());
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