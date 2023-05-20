/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciomovil;

/**
 *
 * @author LaptopSA
 */
public class ServicioWIFI implements ServicioMovil {

    @Override
    public void start() {
        System.out.println("Servicio de WiFi iniciado");
    }

    @Override
    public void close() {
        System.out.println("Servicio de WiFi finalizado");
    }

}
