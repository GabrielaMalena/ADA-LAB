//En este ejercicio realizamos la Busqueda Binaria
// USANDO TIEMPO DE EJECUCUION
//Usamos nanoTime, en el pdf adjunto grafica

public class BusquedaBinaria {
	static long tiempoInicio;
	static long tiempoFinal;
	
	public static int[] LlenarArreglo() {
		tiempoInicio= System.nanoTime();
		int arreglo[]= new int[10]; // indicamos nueswtra cantidad de numeros -10, 12 etc
		for (int i=0; i<arreglo.length; i++) {
			arreglo[i]= (int)(Math.random()*100);
		}
		return arreglo;
	}
	
	
	
	
	public static int [] Ordenar (int[]arreglo) {
		tiempoInicio= System.nanoTime();
		int temp=0;
		for(int i=0; i<arreglo.length; i++) {
			for(int j=i; j<arreglo.length; j++) {
				if(arreglo[i]>arreglo[j]) {
					temp=arreglo[j];
					arreglo[j]=arreglo[i];
					arreglo[i]= temp;
				
				}
			}
		}
		
		tiempoFinal = System.nanoTime();
        //Resta del tiempo final menos el tiempo de inicio
        System.out.println("SU TIEMPO DE EJECUCION ES : " + (tiempoFinal-tiempoInicio) + " nanosegundos.\n");
		
		
		for(int i=0; i<arreglo.length; i++) {
			System.out.println("posicion"+i+ " numero " +arreglo[i]);
			
		}
		 return arreglo;
	}
	
	
	
	
	public static void Buscar(int [] arreglo, int buscado) {
		int n= arreglo.length;
		int inferior=0, superior=n, medio=0;
		while(inferior<=superior) {
			medio=(inferior+superior)/2;
			if(buscado==arreglo[medio]) {
				System.out.println("Su numero es: " + buscado + " y existe en el arreglo: ");
				superior=0;
			}
			if(buscado<arreglo[medio]) {
				superior=medio;
			}
			else {
				inferior=medio;
			}
		}
	}

}


