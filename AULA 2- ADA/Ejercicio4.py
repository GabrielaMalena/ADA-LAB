#Ejercicio 4- hallar el tiempo de ejecucion
#del insertion sort realizado en python
# utilizo numeros random van de 10,100,1000

from random import randint
from time import time

arreglo= []
for i in range(0,10):
    arreglo.append (randint(0,100))

#print(arreglo)

tiempo_inicial = time()
for i in range(1,len(arreglo)) :
    valor = arreglo[i]
    j=i-1
    while j>=0 and valor < arreglo[j]:
        arreglo[j+1] = arreglo[j]
        j= j-1
    arreglo[j+1] = valor

tiempo_final = time()
#print(arreglo)
print("El tiempo de ejecucion es : "+str(tiempo_final-tiempo_inicial))
