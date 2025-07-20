/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week6;

/**
 *
 * @author ASUS
 */
public class Computadora {
   
    // Atributos de la clase
    private String marca;
    private String modelo;
    private int ramGB; 
    private int almacenamientoGB; 

    // ... (otros constructores si los tienes, como el por defecto o el de solo marca y modelo) ...

    /**
     * Constructor parametrizado para inicializar una Computadora con todos sus atributos.
     * Es crucial que los tipos de los parámetros coincidan con los que se pasan al crear el objeto.
     *
     * @param marca La marca de la computadora (String).
     * @param modelo El modelo específico de la computadora (String).
     * @param ramGB La cantidad de memoria RAM en Gigabytes (int).
     * @param almacenamientoGB La capacidad de almacenamiento en Gigabytes (int).
     */
    public Computadora(String marca, String modelo, int ramGB, int almacenamientoGB) {
        // 'this.atributo' se refiere al atributo de la instancia, mientras que
        // 'parametro' se refiere al valor que viene del constructor.
        this.marca = marca;
        this.modelo = modelo;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
       System.out.println(this.marca + ", " + this.modelo + ", RAM: " + this.ramGB + "GB, Almacenamiento: " + this.almacenamientoGB + "GB");
    }

    // ... (tus métodos getter y mostrarInformacion, etc.) ...
}
    

