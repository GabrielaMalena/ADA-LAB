
public class GaleShapleyProblem{

	private int TOTAL, comprometidos; //atributos
	private String[][] hombresPrefiere;
	private String[][] mujeresPrefiere;
	private String[] hombres;
	private String[] mujeres;
	private String[] mujerEmparejada;
	private boolean[] hombreComprometido;

	public static void main(String[] args) { 
		//Lista de hombres asi como de muejres
		String[] hombres = {"Andy", "Beto", "Carlo", "Denis"};
		String[] mujeres = {"Wendy", "Xena", "Yvonne", "Zoe"};

		
		//Preferencia de los hombres segun la tabla del problema
		String[][] nameMujeres = {{ "Xena","Wendy", "Yvonne", "Zoe"}, 
				{"Yvonne", "Zoe", "Xena", "Wendy"}, 
				{"Yvonne", "Xena", "Zoe", "Wendy"}, 
				{"Wendy", "Zoe", "Yvonne", "Xena"}};


        //Preferencia de las mujeres segun la tabla del problema
		String[][] nameHombres = {{"Carlo", "", "Denis", "Beto", "Andy"}, 
				{"Carlo", "Beto", "Andy", "Denis"}, 
				{"Andy", "Beto", "Carlo", "Denis"}, 
				{"Denis", "Carlo", "Beto", "Andy"}};

		GaleShapleyProblem sc = new GaleShapleyProblem(hombres, mujeres, nameMujeres, nameHombres);                        
	}

	//definimos nuestro constructor con los hombres, mujeres
	// y la preferencia de cada uno
	public GaleShapleyProblem(String[] homb, String[] muj, String[][] hombp, String[][] mujp){
		TOTAL = hombp.length;
		comprometidos = 0;
		hombres = homb;
		mujeres = muj;
		hombresPrefiere = hombp;
		mujeresPrefiere = mujp;
		hombreComprometido = new boolean[TOTAL];
		mujerEmparejada = new String[TOTAL];
		parejasCoinciden();
	}


	private void parejasCoinciden(){
		while (comprometidos < TOTAL) {
			int soltero;
			for (soltero = 0; soltero < TOTAL; soltero++)
				if (!hombreComprometido[soltero])
					break;

			for (int i = 0; i < TOTAL && !hombreComprometido[soltero]; i++)
			{
				int lista = mujeresLista(hombresPrefiere[soltero][i]);
				if (mujerEmparejada[lista] == null)
				{
					mujerEmparejada[lista] = hombres[soltero];
					hombreComprometido[soltero] = true;
					comprometidos++;
				}
				else
				{
					String parejaActual = mujerEmparejada[lista];
					if (preferencias(parejaActual, hombres[soltero], lista))
					{
						mujerEmparejada[lista] = hombres[soltero];
						hombreComprometido[soltero] = true;
						hombreComprometido[listaHombres(parejaActual)] = false;
					}
				}
			}            
		}
		imprimirLista();
	}



	//metodo comrpobamos la pareja que prefieren h/m
	private boolean preferencias (String inicPareja, String newPareja, int lista) {
		for (int i = 0; i < TOTAL; i++) { // inicialmente se le asigna un pareja
			if (mujeresPrefiere[lista][i].equals(newPareja))
				return true;
			if (mujeresPrefiere[lista][i].equals(inicPareja))
				return false;
		}
		return false;
	}


	private int listaHombres(String str) { // lista general hombres
		for (int i = 0; i < TOTAL; i++)
			if (hombres[i].equals(str))
				return i;
		return -1;
	}


	private int mujeresLista(String str){ // lista genereal muj
		for (int i = 0; i < TOTAL; i++)
			if (mujeres[i].equals(str))
				return i;
		return -1;
	}


	public void imprimirLista() { // nuestro metodo para imprimir parejas
		System.out.println("LAS PAREJAS FORMADAS SERIAN LAS SGTES : ");
		for (int i = 0; i < TOTAL; i++){
			System.out.println(mujerEmparejada[i] +" "+ mujeres[i]);
		}
	}

}
