import java.util.Scanner;
public class mayorNumero {  
	public static void main(String[] args){
		int numero, maximo;
		Scanner scan = new Scanner(System.in);
		System.out.print("Ingrese cantidad de elementos:");
		numero = scan.nextInt();
		int a[] = new int[numero];
		System.out.println("Ingrese sus elementos:");
		for(int i = 0; i < numero; i++)
		{
			a[i] = scan.nextInt();
		}
		maximo = a[0];
		for(int i = 0; i < numero; i++)
		{
			if(maximo < a[i])
			{
				maximo = a[i];
			}
		}
		System.out.println("El elmento maximo de su arreglo es:"+maximo);
	}
}
