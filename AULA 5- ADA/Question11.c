#include<stdio.h>

int main(){
//-----------------------------------//
//------------analizamos primera linea-------------//
//O(1) tamaño entrada tam(p)=1

    int p = 0;
    int i=1,j=1,n=100;
//-----------------------------------//
//-----------Analizamos segunda linea---//
//O(log(n)) a partir del tamaño tam(for1)=n

    for(i=1;i<n;i=i*2)
        printf("%d",i);
//---------------------------------//
//-------------Analizamos la tercera linea---//
//O(log(p)) apartir del tamaño tam(for2)=p
//obtenemos O(log(n)) asumiendo que el tamaño entrada tam(loop2)=p=n

    for(j=1;j<p;j=j*2)
        printf("%d",j);

 }
