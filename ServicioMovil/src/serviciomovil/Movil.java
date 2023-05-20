/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serviciomovil;

import java.util.List;

/**
 *
 * @author LaptopSA
 */
public class Movil {

    private final Bateria bateria;
    private final CPU cpu;
    public final List<ServicioMovil> servicioMoviles;

    public Movil(Bateria bateria, CPU cpu, List<ServicioMovil> servicioMoviles) {
        this.bateria = bateria;
        this.cpu = cpu;
        this.servicioMoviles = servicioMoviles;
    }

    public CPU getCpu() {
        return cpu;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public List<ServicioMovil> getServiciosMoviles() {
        return servicioMoviles;
    }

}
