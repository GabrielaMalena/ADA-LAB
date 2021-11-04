
public class Question5 {
	
	// Q5: What is the time complexity:O(n^2)
	//Para este ejercicio utilice un array
	//para demostrar como funciona el for anidado
	public static void main(String args[]) {
		int[][] array = {
				{1,2,3},
				{4, 10},
				{6, 7, 8}
		};

		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
	
	
	/* 
	 * TIEMPO DE COMPLEJIDAD: O(n^2)
	 * los bucles necesitan n iteraciones para terminar
	 * Pero tenemos un bucle anidado
	 * un bucle for anidado, por lo cual el bucle interno
	 * bucle interno n*n= n^2= =O(n^2)
	 * se va ejecutar n veces por cada iteracion del bucle externo
	 * En este ejercicio su tiempo de complejidad seria
	 * Tiempo: O(n^2), ya que va recorrer desde 0 hasta n y por el for interno n*n
	 * de uno en uno por eso el tiempo es Tiempo: O(n^2)
	 
	 */
}