/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.terrence.gestordetareas;

/**
 *
 * @author ASUS
 */


public class Tarea {
    private String descripcion;
    private String fechaLimite;
    private String prioridad; 
    private boolean completada;

 
    public Tarea(String descripcion, String fechaLimite, String prioridad) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
        this.completada = false; 
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    @Override
    public String toString() {
        return "Tarea: '" + descripcion + "'" +
               ", Fecha Límite: " + fechaLimite +
               ", Prioridad: " + prioridad +
               ", Estado: " + (completada ? "Completada" : "Pendiente");
    }
}
    

