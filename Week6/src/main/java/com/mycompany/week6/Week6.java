/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week6;

/**
 *
 * @author ASUS
 */
public class Week6 {

    public static void main(String[] args) {
        // Estas líneas son correctas SI tu constructor en Computadora.java
// espera String, String, int, int para los parámetros.

Computadora C1 = new Computadora("lenovo", "thinkpad", 32, 256);
Computadora C2 = new Computadora("hp", "desktop", 16, 256);
Computadora C3 = new Computadora("dell", "xps", 32, 512);
Computadora C4 = new Computadora("apple", "macbook", 32, 512);

C1.getClass();
C2.getClass();
C3.getClass();
C4.getClass();

    }
}
