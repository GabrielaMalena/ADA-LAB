import java.util.*;
import java.util.Arrays;
//Ejercicio 3- sumatoria de indices debe ser igual a 10

public class twoSuma {
	public static void main(String[] args) {
		int suma = 10; // la suma de los indices
		int[] arr = {1,5,3,8,2}; // ingresamos nuestro array

		System.out.println(Arrays.toString(twoSumatoria(arr, suma)));
	}

	public static int[] twoSumatoria(int[] x, int suma2) {
		int i = 0, j = x.length - 1;
		while (i < j) {
			int suma = x[i] + x[j];
			if (suma == suma2)
				return new int[]{i, j};
			if (suma < suma2) i++;
			else j--;
		}
		return null;
	}
}
