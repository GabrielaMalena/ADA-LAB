package AULA1;

//Ejercicio 3
//El arreglo incluye n numeros
// los separa en pares e impares

import java.util.Scanner;
import java.util.ArrayList;

class Ejercicio3 {
	public static void main(String[] args) {
		String pares = "";
		String impares = "";
		int array, numero;
		System.out.println("Ingrese la longitud de su arreglo: ");
		Scanner scan= new Scanner(System.in);
		array=scan.nextInt();
		for (int i=1; i<= array; i++){
			System.out.println("Ingrese su numero:"+i);
			numero=scan.nextInt();
			if(numero % 2 == 0){
				pares += numero + " ";
			}
			else{
				impares += numero + " ";
			}

		}
		System.out.println("Numeros Pares: " + pares);
		System.out.println("\nNumeros Impares: " + impares);

	}
}



/* Entrada: 
Ingrese la longitud de su arreglo: 
3
Ingrese su numero:1
2
Ingrese su numero:2
55
Ingrese su numero:3
11
Numeros Pares: 2 

Numeros Impares: 55 11 */
