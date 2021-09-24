#include <stdio.h>
/* Ejercicio 1 que indico la cantidad de filas 
y el siguiente los multiplos*/

int main(void) {
 int n, k, c, contador=0; 
 scanf("%d %d", &n, &k);
 while (n--) {
  scanf("%d", &c);
  if(c%k==0) 
  contador++;
 }
 printf("%d", contador);
 return 0;
}
