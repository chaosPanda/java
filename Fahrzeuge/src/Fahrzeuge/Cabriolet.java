package Fahrzeuge;

class Cabriolet extends Fahrzeug
{
	// attributes
	String mechanismus;
	String material;
	int schliessZeit;
	
	void initCabriolet(String marke, String modell, String art, int kilometer, int ps, int hoechstgeschwindigkeit, int baujahr, String farbe, int anzahlTueren, String brennstoff, double preis, String mechanismus, String material, int schliessZeit)
	{
		this.marke = marke;
		this.modell = modell;
		this.art = art;
		this.kilometer = kilometer;
		this.ps = ps;
		this.hoechstgeschwindigkeit = hoechstgeschwindigkeit;
		this.baujahr = baujahr;
		this.farbe = farbe;
		this.anzahlTueren = anzahlTueren;
		this.brennstoff = brennstoff;
		this.preis = preis;
		this.mechanismus = mechanismus;
		this.material = material;
		this.schliessZeit = schliessZeit;
	}
	
	void ausgabeCabriolet()
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
		System.out.println("Mechanismus:\t\t" + this.mechanismus);
		System.out.println("Material:\t\t" + this.material);
		System.out.println("Schlie§zeit:\t\t" + this.schliessZeit);
	}
}
