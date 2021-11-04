
public class Question6 {

	// Q6: What is the time complexity:O(sqrt(n)) 
	public static void main (String[]args) {
		int p = 0;
		int n = 30;
		for (int i= 1; p <= n; i++) {
			p = p + i;
		}
		System.out.println(n+" "+p);

	}
	
	/* 
	 * TIEMPO DE COMPLEJIDAD: O (sqrt(n))
	 * Analizando primero tenemos:
	 * Primero tenemos:  p = p + 1;
	 * Segundo tenemos : p = p + 2;
	 * Tercero tenemos : p = p + 3;
	 * Cuarto tenemos :  p = p + 4;
	 * ..............................
	 * Obtenemos m : p = p + m;
	 * Comparando la p con n obtenemos p<=n
	 * La suma de los indicadores p será como: 1+2+3+.....+m <= n
	 */
}
