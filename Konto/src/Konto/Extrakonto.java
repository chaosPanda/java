package Konto;

class Extrakonto extends Konto
{
	String referenzkontoNummer;
	
	Extrakonto(String kontoNummer, double kontoStand, String kunde, double habenszinssatz, String referenzkontoNummer)
	{
		super(kontoNummer, kontoStand, kunde, habenszinssatz);
		this.referenzkontoNummer = referenzkontoNummer;
	}
	
	void ausgabe()
	{
		super.ausgabe();
		System.out.println("Referenzkontonummer:\t" + this.referenzkontoNummer);
		System.out.println();
	}
}
