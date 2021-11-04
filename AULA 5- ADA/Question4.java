

public class Question4 {

	// Q4: What is the time complexity: Tiempo  O(n^2)
	public static void main (String[]args) {
	    int n=5;
	    for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
		    System.out.println(j);
		    //if(i==2) {
		    //System.out.println("loop break");
		    //break;
		//}
	      }
	      System.out.println();
	}

		/* 
		 * TIEMPO DE COMPLEJIDAD:  O(n^2)
		 * En este ejercicio su tiempo de complejidad seria
		 * Tiempo: O(n^2), ya que va recorrer desde 0 hasta n
		 * de uno en uno por eso el tiempo es Tiempo: O(n^2)
		 * un bucle for anidado, por lo cual el bucle interno
		 * se ejecuta n veces por cada iteracion del bucle externo
		 * por lo tanto el numero total de iteraciones del bucle anidado
		 * sera = num total de iteraciones del bucle externo
		 * numero total de iterac bucle interno 
		 * n*n= n^2= =O(n^2)
		 * lo unico que le diferencia del ejercicio1
		 * seria que en este los valores decrementan
		 */
	}
}