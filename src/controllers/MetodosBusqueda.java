package controllers;

import views.ShowConsole;

public class MetodosBusqueda {

    private views.ShowConsole showConsole;
    private int[] arreglo;

    public MetodosBusqueda() {
        this.arreglo = new int[] {10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);
        
        // Buscar el 5
        int result1 = busquedaLineal(5);
        showConsole.printResult(result1, 5);

        // Buscar el -2
        int result2 = busquedaLinealWhile(-2);
        showConsole.printResult(result2, -2);

        // Buscar el 20
        int result3 = busquedaLinealWhile(20);
        showConsole.printResult(result3, 20);

        // Buscar el 100
        Integer result4 = busquedaLinealObj(100);
        showConsole.printResult(result4);
    
        // Buscar el 10
        int buscado = 10;
        Integer result5 = busquedaLinealObj(buscado);
        showConsole.printResult(buscado);
    }

    /// Retorna la posicion del valor buscado
    /// Si no encontro retorna -1
    public int busquedaLineal(int value) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile(int value) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == value) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /// Retorna el OBJETO buscado si lo encontró
    /// Si no lo encontró retorna null 
    public Integer busquedaLinealObj(int value) {
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == value) {
                return i;
            }
            i++;
        }

        return null;
    }
}
