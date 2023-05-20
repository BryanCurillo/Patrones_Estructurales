/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author Danie
 */
public class ControlAvanzado extends ControlBasico {

    public ControlAvanzado(Dispositivo device) {
        super.device = device;
    }

    public void silenciar() {
        System.out.println(" - Volumen: Muteado");
        device.setVolumen(0);
    }
}
