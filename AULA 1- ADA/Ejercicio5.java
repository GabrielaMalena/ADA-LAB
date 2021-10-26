package AULA1;
//Ejercicio- 5
//Colocamos un marco(*)a un texto

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Ingrese lado de su figura *: ");
		int lado=sc.nextInt();
		sc.close();

		System.out.println();
		for(int i=1; i<=lado; i++){
			for(int j=1; j<=lado; j++){
				if (i==1 || i==lado || j==1 || j==lado){
					System.out.print("*");

				}
				else{
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}


/* CASO PRUEBA:
Ingrese lado de su figura *: 5

*****
*   *
*   *
*   *
*****        */
