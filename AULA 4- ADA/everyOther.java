import java.util.*;
import java.util.Scanner;

/*
 * TIEMPO DE COMPLEJIDAD = O(n^2)
 * En este ejercicio nos pide una lista de elemento
 * y de acuerdo a ello, selecciona si el numero es par
 * como es par va sumando con cada termino y nos imprime los valores
 */
public class everyOther {
    public static void everyOther (int [] list) {
	for (int i=0; i<list.length;i++) { // recorre la lista
	    if(i%2== 0) { // nos indica si es par 
	       for(int j=0; j<list.length; j++) {
		   System.out.println(list[i]+list[j]);
		}
		System.out.println();
	      }
	  }
       }

	//clase prueba
     public static void main(String [] args) {
	 int [] list = {1,2,3}; //nuestra lista numeros ingresamos
	 for(int i: list) {
	     System.out.println(i+ " "); // imprimir valores 
	 }
	 System.out.println();
	 everyOther(list);

      }	


	/*
	 * En este ejercicio su tiempo de complejidad seria
	 * Tiempo: O(n^2), ya que vamos a recorrer desde 0 hasta n
	 * de uno en uno 
	 * el primer bucle for anidado, por lo cual el bucle interno
	 * se ejecuta "n" veces por cada iteracion del bucle externo for
	 * entonces el total de iteraciones realizadas del bucle anidado
	 * sera ---- TOTAL = n*n= n^2= =O(n^2)
	 * 
	 * Entrada: list = {1,2,3};
	 * Salida: 1 
               2 
               3 

               2
               3
               4

               4
               5
               6



	 */
}


