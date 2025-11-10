package views;

import models.Persona;

public class ShowConsole {

    public ShowConsole() {
    }

    public void printArray(int[] arreglo) {
        System.out.print("[");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void printResult(int result, int valor) {
        if (result == -1) {
            System.out.println("ERROR: No se encontró el valor {" + valor + "}");
        } else {
            System.out.println("El número {" + valor + "} se encontró en la posición [" + result + "]");
        }
    }

    public void printResult(Integer result) {
        if (result != null) {
            System.out.println("El valor {" + result + "} si está en el arreglo");
        } else {
            System.out.println("ERROR: No se encontró el valor buscado");
        }
    }

    public void showPersonResult(Persona resultadoPersona, String name) {
    if (resultadoPersona == null) {
        System.out.println("No se encontró la Persona con el nombre: " + name);
    } else {
            System.out.println("Se encontró la persona con el nombre: " + name);
            System.out.println(resultadoPersona); 
        }
    }

    public void showPersonResult(Persona resultadoPersona, int age) {
        if (resultadoPersona == null) {
            System.out.println("No se encontró la Persona con la edad: " + age);
        } else {
            System.out.println("Se encontró la persona con la edad: " + age);
            System.out.println(resultadoPersona);
        }
    }

    public void showPersonResult(Persona resultadoPersona, int i, boolean valorNombre) {
        
        if (valorNombre) {
            if (resultadoPersona == null) {
                System.out.println("No se encontró la Persona con el valor: " + i);
            } else {
                System.out.println("Se encontró la persona con el valor: " + i);
                System.out.println(resultadoPersona); 
            }
        } else {
            System.out.println("ERROR");
        }
    }
}
