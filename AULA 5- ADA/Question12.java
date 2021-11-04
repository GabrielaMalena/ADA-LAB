
public class Question12 {

	// Q12: What is the time complexity: O(n*log2(n))
	public static void main (String[]args) {
		int n=20; // indicamos este numero
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j = j * 2) {
				//statement;
				System.out.println("ADA - Laboratory: " + i + " y " + j); //para imprimir
			}
		}

	}
	
	/*
	 * TIEMPO DE COMPLEJIDAD: O(n*log2(n))
	 * El tiempo de ejecución crece en proporción an log n de la entrada:
	 * Por ejemplo, si  n es 8, entonces este algoritmo se ejecutará 8 * log (8) = 8 * 3 = 24 veces.
	 * Ahora si tenemos una desigualdad en el ciclo for es irrelevante una notación Big O.
	 * Desde ya este for aninado tiene un tiempo de n log n 
	 * Ahora nosotros incluimos 2 ala repsuesta porque
	 * La complejidad del tiempo se convierte en O (log n).
	 * El ciclo se ejecuta para n iteraciones 
	 * i se incrementa en un factor de 2, (segundo for)
	 */
}
