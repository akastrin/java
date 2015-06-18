
public class Kabrio extends Avto
{
	boolean strehaGor;
	boolean zadnjiSedezi;

	public Kabrio()
	{
		//super(1, 0, "Neznana", 250);
		strehaGor = false;
		zadnjiSedezi = true;


		// Èe ne uporabimo konstruktorja nadrazreda,
		// lahko vrednost lastnostim nadrazreda nastavimo
		// s set metodami
		setPrestava(5);
		setHitrost(80);
	}

	public Kabrio(boolean stGor, boolean zadnjiSed)
	{
		strehaGor = stGor;
		zadnjiSedezi = zadnjiSed;
	}

	public void izpisiPodatke()
	{
		System.out.println("TIP: Kabriolet");
		super.izpisiPodatke();	// Klic metode izpisiPodatke() v nadrazredu razreda Kabriolet
		System.out.println("Streha gor: " + strehaGor);
		System.out.println("Zadnji sedeži: " + zadnjiSedezi);
		System.out.println();
	}
}