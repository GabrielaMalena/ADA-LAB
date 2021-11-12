
import java.util.Scanner;

/*
 * En este ejercicio se nos pide ingresar nuestro array
 * y dentro de ese arreglo encontrar nuestro menor elemento
 * el elemento minimo
 */
public class ArrayRotado{	
	//nuestra clase main
	public static void main(String[] args) {
		//int[] lista = { 0,2,4,5,6,8,9}; // indicamos nuestro array ordenado
		int[] lista = { 4,5,6,8,9,15}; 
		System.out.println(lista[busquedaBinaria(lista)]);

	}
	
	public static int busquedaBinaria(int[] lista) {
		//lo que realizamos aqui usando la busqueda binaria
		//hacemos el recorrido de izq-derec haciendo las
		// particiones correspondientes /2
		int izquierda = 0;		
		int derecha = lista.length -1 ;	
		int mid, menor = -1;
		while(izquierda <= derecha) {
			mid = izquierda + (derecha- izquierda)/2;
			if(lista[mid] < lista[derecha]) {
				menor = mid;
				derecha = mid-1;
			}
			else {
				menor = mid;
				izquierda = mid+1;
			}
		}
		return menor;
	}

	/*
	 * Entrada: { 1,4,5,6,8,9}
	 * Salida: 0
	 * 
	 * Entrada: { 4,5,6,8,9,15}
	 * Salida: 4
	 */

}