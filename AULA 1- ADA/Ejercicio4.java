package AULA1;
//Ejercicio 4
//Arreglo lee 3 numeros
//Los imprime de manera ascendente

public class Ejercicio4 {
  public static void main(String[] args) {
      int numeros[]={9,5,8};
      System.out.println("Ingresamos nuestro arreglo:" + Arrays.toString(numeros));
      Arrays.sort(numeros);
      System.out.println("Muestra nuestro arreglo Ordenado Ascendente: " + Arrays.toString(numeros));
	}

}


/* CASO PRUEBA:
Ingresamos nuestro arreglo:[9, 5, 8]
Muestra nuestro arreglo Ordenado Ascendente: [5, 8, 9] */
