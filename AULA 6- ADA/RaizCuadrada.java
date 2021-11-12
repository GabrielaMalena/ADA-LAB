import java.util.Scanner;

/*
 * En el ejercicio nos pide indicar si el numero
 * tiene raiz cuadrada en caso sea asi = true
 * en caso no tenga raiz cuadrada = false
 */
public class RaizCuadrada{
	public static void main(String[] args) {
		//System.out.println(RaizCuadrada(101)); //indicamos el num para la raiz cuadrada
		System.out.println(RaizCuadrada(400)); 
		//System.out.println(RaizCuadrada(101));
	}
	
	public static void arrayRecorrido(int[] lista) {
		for(int i=0; i< lista.length;i++) { // recorrido a nuestra lista
			lista[i] = i;
		}
	}
	public static boolean RaizCuadrada(int num) {
		int[] lista = new int[num];
		arrayRecorrido(lista);
		int izquierda = 0;		
		int derecha = lista.length -1 ;	
		int mid;
		while(izquierda <= derecha) {
			mid = izquierda+ (derecha- izquierda)/2;
			if(lista[mid]*lista[mid] == num)
				return true;
			if(lista[mid]*lista[mid] < num)
				izquierda = mid+1;
			else
				derecha = mid-1;
		}
		return false;
	}
	
	/*
	 * Entrada: (RaizCuadrada(101))
	 * Salida:   false
	 * 
	 * Entrada:  (RaizCuadrada(400))
	 * Salida:   true
	 */

}
