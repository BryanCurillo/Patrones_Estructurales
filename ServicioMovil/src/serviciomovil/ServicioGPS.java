/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciomovil;

/**
 *
 * @author LaptopSA
 */
public class ServicioGPS implements ServicioMovil {

    @Override
    public void start() {
        System.out.println("Servicio de GPS inciado");
    }

    @Override
    public void close() {
        System.out.println("Servicio de GPS finalizado");
    }

}
