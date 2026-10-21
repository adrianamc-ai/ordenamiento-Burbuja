/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adria
 */
public class OrdenamientoBurbuja {
    // metodo rdenamiento burbuja normal
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;

        //externo porque controla el numero de pasadas
        for (int i = 0; i < n - 1; i++) {

            //interno porque aqui compara y desplaza los valores mayores a la derecha
            for (int j = 0; j < n - 1 - i; j++) {
                
                //si el elemento es mayor que el siguiente se intercambia posiciones
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambio, aqui use la variable llamada temporal (swap)
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
        
    }

    // metodo 2rdenamiento Burbuja Mejorado con bandera
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboIntercambio;//bandera para saber si hubo cambios en la pasada
        

        for (int i = 0; i < n - 1; i++) {
            //al iniciar cada pasada se reinicia la bandera
            huboIntercambio = false; //falso osea que no hubo intercambio

            for (int j = 0; j < n - 1 - i; j++) {
                
                //comparar los elementos vecinos
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambio (swap)
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    
                    huboIntercambio = true; //si hubo intercambio
                }
            }

            // si en esta pasada no hubo cambios el arreglo ya está ordenado
            if (!huboIntercambio) {
                break; 
            }
           
        }
    }
    
    
    // metodo temporal para imprimir el arreglo en consola
    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    // metodo principal main con casos de prueba
    public static void main(String[] args) {
        // caso de prueba arreglo completamente desordenado
        int[] desordenado = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("=== PRUEBA 1: BURBUJA NORMAL ===");
        System.out.print("estado inicial: ");
        imprimirArreglo(desordenado);//va a mostrar el arreglo antes de ordenarlo
        
        ordenamientoBurbuja(desordenado);//burbuja normal
        
        System.out.print("estado final:   ");
        imprimirArreglo(desordenado);//muestra arreglo ya ordenado

        System.out.println();

        // caso de prueba 2 arreglo parcialmente ordenado
        int[] parcialmenteOrdenado = {10, 12, 15, 20, 30, 25};
        
        System.out.println("=== PRUEBA 2: BURBUJA MEJORADO (OPTIMIZADO) ===");
        System.out.print("estado inicial: ");
        imprimirArreglo(parcialmenteOrdenado);//va a mostrar el estado inicial
        
        ordenamientoBurbujaMejorado(parcialmenteOrdenado);//aqui se ejecuta con bndera
        
        System.out.print("estado final:   ");
        imprimirArreglo(parcialmenteOrdenado);//muestra el resultado final 
    }
    
}
