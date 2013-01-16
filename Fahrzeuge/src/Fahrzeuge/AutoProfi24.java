package Fahrzeuge;

public class AutoProfi24
{
	public static void main(String[] args)
	{
		Cabriolet cabriolet1;
		Transporter transporter1;
		
		cabriolet1 = new Cabriolet();
		transporter1 = new Transporter();
		
		cabriolet1.initCabriolet("Volkswagen", "C11", "Sportwagen", 34, 120, 310, 2010, "violett", 3, "Diesel", 30000, "vollautomatisch", "Stoff", 5);
		transporter1.initTransporter("Fiat", "Ducato", "Ranzkarre", 9001, 100, 100, 1992, "schwarz", 5, "Blut", 200, 1, 2, 1);
		cabriolet1.ausgabeCabriolet();
		System.out.println();
		System.out.println();
		transporter1.ausgabeTransporter();
	}
}
