/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.terrence.gestordetareas;

import com.terrence.gestordetareas.proyecto.dashboard.Dashboard;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GestorDeTareas {

    public static void main(String[] args) {
  
        Dashboard miDashboard = new Dashboard();
        int opcion;
        try (Scanner mainScanner = new Scanner(System.in)) {
            // --- CÓDIGO DE EJEMPLO SIMILAR AL DE LA IMAGEN ---
            System.out.println("----------------------------------------------");
            System.out.println("----- Inicializando Gestor de Tareas -----");
            System.out.println("----------------------------------------------");
            
            Tarea tareaPresentacion = new Tarea("Preparar presentación POO", "25/07/2025", "Alta");
            Tarea tareaApuntes = new Tarea("Revisar apuntes de Java", "22/07/2025", "Media");
            Tarea tareaCompras = new Tarea("Comprar materiales para proyecto", "20/07/2025", "Baja");
            
            miDashboard.agregarTareaDirecta(tareaPresentacion);
            miDashboard.agregarTareaDirecta(tareaApuntes);
            miDashboard.agregarTareaDirecta(tareaCompras);
            
            System.out.println("Se han precargado algunas tareas de ejemplo.");
            System.out.println("Puedes verlas seleccionando la opción '2. Ver Todas las Tareas'.");
            System.out.println("----------------------------------------------");
            // --- FIN DEL CÓDIGO DE EJEMPLO ---
            
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
    

