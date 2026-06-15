package Data;

import Model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public static ArrayList<Tour> leerArchivo(String rutaArchivo) {
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Usamos try-with-resources para asegurar que el archivo se cierre automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Saltar líneas vacías por si acaso
                if (linea.trim().isEmpty()) continue;

                // Separar los datos por punto y coma
                String[] partes = linea.split(";");

                if (partes.length == 3) {
                    String destino = partes[0].trim();
                    String comuna = partes[1].trim();
                    // Convertir el texto del precio a un número entero
                    int precio = Integer.parseInt(partes[2].trim());

                    // Crear el objeto y añadirlo a la lista
                    Tour nuevoTour = new Tour(destino, comuna, precio);
                    listaTours.add(nuevoTour);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error de formato numérico en el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}