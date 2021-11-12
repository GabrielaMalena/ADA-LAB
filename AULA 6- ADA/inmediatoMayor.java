
public class inmediatoMayor {
	/*
	 * en este ejercicio se nos pide que al ingresar nuestro array
	 * encuentre el valor mayor o igual que x, en este caso nos
	 * indicara la posicion del numero inmediato mayor
	 * por ejemplo {2,6,52,100,102,200,201}
	 * x= 200 me debe indicar el siguiente inmediato mayor
	 */

	public static void main(String[] args) {
		int[] lista = {2,6,9,10,12,13,16}; // indicamos nuestro array
		//int[] lista = {2,6,52,100,102,200,201};
		System.out.println(inmediatoMayor(lista, 11)); // nos retornara el indice del >
	}

	public static int inmediatoMayor(int[] lista, int x) {
		int izquierda = 0;		
		int derecha = lista.length -1 ;
		int mid , indice = -1;  // cuando no encuentra el num nos retorna -1
		while(izquierda <= derecha) {
			mid = izquierda + (derecha - izquierda)/2;
			if(lista[mid] == x)
				return mid;
			if(lista[mid] < x) {
				izquierda = mid+1;
			}
			else {
				indice = mid;
				derecha = mid-1;
			}
		}
		return indice;
	}
	
	/*
	 * Entrada: {2,6,52,100,102,200,201}
	 *           inmediatoMayor(lista, 4)
	 * Salida:   1-----> (posicion)
	 * 
	 * Entrada:   {2,6,9,10,12,13,16}
	 *             inmediatoMayor(lista, 13)
	 * Salida:    5 -----> (posicion)
	 * 
	 * 
	 * Entrada:   {2,6,9,10,12,13,16}
	 *            inmediatoMayor(lista, 130)
	 * Salida:   -1 -------> (como no lo encuentra devuelv )
	 */

}
