import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        ShowConsole showConsole = new ShowConsole();
        Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };

        // Busqueda de Juan
        String name = "Juan";
        Persona resultadoPer = metodosBusqueda.serchPersonByName(personas, name);
        /// Imprime la persona si encontró
        /// Imprime no encontró una persona con el nombre ______
        showConsole.showPersonResult(resultadoPer, name);

        // Busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = metodosBusqueda.findPersonByAgeAndImpar(personas, 25);
        showConsole.showPersonResult(resultadoPer2, 25);

        
        // Busqueda por valor de nombre 498
        Persona resultadoPer3 = metodosBusqueda.findPersonByValueName(personas, 498);
        boolean valorNombre = true;
        showConsole.showPersonResult(resultadoPer3, 498, valorNombre);
    }
}
