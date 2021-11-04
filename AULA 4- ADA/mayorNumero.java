import java.util.Scanner;
/*
 * TIEMPO DE COMPLEJIDAD:O(n^2)
 * En el ejercicio 1 nos pide ingresar un arreglo de enteros
 * y dentro de el encontrar el valor max
 * nos pide cantidad de elementos
 * nos muestra el mayor
 */
public class mayorNumero {  
	public static void main(String[] args){
	    int numero, maximo; //variables
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Ingrese cantidad de elementos:");
	    numero = scan.nextInt();
	    int a[] = new int[numero];
	    System.out.println("Ingrese sus elementos:");
	    for(int i = 0; i < numero; i++){
	        a[i] = scan.nextInt();
	     }
	     maximo = a[0];
	     for(int i = 0; i < numero; i++){
		 if(maximo < a[i]){
		     maximo = a[i];
		 }
	      }
	      System.out.println("El elmento maximo de su arreglo es:"+maximo);
	 }

	/* 
	 * Analisis de Complejidad:
	 * Para esta complejidad ya que vamos a recorrer desde 0 hasta n
	 * de uno en uno (por el primer for)
	 * el primer bucle for anidado, por lo cual el bucle interno
	 * se ejecuta la cantidad de veces (n) por cada iteracion del bucle for
	 * obtenemos el total de iteraciones realizadas del bucle anidado
	 * Obtenemos = n*n= n^2= =O(n^2)
	 * 
	 * Entrada y Salida: 
	 * Ingrese cantidad de elementos:5
	 * Ingrese sus elementos: 12
                              11
                              52
                              23
                              10
	 * El elmento maximo de su arreglo es:52
	 */
}
