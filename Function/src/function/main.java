package function;

public class main
{
	public static void main(String[] args)
	{
		int order = IO.readInt("Geben Sie den Grad der Funktion an: ");
		int[] coefficients = new int[order+1];
		
		for (int i = order; i >= 0; i--)
		{
			coefficients[i] = IO.readInt("Geben Sie einen Wert für den " + i + ". Koeffizieten an: ");
		}
		
		Function function = new Function(order, coefficients);
		function.showEquation();
		double result = function.functionValue(3);
		System.out.println("Funktionswert: " + result);
		function.lookupTable(0, 20, 5);
		function.yIntercept();
	}
}
