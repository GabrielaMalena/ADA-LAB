public class dfs_new {
	/*
	 * en este ejercicio se pide ingresar una matriz, y apartir
	 * de un punto, se van pintando los otros puntos. Para lo cual
	 * ingresamos una matriz, y una coordenada y se pinta el area circundante
	 * y como salida nos da una matriz
	 */
	
	
	//creamos nuestra lista(arreglo) de 6x6
	public static void main(String[] args) {
		int [][] lista = {{1, 1, 1, 1, 1, 1},
				{1, 0, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 1},
				{1, 0, 0, 0, 1, 0},
				{1, 1, 1, 1, 0, 0},};

		mostrar(lista);
		System.out.println("_____________");
		dfs(lista, 5, 5);
		mostrar(lista);

	}

	//aqui vamos a desarrollar el dfs de manera recursiva
	// incluimos un color para resaltar la parte adyacente a la coordenada
	static int paint = 6;		
	public static void dfs(int[][] lista, int fila, int columna) {
		lista[fila][columna] = paint; //lugar ya visitado(se marca)
		for(int i=0; i<4; i++ ) { // max. 4
			switch (i) {
			case 0: {
				if(fila - 1 >= 0)
					if(lista[fila-1][columna] == 0)
						dfs(lista, fila-1, columna);
				break;
			}
			case 1:{
				if(columna - 1 >= 0)
					if(lista[fila][columna-1] == 0)
						dfs(lista, fila, columna-1);
				break;
			}
			case 2:{
				if(fila + 1 < lista.length)//array[].length
					if(lista[fila+1][columna] == 0)
						dfs(lista, fila+1, columna);
				break;
			}
			case 3:{
				if(columna + 1 < lista.length)
					if(lista[fila][columna+1] == 0)
						dfs(lista, fila, columna+1);
				break;
			}
			default:
				System.out.println("no existe");
			}
		}
	}
	
	
	// este metodo para mostrar nuestra lista
	public static void mostrar(int [][] lista) {
		for(int[] x : lista) {
			for(int y : x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
}


