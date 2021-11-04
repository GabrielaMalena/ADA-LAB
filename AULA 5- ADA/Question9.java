
public class Question9 {

	// Q9: What is the time complexity: O(sqrt(n))
	public static void main (String[]args) {
		int n=60;
		for (int i= 0; i*i < n; i++) { //i*i
			//statement;
			System.out.println("obtenemos: " + i);
		}

	}
	
	/*
	 * TIEMPO DE COMPLEJIDAD: O(sqrt(n))
	 * el algoritmo requiere O(N^(1/2))evaluaciones donde el tamaño de la entrada es N.
	 * Si nos damos cuenta tenemos i*i que seria como un i^2 
	 * lo cual nos daria un n
	 *  i = sqrt(n)
	 * si dspejamos tendremos O(sqrt(n))
	 */
}
