
public class Kosara extends Posoda
{
	// Polja
	private int stRdecihKrompirjev;
	private int stBelihKrompirjev;


	// Konstruktorji
	public Kosara()
	{
		super(0,0);

		stRdecihKrompirjev = 0;
		stBelihKrompirjev = 0;

		// ALI
		//this(0,0);
	}

	public Kosara(int stBelih, int stRdecih)
	{
		super(20,30);
		stRdecihKrompirjev = stRdecih;
		stBelihKrompirjev = stBelih;
	}


	// Metode

	public int getSteviloRdecihKrompirjev()
	{
		return stRdecihKrompirjev;
	}

	public int getSteviloBelihKrompirjev()
	{
		return stBelihKrompirjev;
	}

	public void setSteviloBelihKrompirjev(int stBelih)
	{
		stBelihKrompirjev = stBelih;
	}

	public void setSteviloRdecihKrompirjev(int stRdecih)
	{
		stRdecihKrompirjev = stRdecih;
	}

	// Metoda prestavi en krompir iz košare druga v trenutno košaro
	public void prestaviKrompir(byte barva, Kosara druga)
	{
		if(barva == 0)
		{
			stRdecihKrompirjev++;
			druga.stRdecihKrompirjev--;
		}
		else
		{
			stBelihKrompirjev++;
			druga.stBelihKrompirjev--;
		}
	}

	public void izpis()
	{
		System.out.println("Košara skupaj vsebuje " + stRdecihKrompirjev + " rdeèih in " + stBelihKrompirjev + " belih krompirjev.");
		System.out.println("Volumen: " + super.getVolumen());
		System.out.println("Teža: " + super.getTeza());
		System.out.println();
	}

	// Izvajanje programa
	public static void main(String[] args)
	{
		Kosara kos1 = new Kosara(5,0);
		Kosara kos2 = new Kosara(3,12);
		Kosara kos3 = new Kosara(4,10);

		System.out.println("Ustvarili smo košare: ");
		kos1.izpis();
		kos2.izpis();
		kos3.izpis();


		// Prestavi rdeèe
		while(kos2.stRdecihKrompirjev > 0)
		{
			kos1.prestaviKrompir((byte)0, kos2);
		}
		while(kos3.stRdecihKrompirjev > 0)
		{
			kos1.prestaviKrompir((byte)0, kos3);
		}

		// Prestavi bele
		while(kos1.stBelihKrompirjev > 0)
		{
			kos3.prestaviKrompir((byte)1, kos1);
		}
		while(kos2.stBelihKrompirjev > 0)
		{
			kos3.prestaviKrompir((byte)1, kos2);
		}

		System.out.println("Po prestavljanju vsebujejo: ");
		kos1.izpis();
		kos2.izpis();
		kos3.izpis();
	}
}
