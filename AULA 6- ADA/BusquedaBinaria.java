
public class BusquedaBinaria {
	/*
	 * En este ejercicio se pide implementar
	 * el codigo de la busqueda binaria
	 */
	public static void main(String args[]){
		BusquedaBinaria list = new BusquedaBinaria();
		int arr[] = { 2, 3, 4, 10, 40 };
		int p = arr.length;
		//int x = 100;
		int x = 40; 
		int resultado = list.BusquedaBinaria(arr, 0, p - 1, x);
		if (resultado == -1)
			System.out.println("Elemento no se encuentra");
		else
			System.out.println("Se encontro el elemento en la posicion " + resultado);
	}


	int BusquedaBinaria(int array[], int l, int derecha, int x) {
		if (derecha >= l) {
			int mid = l + (derecha - l) / 2;
			if (array[mid] == x) // si el elemento en el centro
				return mid;
			if (array[mid] > x) // si el element es menor = lista izquierda
				return BusquedaBinaria(array, l, mid - 1, x);

			return BusquedaBinaria(array, mid + 1, derecha, x); // si no lo encuentra esta en el lado derech
		}

		return -1; // si no lo encontramos
	}
	
	/*
	 * Entrada: { 2, 3, 4, 10, 40 }
	 *           int x = 40;
	 * Salida:  Se encontro el elemento en la posicion 4
	 * 
	 * 
	 * Entrada:   { 2, 3, 4, 10, 40 }
	 *            int x = 40;
	 * Salida:   Elemento no se encuentra
	 */


}


