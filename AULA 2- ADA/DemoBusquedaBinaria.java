
import java.util.Scanner;

// Este es el demo de la Busqueda Binaria
//los numeros se generan de manera aleatoria

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




// SALIDA
/*
SU TIEMPO DE EJECUCION ES : 2500 nanosegundos.

posicion0 numero 4
posicion1 numero 13
posicion2 numero 19
posicion3 numero 21
posicion4 numero 30
posicion5 numero 32
posicion6 numero 41
posicion7 numero 69
posicion8 numero 71
posicion9 numero 73
numero que desea buscar?*/


