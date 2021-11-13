#include <iostream>
#define MAX 1000
using namespace std;

char matriz[MAX][MAX];            // indicamos nuestras matrices
bool visitados[MAX][MAX];            // Posiciones temporalmente visitadas
int filas, columnas;            // Dimensiones del mapa
int modosPosib;                     // Número de formas posibles

void DFS(int x, int y){
    if (x < 0 || y < 0 || x >= columnas || y >= filas || matriz[x][y] == '#' || visitados[x][y]){ // # seria la pared
        return;                 // retornamos luego de buscar
    }
    
    if (matriz[x][y] == 'F'){     //  casilla de fin
        modosPosib++;               // se incrementa los modos posibles 
        return;                 
    }
    
    visitados[x][y] = true;          // casilla visitada
    
    DFS(x+1, y);                // recorremos a la derecha
    DFS(x, y+1);                // recorremos abajo
    DFS(x-1, y);                // recorremos a la izquierda
    DFS(x, y-1);                // recorremos arriba
    
  
    visitados[x][y] = false;        
    
    return;
}


//Clase principal
int main(){
    int inicx,    // Inicio en x
        inicy;    // Inicio en y

    cin >> columnas >> filas;

   
    for (int i=0; i<filas; i++){  // nuestro tablero(plano)
        for (int j=0; j<columnas; j++){
            cin >> matriz[j][i];
            if (matriz[j][i] == 'I'){     // 'Inicio
                inicx = j;    // Coordenada en x
                inicy = i;    // Coordenada en y
            }
        }
    }

    DFS(inicx, inicy);      // búsqueda profundidad

    cout << "Modos de salir: "<< modosPosib << '\n';  
    
    return 0;

   


   //ENTRADA: 3 3      (matriz nxn)
   // SALIDA: I . .    (#paredes)
   //         . # #
   //         . . .

}
