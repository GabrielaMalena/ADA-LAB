package AULA3;
import java.util.Scanner;

public class DemoBusquedaBinaria {
	
	static long tiempoInicio;
	static long tiempoFinal;
	
	public static void main (String[]args) {
		Scanner sc1= new Scanner(System.in);
		BusquedaBinaria sc2 = new BusquedaBinaria();
		int[] arreglo = sc2.LlenarArreglo();
		int[]arregloDesordenado= sc2.Ordenar(arreglo);
		System.out.println("numero que desea buscar?"); 
		int buscado = sc1.nextInt();
		sc2.Buscar(arregloDesordenado, buscado);
	}

}



