package function;

public class Function
{
	// attributes
	int order;
	int[] coefficients;
	
	Function(int order, int[] coefficients)
	{
		this.order = order;
		this.coefficients = coefficients;
	}
	
	/*
	 * showEquation
	 * zeigt die Funktionsgleichung an
	 */
	void showEquation()
	{
		System.out.print("f(x) = ");
		
		for (int i = order; i >= 0; i--)
		{
			if(coefficients[i] > 0 && i != order)
				System.out.print("+");
			
			if (i == 1)
				System.out.print(coefficients[i] + "*x ");
			else if (i != 0)
				System.out.print(coefficients[i] + "*x^" + i + " ");
			else 
				System.out.print(coefficients[i] + " ");
		}		
		System.out.println();
	}
	
	/*
	 * functionValue 
	 * gibt den Funktionswert zurück
	 * 
	 * double x - Wert der für x eingesetzt werden soll
	 */
	double functionValue(double x)
	{
		double result = 0;
		
		for (int i = order; i >= 0; i--)
		{
			double powerResult = Math.pow(x, i);
			double interimResult = coefficients[i]*powerResult;
			result = result + interimResult;
		}	
		
		return result;
	}		
	
	/*
	 * lookupTable
	 * gibt eine Wertetabelle aus
	 * 
	 * double start 	- der kleinste Wert in der Wertetabelle
	 * double end 		- der größte Wert in der Wertabelle
	 * double stepRange - die Schrittweite zwischen den einzelnen Werten 
	 */
	void lookupTable(double start, double end, double stepRange)
	{
		for (double i = start; i <= end; i = i + stepRange)
		{
			double result = this.functionValue(i);
			System.out.println();
			System.out.println("Funktionswert für x = " + i + " ist: " + result);
			System.out.println();
		}
	}
	
	/*
	 * yIntercept
	 * gibt den y-Achsenabschnitt der Funktion aus
	 */
	void yIntercept()
	{
		double result = this.functionValue(0);
		System.out.println("y-Achsenabschnitt: " + result);
	}
}
