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
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                
                
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambio usando variable temporal (swap)
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
        
    }

    // Método 2rdenamiento Burbuja Mejorado (Optimizado con bandera)
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboIntercambio;
        

        for (int i = 0; i < n - 1; i++) {
            huboIntercambio = false; 

            for (int j = 0; j < n - 1 - i; j++) {
                
                
                if (arreglo[j] > arreglo[j + 1]) {
                    // intercambio (swap)
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                    
                    huboIntercambio = true; 
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
        imprimirArreglo(desordenado);
        
        ordenamientoBurbuja(desordenado);
        
        System.out.print("estado final:   ");
        imprimirArreglo(desordenado);

        System.out.println();

        // caso de prueba 2 arreglo parcialmente ordenado
        int[] parcialmenteOrdenado = {10, 12, 15, 20, 30, 25};
        
        System.out.println("=== PRUEBA 2: BURBUJA MEJORADO (OPTIMIZADO) ===");
        System.out.print("estado inicial: ");
        imprimirArreglo(parcialmenteOrdenado);
        
        ordenamientoBurbujaMejorado(parcialmenteOrdenado);
        
        System.out.print("estado final:   ");
        imprimirArreglo(parcialmenteOrdenado);
    }
    
}
