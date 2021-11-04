
/*
 * TIEMPO DE COMPLEJIDAD: O(log(n))
 * En este ejercicio lo que nos pide es ingresar una palabra
 * un string e ir eliminando en mitad de uno enuno
 * una vez eliminado n os quedamos con una letra
 * y analiza esa letra
 */

//nuestro caso prueba
public class pick_resumes {	
	public static void main (String[] args) {
		//String palabra= "casagrande";
		String palabra= "gabrielamalena";
		System.out.println(pick_resumes(palabra));
	}



	public static String pick_resumes (String resumes) {
		String elimina= "top";
		while(resumes.length()>1) {
			if(elimina.equals("top")) {
				resumes=resumes.substring(resumes.length()/2,resumes.length()); // vamos partiendo por la mitad
				elimina="bottom";				
			}

			else if (elimina.equals("bottom")) {
				resumes= resumes.substring(0, resumes.length()/2);
				elimina= "top";
			}
		}

		return resumes.substring(0);
	}

	/*
	 * 
	 * Tiempo de complejidad: O(log(n))
	 * debido a que el programa va eliminando la mitad del string
	 * alternando entre la parte inicial y la parte final
	 * hasta que nos quedemos con un solo string (letra)
	 * el bucle while interno ejecuta uno más que el bucle externo
	 * tan interno para bucle num de iteraciones = logn + 1.
	 * por n veces las sentencias if-else
	 * 
	 * ENTRADA: "gabrielamalena"
	 * SALIDA: m
	 */

}
