package Bruch;

class Bruch 
{ 
	int zaehler; 
	int nenner; 
   
	Bruch(int z, int n) 
	{ 
	    this.zaehler=z; 
	    this.nenner=n; 
	} 
   
	void print() 
	{ 
		System.out.print(this.zaehler+"/"+this.nenner);
	} 
   
	void print(String text) 
	{ 
		System.out.print(text+this.zaehler+"/"+this.nenner); 
	} 
	
	void print(String text, int zahl)
	{
		System.out.println(zahl+" "+text+this.zaehler+"/"+this.nenner);
	}
} 