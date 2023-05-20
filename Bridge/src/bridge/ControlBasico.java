/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;

/**
 *
 * @author Danie
 */
public class  ControlBasico implements Remote {
    protected Dispositivo device;

    public ControlBasico() {}

    public ControlBasico(Dispositivo device) {
        this.device = device;
    }

    @Override
    public void estado() {
        if (device.isEnabled()) {
            device.apagado();
        } else {
            device.encendido();
        }
    }

    @Override
    public void bajarVol() {
        System.out.println(" Menos Volumen");
        device.setVolumen(device.getVolumen() - 10);
    }

    @Override
    public void subirVol() {
        System.out.println(" Mas volumen");
        device.setVolumen(device.getVolumen() + 10);
    }

    @Override
    public void regresarC() {
        System.out.println(" - Canal Anterior");
        device.setCanal(device.getCanal() - 1);
    }

    @Override
    public void siguienteC() {
        System.out.println(" - Siguiente Canal");
        device.setCanal(device.getCanal() + 1);
    }
}