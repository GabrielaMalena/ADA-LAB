#include <stdio.h>
/* Ejercicio 1 que indico la cantidad de filas 
y muestra los integers divisibles por k*/

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


/* ENTRADA:
7 3
1
51
966369
7
9
999996
11
SALIDA: 4 */
