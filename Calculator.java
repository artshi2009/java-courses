public class Calculator
{
	
	private int result;
	
	public void add(int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}
	
		public static double methodCalc(double a1, String operator, double a2)
		{
			double result = 0.d;
			switch(operator)
			{
				case "+": result = a1 + a2;
				break;
				case "-": result = a1 - a2;
				break;
				case "*": result = a1 * a2;
				break;
				case "/": result = a1 / a2;
				break;
			
			}
			return result;
		}
	
		
	
	
	public int getResult() {
		return this.result;
	}
	
	public void clearResult() {
		this.result = 0;
	} 
}