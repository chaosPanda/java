package Fahrzeug;

class Transporter extends Fahrzeug
{
	// attributes
	int laderaumLaenge;
	int laderaumBreite;
	int laderaumHoehe;
	
	Transporter(String marke, String modell, String art, int kilometer, int ps, int hoechstgeschwindigkeit, int baujahr, String farbe, int anzahlTueren, String brennstoff, double preis, int laderaumLaenge, int laderaumBreite, int laderaumHoehe)
	{
		super(marke, modell, art, kilometer, ps, hoechstgeschwindigkeit, baujahr, farbe, anzahlTueren, brennstoff, preis);
		this.laderaumLaenge = laderaumLaenge;
		this.laderaumBreite = laderaumBreite;
		this.laderaumHoehe = laderaumHoehe;
	}
	
	void ausgabeTransporter()
	{
		System.out.println("Marke:\t\t\t" + this.marke);
		System.out.println("Modell:\t\t\t" + this.modell);
		System.out.println("Art: \t\t\t" + this.art);
		System.out.println("Kilometer:\t\t" + this.kilometer);
		System.out.println("PS:\t\t\t" + this.ps);
		System.out.println("Hšchstgeschwindigkeit:\t" + this.hoechstgeschwindigkeit);
		System.out.println("Baujahr:\t\t" + this.baujahr);
		System.out.println("Farbe:\t\t\t" + this.farbe);
		System.out.println("Anzahl der TŸren:\t" + this.anzahlTueren);
		System.out.println("Brennstoff:\t\t" + this.brennstoff);
		System.out.println("Preis:\t\t\t" + this.preis);
		System.out.println("Laderaum LŠnge:\t\t" + this.laderaumLaenge);
		System.out.println("Laderaum Breite:\t" + this.laderaumBreite);
		System.out.println("Laderaum Hšhe:\t\t" + this.laderaumHoehe);
	}
}
