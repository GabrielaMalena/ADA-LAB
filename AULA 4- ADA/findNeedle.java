/*
 * TIEMPO DE COMPLEJIDAD:  O(n^2)
 * En este ejercico aguja en el pajar
 * nosotros ingresamos una cadena de string,
 * apartir de ella indicamos la parte que queremos extraer
 * y nos indica el indice de donde inicia dicha palabra
 * asi como cuantas de edas frases similares se encuentran
 */

public class findNeedle {
   public static void main(String[] args){
	String s="ABCABAABCABAC",ned="CAB";
	//String s= "abcdefghi", ned= "fgh";
	int needleIndice=-1;
	int contador=0;
	int totalNed=0;
	for(int i=0;i<s.length();i++){
	    if(i>ned.length()-1)
		 needleIndice++;
	    else
		needleIndice=i;
	    if(s.charAt(i)==ned.charAt(needleIndice))
		contador++;
	    else
	    {
		needleIndice=0;
		contador=0;
		if(s.charAt(i)==ned.charAt(needleIndice))
		   contador++;
		else
		   needleIndice=-1;
	       }
	       if(contador==ned.length())
	       {
		  needleIndice=-1;
		  contador=0;
		  totalNed++;
		  System.out.println(totalNed+" : aguja encontrada en el indice :"+(i-(ned.length()-1)));
	       }
	   }
	   System.out.print("Total palabras encontradas:"+totalNed);
       }
	/*
	 * Explicacion del analisis de complejidad:
	 * Primero tenemos un for el cual presenta una secuencia de if-else
	 * la secuencia if-else tendria una complejidad de n-2 que daria= O(n)
	 * en cada caso
	 * Aparte el for tendria su complejidad de O(1) pero por los if-else
	 * ya que va recorrer desde 0 hasta n
	 * de uno en uno por eso el tiempo es Tiempo: O(n^2)
	 * un bucle for anidado(if-else), por lo cual el bucle interno recorre n veces
	 * por cada iteracion ------ n*n= n^2= =O(n^2)
	 * 
	 * Salida:
	 * 1 : aguja encontrada en el indice :2
	 * 2 : aguja encontrada en el indice :8
	 * Total palabras encontradas:2
	 */
}



