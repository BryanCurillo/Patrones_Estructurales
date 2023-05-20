/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

/**
 *
 * @author Danie
 */
public class NewMain {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Dispositivo device) {
        
        System.out.println("ESTAS USANDO EL CONTROL BASICO.");
        ControlBasico basicRemote = new ControlBasico(device);
        basicRemote.estado();
        device.mostrar();

        System.out.println("ESTAS USANDO EL CONTROL AVANZADO.");
        ControlAvanzado advancedRemote = new ControlAvanzado(device);
        advancedRemote.estado();
        device.mostrar();
    }
    
}
