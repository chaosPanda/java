package Konto;

class Konto
{
	String kontoNummer;
	double kontoStand;
	String kunde;
	double habenszinssatz;

	Konto(String kontoNummer, double kontoStand, String kunde, double habenszinssatz)
	{
		this.kontoNummer = kontoNummer;
		this.kontoStand = kontoStand;
		this.kunde = kunde;
		this.habenszinssatz = habenszinssatz;
	}
	
	void ausgabe()
	{
		System.out.println("Kontonummer:\t\t" + this.kontoNummer);
		System.out.println("Kontostand:\t\t" + this.kontoStand);
		System.out.println("Kunde:\t\t\t" + this.kunde);
		System.out.println("Habenszinssatz:\t\t" + this.habenszinssatz);
	}
	
	void verzinsen()
	{
		this.kontoStand = this.kontoStand + (this.kontoStand/100*this.habenszinssatz);
	}
	
	void einzahlen(double betrag)
	{
		this.kontoStand = this.kontoStand + betrag;
	}
	
	void abheben(double betrag)
	{
		if (this.kontoStand > 0 && this.kontoStand >= betrag)
		{
			this.kontoStand = this.kontoStand - betrag;
		}
		else {
			this.fehlerGuthaben();
		}
	}
	
	void fehlerGuthaben()
	{
		System.out.println("Guthaben Ÿberschritten, Geld wird nicht ausgezahlt!");
	}
}
