import java.util.*;
import java.util.Scanner;
//Ejercicio 2- pares e impares
// tiempo de complejidad = O(n^2)
public class everyOther {
	public static void everyOther (int [] list) {
		for (int i=0; i<list.length;i++) {
			if(i%2== 0) {
				for(int j=0; j<list.length; j++) {
					System.out.println(list[i]+list[j]);
				}
				System.out.println();
			}
		}
	}
	
	//clase prueba
	public static void main(String [] args) {
		int [] list = {1,2,3};
		for(int i: list) {
			System.out.println(i+ " ");
		}
		System.out.println();
		everyOther(list);

	}	


}

