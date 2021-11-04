
public class Question2 {

	// Q2: What is the time complexity: O(n)
	public static void main (String[] args) {
		System.out.println("Numeros del 10 al 1: ");                                                             
		for(int i=10;i>=0;i--)
			System.out.println(i);
	}

	/* 
	 * TIEMPO DE COMPLEJIDAD: O(n)
	 * los bucles necesitan n iteraciones para terminar
	 * considere 1 de tiempo para (statement)
	 * tenemos un solo bucle for con 1 declaración dentro
	 * En este ejercicio su tiempo de complejidad seria
	 * Tiempo: O(n), ya que va recorrer desde 0 hasta n
	 * de uno en uno por eso el Tiempo es: O(n)
	 * lo unico que le diferencia del ejercicio1
	 * seria que en este los valores decrementan
	 */
}
