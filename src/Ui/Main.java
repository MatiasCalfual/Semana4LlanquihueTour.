package Ui;

import Data.GestorDatos;
import Model.Tour;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Ruta relativa al archivo.
        // Nota: Si ejecutas desde la raíz del proyecto, esta ruta es la indicada.
        String ruta = "resources/tours.txt";

        System.out.println("=== Cargando datos desde el archivo ===");
        ArrayList<Tour> todosLosTours = GestorDatos.leerArchivo(ruta);

        // 1. Mostrar todos los elementos de la colección
        System.out.println("\n--- Todos los Tours Disponibles ---");
        for (Tour t : todosLosTours) {
            System.out.println(t);
        }

        // 2. Filtrar según una condición (Ejemplo: precio > 1500)
        int precioLimite = 1500;
        System.out.println("\n--- Tours Filtrados (Precio mayor a $" + precioLimite + ") ---");

        int contadorFiltrados = 0;
        for (Tour t : todosLosTours) {
            if (t.getPrecio() > precioLimite) {
                // 3. Imprimir los resultados filtrados
                System.out.println(t);
                contadorFiltrados++;
            }
        }

        if (contadorFiltrados == 0) {
            System.out.println("No se encontraron tours que cumplan con la condición.");
        }
    }
}