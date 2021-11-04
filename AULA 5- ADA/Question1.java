
public class Question1 {
	
	// Review of Time Complexity
	// Q1: What is the time complexity: Tiempo: O(n)
	public static void main (String[] args) {
		int n=10;
		for (int  i= 0; i < n; i++) {
			//statement;
			System.out.println(i+1);
		}

	}
	
	/* 
	 * TIEMPO DE COMPLEJIDAD: O(n)
	 * los bucles necesitan n iteraciones para terminar
	 * considere 1 de tiempo para (statement)
	 * tenemos un solo bucle for con 1 declaración dentro
	 * La fórmula para calcular la complejidad general de un bucle seria: 
	 * suma de (número de repetic *(número de statement ))
	 * BIG (O)    = n * 1 
	 * Para lo cual  = n (no tomamos 1 porque se considera constante)
	 * Obteniendo    = O (n)
	 * En este ejercicio su tiempo de complejidad seria
	 * TIEMPO: O(n), ya que va recorrer desde 0 hasta n
	 * de uno en uno por eso el tiempo es Tiempo: O(n)
	 */
}
