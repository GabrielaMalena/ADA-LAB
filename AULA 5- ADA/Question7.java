
public class Question7 {

	// Q7: What is the time complexity:log2(n)
	public static void main (String[]args) {
		int n= 305; // nosotros indicamos este numero
		for (int  i= 1; i < n; i = i*2) {
			//statement;
			System.out.println("ADA - ADA laboratory: " + i);
		}

	}
	
	/* 
	 * TIEMPO DE COMPLEJIDAD: log2(n)
	 * La l�nea 1 ejecutar� log n veces.
	 * La complejidad del tiempo se convierte en O (log n).
	 * El ciclo se ejecuta para n iteraciones 
	 * i se incrementa en un factor de 2,
	 * as� que supongamos que el valor de n es 1000, entonces los valores correspondientes de i
	 * ser�n 1,2,4,8...
	 * la complejidad del tiempo ser� log n (Base 2) si i incrementa por un factor de 2.
	 * nuestro tiempo de ejecuci�n crece en proporci�n al logaritmo de la entrada
	 *  (en este caso, logaritmo en base 2)

	 */
}
