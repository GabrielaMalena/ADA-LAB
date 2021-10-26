
import java.util.*;

//Insertion-Sort con tiempo ejecucion(nano seg)
//Insertion sort en java
//En este ejercicio ingresamos nuestro arreglo
//Ordena nuestro arreglo de manera ascendente

public class InsertionSort { 
    static long tiempoInicio;
    static long tiempoFinal;


    public static void main(String[] args) {
	tiempoInicio= System.nanoTime();
	int[] arreglo = {0,6,2,4,1,9,12};  //declaramos nuestro array
	System.out.println("El arreglo ingresado es:" + Arrays.toString(arreglo));
	for(int i=1; i<arreglo.length-1; i++)   {  // ordenamos por insercion
	    int temporal = arreglo[i];  
	    int j= i-1;  
	    while(j>=0 && temporal <= arreglo[j])   {  
		arreglo[j+1] = arreglo[j];   
		j = j-1;  
	     }  
	     arreglo[j+1] = temporal;  
	}  
	System.out.println("El arreglo ordenado Insertion es: :" + Arrays.toString(arreglo));
	tiempoFinal = System.nanoTime();
	//Resta del tiempo final menos el tiempo de inicio
	System.out.println("\nSU TIEMPO DE EJECUCION ES : " + (tiempoFinal-tiempoInicio) + " nanosegundos.\n");
	}  

}  



//Entrada: 
//El arreglo ingresado es:[0, 6, 2, 4, 1, 9, 12]
//El arreglo ordenado Insertion es: :[0, 1, 2, 4, 6, 9, 12]
//SU TIEMPO DE EJECUCION ES : 736100 nanosegundos.

