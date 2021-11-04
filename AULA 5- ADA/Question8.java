
public class Question8 {
	// Q8: What is the time complexity: O(log2(n))
	public static void main (String[]args) {
		int n=111; //nosotros le indicamos el numero
		for (int i= n; i >= 1; i = i/2) {
			//statement;
			System.out.println("Contador es: " + i);
		}


	}
	
	/*
	 * TIEMPO DE COMPLEJIDAD: O(log2(n))
	 * Considerando algunos pasos
	 * i = n;
	 * i = n / 2 ----> 1;
	 * i = n / 2 ----> 2;
	 * i = n / 2 ----> 3;
	 * i = n / 2 ----> 4;
	 * ............................
	 * Obteniendo i = n / 2 ----> k;
	 * Al finalizar el analisis tenemos:
	 * n / 2 -------->   k < 1
	 * Por lo tanto tenemos k = log n, 
	 *  Tiempo: log2(n);
	 *  Incluimos un dos por a operacion i = i/2
	 *  Por ello obtenemos nuestro tiempo log2(n)
	 *  
	 */
}