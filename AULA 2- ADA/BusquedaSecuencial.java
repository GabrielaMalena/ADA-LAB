
import java.util.Scanner;

//Busqueda Secuencial con tiempo de ejecucion
//En este eejrcicio enviamos un arreglo y buscamos la posicion
// si es verdadero devuelve true de lo contrario false

public class BusquedaSecuencial {
	static long tiempoInicio;
	static long tiempoFinal;


	public static void main(String[] args) {
		tiempoInicio= System.nanoTime();
		int [] num = {2,4,1,5,9,12,33}; //nuestro arreglo
		Scanner scan = new Scanner(System.in);
		boolean presente= false; // si el numero existe

		System.out.println("Ingrese número:"); // indicamos num
		int encontrarNum = scan.nextInt();      
		for(int x = 0; x < num.length; x++){  
			if(num[x]== encontrarNum){  
				System.out.println("True, posicion "+(x+1));
				break;
			}
			if(x == num.length-1){
				presente = true;
			}
		}       
		if(presente==true){ 
			System.out.println("false");
		}
		
		tiempoFinal = System.nanoTime();
        //Resta del tiempo final menos el tiempo de inicio
        System.out.println("\nSU TIEMPO DE EJECUCION ES : " + (tiempoFinal-tiempoInicio) + " nanosegundos.\n");
	}
}

//Entrada 
//Ingrese numero: 12
//Salida: true, posicion 6
//SU TIEMPO DE EJECUCION ES : 3325432901 nanosegundos.
