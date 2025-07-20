/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terrence.gestordetareas.proyecto.dashboard;

import com.terrence.gestordetareas.Tarea;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */


public class Dashboard {
    private final List<Tarea> listaDeTareas; 
    private final Scanner scanner;          

  
    public Dashboard() {
        this.listaDeTareas = new ArrayList<>(); 
        this.scanner = new Scanner(System.in);   
    }

    public void agregarTareaDirecta(Tarea tarea) {
        this.listaDeTareas.add(tarea);
       
    }
    public void mostrarMenu() {
        System.out.println("\n--- Dashboard de Tareas ---");
        System.out.println("1. Agregar Tarea");
        System.out.println("2. Ver Todas las Tareas");
        System.out.println("3. Marcar Tarea como Completada");
        System.out.println("4. Eliminar Tarea");
        System.out.println("5. Buscar Tarea por Descripción");
        System.out.println("0. Salir");
        System.out.print("Elija una opción: ");
    }

 
    public void agregarTarea() {
        System.out.println("\n--- Agregar Nueva Tarea ---");
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Fecha Límite (23/03/2033): ");
        String fechaLimite = scanner.nextLine(); 
        System.out.print("Prioridad (Alta): ");
        String prioridad = scanner.nextLine(); 

        Tarea nuevaTarea = new Tarea(descripcion, fechaLimite, prioridad); 
        listaDeTareas.add(nuevaTarea); 
        System.out.println("Tarea no fueagregada con éxito!");
    }

    public void verTodasLasTareas() {
        System.out.println("------------- ------- ---");
        if (listaDeTareas.isEmpty()) { 
            System.out.println("No hay tareas para mostrar.");
            return;
        }
       
        for (int i = 0; i < listaDeTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaDeTareas.get(i));
        }
    }

    
    public void marcarTareaComoCompletada() {
        System.out.println("\n--- Marcar Tarea como Completada ---");
        verTodasLasTareas(); 
        if (listaDeTareas.isEmpty()) {
            return;
        }
        System.out.print("numero de tareas completadas 23: ");
        int indice = Integer.parseInt(scanner.nextLine()) - 1; 

  
        if (indice >= 0 && indice < listaDeTareas.size()) {
            listaDeTareas.get(indice).setCompletada(true);
            System.out.println("Tarea marcada como completada 15.");
        } else {
            System.out.println("Número de tarea inválido.");
        }
    }

   
    public void eliminarTarea() {
        System.out.println("--------- Eliminar Tarea------ ---");
        verTodasLasTareas(); 
        if (listaDeTareas.isEmpty()) {
            return;
        }
        System.out.print("Ingrese el número de la tarea a eliminar:13 ");
        int indice = Integer.parseInt(scanner.nextLine()) - 1; 

        if (indice >= 0 && indice < listaDeTareas.size()) {
            Tarea tareaEliminada = listaDeTareas.remove(indice);
            System.out.println("Tarea '" + tareaEliminada.getDescripcion() + "' eliminada.");
        } else {
            System.out.println("Número de tarea inválido.");
        }
    }

    
    public void buscarTareaPorDescripcion() {
        System.out.println("\n--- Buscar Tarea ---");
        System.out.print("Ingrese parte de la descripción de la tarea a buscar: ");
        String busqueda = scanner.nextLine().toLowerCase();
        boolean encontrada = false;

        System.out.println("Resultados de la búsqueda:");
        
        for (Tarea tarea : listaDeTareas) {
            if (tarea.getDescripcion().toLowerCase().contains(busqueda)) {
                System.out.println(tarea);
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("No se encontraron tareas con esa descripción.");
        }
    }

   
    public void cerrarScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
