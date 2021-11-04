iimport java.util.*;
import java.util.Arrays;
/*
 * TIEMPO DE COMPLEJIDAD: O(log(n))
 * En este ejercicio se realiza la suma de dos num=10
 * en este caso ingreso mi array con diferentes num
 * elige dos numeros que me sumen 10
 * Pero no suma dos numeros repetidos por ejemplo= 5+5
 * y me muestra los indices de los numeros que suman 10
 */
public class twoSuma {
    public static void main(String[] args) {
	int suma = 10; // la suma debe dar 10
	int[] arreglo = {1,5,3,8,2}; // ingresamos nuestro array
        //int [] arreglo= {5,5,3,8,1};
	System.out.println(Arrays.toString(twoSumatoria(arreglo, suma)));
    }

    public static int[] twoSumatoria(int[] x, int suma2) {
	int i = 0, j = x.length - 1;
	while (i < j) {
	    int suma = x[i] + x[j];
	    if (suma == suma2)
		return new int[]{i, j}; // nos retorna los indices num que suman 10
	    if (suma < suma2) i++;
	    else j--;
	}
	return null;
     }
	
	/*
	 * Analisis de Complejidad:
	 * Para este caso tenemos un while como bucle externo O(1)
	 * Dentro de el tenemos sentencias if-else
	 * Este algoritmos nos indica que el tiempo es menor que el tamaño 
	 * Este algoritmo busca elementos en un array, suma 2 numeros, 
	 * luego suma2 y busca nuevamente hasta encontrar el elemento, 
	 * es un algoritmo recursivo: ----> O(log n)
	 *  
	 * Entrada y Salida:
	 * En este caso ya tenemos nuestro arreglo {1,5,3,8,2}
	 * Salida nos muestra los indices de los numeros que suman 10
	 * [3, 4] indice 3= 8 y el indice 4= 2
	 */
	
}
