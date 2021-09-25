
import java.util.*;
public class Ejercicio3 {
	//Insertion-Sort
	//En este ejercicio ingresamos nuestro arreglo
	//Ordena nuestro arreglo de manera ascendente
	
	public static void main(String[] args) {
		int[] numeros = {0,6,2,4,1,9};  //declaramos nuestro array
		System.out.println("El arreglo ingresado es:" + Arrays.toString(numeros));
		for(int k=1; k<numeros.length-1; k++)   {  // ordenamos por insercion
			int temporal = numeros[k];  
			int j= k-1;  
			while(j>=0 && temporal <= numeros[j])   {  
				numeros[j+1] = numeros[j];   
				j = j-1;  
			}  
			numeros[j+1] = temporal;  
		}  
		System.out.println("El arreglo ordenado Insertion es: :" + Arrays.toString(numeros));
	}  
}  


//Entrada: 
//El arreglo ingresado es:[0, 6, 2, 4, 1, 9, 12]
//El arreglo ordenado Insertion es: :[0, 1, 2, 4, 6, 9, 12]

