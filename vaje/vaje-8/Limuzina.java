public class Limuzina extends Avto
{
	int steviloSedezev;
	double dolzina;

	public Limuzina()
	{
		steviloSedezev = 8;
		dolzina = 13.4;

		// Èe ne uporabimo konstruktorja nadrazreda,
		// lahko vrednost lastnostim nadrazreda nastavimo
		// s set metodami
		setPrestava(5);
		setHitrost(80);
	}

	public Limuzina(int stSed, double dol)
	{
		steviloSedezev = stSed;
		dolzina = dol;
	}

	public void izpisiPodatke()
	{
		System.out.println("TIP: Limuzina");
		super.izpisiPodatke();	// Klic metode izpisiPodatke() v nadrazredu razreda Kabriolet
		System.out.println("Število sedežev: " + steviloSedezev);
		System.out.println("Dolžina: " + dolzina);
		System.out.println();
	}
}