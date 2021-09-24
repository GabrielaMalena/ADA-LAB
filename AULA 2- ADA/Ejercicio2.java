
import java.util.Scanner;
public class Ejercicio2 {
 
    public static void main(String[] args) {
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
    }
}