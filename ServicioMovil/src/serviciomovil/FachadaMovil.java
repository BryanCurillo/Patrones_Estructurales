/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciomovil;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LaptopSA
 */
public class FachadaMovil {

    public Movil on() {

        Bateria bateria = new Bateria();
        bateria.on();

        CPU cpu = new CPU();
        cpu.bootLoad();

        ServicioMovil gps = new ServicioGPS();
        gps.start();

        ServicioMovil wifi = new ServicioWIFI();
        wifi.start();

        List<ServicioMovil> servicioMoviles = Arrays.asList(gps, wifi);

        Movil movil = new Movil(bateria, cpu, servicioMoviles);

        return movil;
    }

    public void off(Movil movil) {

        for (ServicioMovil service : movil.getServiciosMoviles()) {
            service.close();
        }
        movil.getCpu().shutDown();
        movil.getBateria().off();
    }
}
