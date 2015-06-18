/*
 *	Razred Avto opisuje nekaj lastnosti in funkcionalnosti avtomobila
 */
public class Avto
{
	// Polja

	private int prestava;
	private double hitrost;
	private String registracija;
	private double maksimalnaHitrost;

	private static int steviloKoles = 4;
	//private static final int steviloKoles = 4;

	// Konstruktorji:
	// Imajo enako ime kot razred,
	// izvedejo se ob uporabi kljuène besede new.
	// Uporabljamo jih za zaèetne nastavitve stanj objektov
	public Avto()
	{
		prestava = 1;
		hitrost = 0;
		registracija = "Neznana";
		maksimalnaHitrost = 163.5;
	}

	public Avto(int zacPrestava, double zacHitrost, String zacRegistracija)
	{
		prestava = zacPrestava;
		hitrost = zacHitrost;
		registracija = zacRegistracija;
		maksimalnaHitrost = 163.5;
	}

	public Avto(int zacPrestava, double zacHitrost, String zacRegistracija, double zacMaksimalnaHitrost)
	{
		prestava = zacPrestava;
		hitrost = zacHitrost;
		registracija = zacRegistracija;
		maksimalnaHitrost = zacMaksimalnaHitrost;
	}


	// Metode

	// Metode tipa get nam vrnejo vrednosti polj
	public int getPrestava()
	{
		return prestava;
	}

	public double getHitrost()
	{
		return hitrost;
	}

	public double getMaksimalnaHitrost()
	{
		return maksimalnaHitrost;
	}

	public String getRegistracija()
	{
		return registracija;
	}

	// Metode tipa set spremenijo vrednost polja
	public void setRegistracija(String novaRegistracija)
	{
		registracija = novaRegistracija;
	}

	public void setMaksimalnaHitrost(double maks)
	{
		maksimalnaHitrost = maks;
	}

	public void setPrestava(int prest)
	{
		prestava = prest;
	}

	public void setHitrost(double hit)
	{
		hitrost = hit;
	}

	public void pospesi(double pospesek)
	{
		if(hitrost + pospesek > maksimalnaHitrost)
		{
			System.out.println("Opa, tole bo pa prehitro zame! Moja maksimalna hitrost je " + maksimalnaHitrost);
			hitrost = maksimalnaHitrost;
			prestava = 5;
			return;
		}

		hitrost += pospesek;

		if(hitrost < 20)
		{
			prestava = 1;
		}
		else if(hitrost < 40)
		{
			prestava = 2;
		}
		else if(hitrost < 60)
		{
			prestava = 3;
		}
		else if(hitrost < 90)
		{
			prestava = 4;
		}
		else
		{
			prestava = 5;
		}
	}

	public void izpisiPodatke()
	{
		System.out.println("***   Podatki   ***");
		System.out.println("Prestava: " + getPrestava() + ".");
		System.out.println("Hitrost: " + getHitrost() + " km/h");
		System.out.println("Maksimalna hitrost: " + getMaksimalnaHitrost() + " km/h");
		System.out.println("Registracija: " + getRegistracija());
		System.out.println("Število koles:" + steviloKoles);
		System.out.println();
	}

	// Izvajanje programa
	public static void main(String[] args)
	{
		// Naredimo konstruktorja dveh avtomobilov
		//Avto nasAvto = new Avto();
		//Avto sosedovAvto = new Avto(5, 130, "NM-XY-001");

		// Izpišimo podatke
		//nasAvto.izpisiPodatke();
		//sosedovAvto.izpisiPodatke();

		Kabrio kab = new Kabrio();
		kab.izpisiPodatke();

		Limuzina lim = new Limuzina(6, 12.4);
		lim.izpisiPodatke();
	}
}

