package Konto;

public class Ablauf
{
	public static void main(String[] args)
	{
		Girokonto girokonto;
		Extrakonto extrakonto;
		Sparkonto sparkonto;
		
		girokonto = new Girokonto("0123233101232", -800.00, "Michael Greulich", 1.0, 10, -1000);
		extrakonto = new Extrakonto("343243121", 20000.00, "Hans Wurst", 1.0, "0123233101232");
		sparkonto = new Sparkonto("39593294234", 5000.00, "Bruce Lee", 2.0, 1358764346);
		
		girokonto.ausgabe();
		girokonto.verzinsen();
		girokonto.abheben(2000);
		girokonto.ausgabe();
		
		extrakonto.ausgabe();
		extrakonto.abheben(20001);
		extrakonto.ausgabe();
		/*
		sparkonto.ausgabe();
		sparkonto.sperrfristAendern(1358764400);
		sparkonto.abheben(6000, 1358764900);
		sparkonto.ausgabe();
		*/
	}
}
