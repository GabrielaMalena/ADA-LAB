
public class Question3 {
	// Q3: What is the time complexity: Tiempo O(n)
	public static void main(String[]args) {
		int n=20;
		for (int i= 0; i < n; i=i+5) {
			// statement;
			System.out.println(i);
		}

		//0 2 4 6 ... n - 2

	}
	
	/* 
	 * En este ejercicio su tiempo de complejidad seria
	 * Tiempo: O(n), ya que va recorrer desde 0 hasta n
	 * de uno en uno por eso el tiempo es Tiempo: O(n)
	 * lo unico que le diferencia del ejercicio1
	 * seria que en este los valores decrementan
	 */
}
