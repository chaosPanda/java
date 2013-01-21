package Konto;

class Girokonto extends Konto
{
	double sollzinssatz;
	double dispo;
	
	Girokonto(String kontoNummer, double kontoStand, String kunde, double habenszinssatz, double sollzinssatz, double dispo)
	{
		super(kontoNummer, kontoStand, kunde, habenszinssatz);
		this.sollzinssatz = sollzinssatz;
		this.dispo = dispo;
	}
	
	void ausgabe()
	{
		super.ausgabe();
		System.out.println("Sollzinssatz:\t\t" + this.sollzinssatz);
		System.out.println("Dispo:\t\t\t" + this.dispo);
		System.out.println();
	}
	
	void verzinsen()
	{
		if (super.kontoStand > 0)
		{
			super.verzinsen();
		}
		else 
		{
			super.kontoStand = super.kontoStand + (super.kontoStand/100*this.sollzinssatz);
		}
	}
	
	void abheben(double betrag)
	{
		if (this.dispo <= (super.kontoStand-betrag))
		{
			this.kontoStand = this.kontoStand - betrag;
		}
		else
		{
			super.fehlerGuthaben();
		}
	}
}
