package Tier;

public class TierAblauf
{
	public static void main(String[] args) 
	{
		Tier tier = new Tier();
		tier.ausgabe();
		tier.ausgabe("Ich bin ein extrem cooles Tier!");
		
		Katze katze = new Katze();
		katze.ausgabe();
		katze.ausgabe("Ich bin die Katze und hei§e Garfield!");
		
		Hund hund = new Hund();
		hund.ausgabe();
		hund.ausgabe("Ich bin der Hund und hei§e Nacho!");
	}
}
