package Konto;

class Sparkonto extends Konto
{
	int sperrfrist;
	
	Sparkonto(String kontoNummer, double kontoStand, String kunde, double habenszinssatz, int sperrfrist)
	{
		super(kontoNummer, kontoStand, kunde, habenszinssatz);
		this.sperrfrist = sperrfrist;
	}
	
	void ausgabe()
	{
		super.ausgabe();
		System.out.println("Sperrfrist:\t\t" + this.sperrfrist);
		System.out.println();
	}
	
	void sperrfristAendern(int sperrfrist)
	{
		this.sperrfrist = sperrfrist;
	}
	
	void abheben(double betrag, int time)
	{
		if (this.sperrfrist >= time)
		{
			System.out.println("Sperrfrist nicht abgelaufen, Geld wird nicht ausgezahlt!");
		}
		else if (super.kontoStand <= betrag)
		{
			super.fehlerGuthaben();
		}
		else
		{
			super.kontoStand = super.kontoStand - betrag;
		}
	}
}