
public class Question10 {

	// Q10: What is the time complexity:O(n)
	public static void main (String[]args) {
		int n=10;
		for(int i = 0; i < n; i++) {
			if(i == 5) break;
			System.out.println(i);  // Se ejecuta hasta
		}

		for(int j = 0; j < n; j++) {
			System.out.println(j);  // Se ejecuta solo una vez
			break;
		}

	}

	/*
	 * TIEMPO DE COMPLEJIDAD: O (n2)= O(n)
	 * Explicación: Dos bucles for, uno anidado con otro. 
	 * El primer ciclo for tardará n tiempo ...
	 * los bucles necesitan n iteraciones para terminar declaraciones;
	 * considera 1 unidad de tiempo para una declaración estática
	 * tenemos dos bucles que se ejecutan uno por uno cuando ejecuta todo el programa. 
	 * Para encontrar la complejidad general de su programa, 
	 * es la suma de todas las declaraciones dentro de un programa.
	 * Complejidad del Bucle 1 + Complejidad del Bucle 2
	 * n + n
	 * 2n (no tomamos en cuenta la constante)
	 * O (n) -> consideramos solo un termino
	 */
}

}
