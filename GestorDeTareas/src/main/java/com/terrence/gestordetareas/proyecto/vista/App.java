
package com.terrence.gestordetareas.proyecto.vista;

import com.terrence.gestordetareas.proyecto.dashboard.Dashboard;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */


public class App {
    public static void main(String[] args) {
        Dashboard miDashboard = new Dashboard();
        int opcion;
        try (Scanner mainScanner = new Scanner(System.in)) {
            // --- INICIO DE CÓDIGO DE EJEMPLO SIMILAR AL DE LA IMAGEN ---
            System.out.println("----- Inicializando Gestor de Tareas con ejemplos -----");
            // Simular la creación de tareas y añadirlas al dashboard
            // En un escenario real, estas tareas podrían venir de una base de datos o un archivo.
            
            
            
            
            do {
                miDashboard.mostrarMenu();
                try {
                    opcion = Integer.parseInt(mainScanner.nextLine());
                    
                    switch (opcion) {
                        case 1 -> miDashboard.agregarTarea();
                        case 2 -> miDashboard.verTodasLasTareas();
                        case 3 -> miDashboard.marcarTareaComoCompletada();
                        case 4 -> miDashboard.eliminarTarea();
                        case 5 -> miDashboard.buscarTareaPorDescripcion();
                        case 0 -> System.out.println("Saliendo del Gestor de Tareas. ¡Hasta pronto!");
                        default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número.");
                    opcion = -1;
                } catch (Exception e) {
                    System.out.println("Ha ocurrido un error inesperado: " + e.getMessage());
                    opcion = -1;
                }
            } while (opcion != 0);
            
            miDashboard.cerrarScanner();
        }
     
    }
}