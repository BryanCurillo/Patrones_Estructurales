/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Danie
 */
public class Circulo {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public boolean Calculo(piezasRedondas pieza) {
        boolean result;
        result = (this.getRadio() >= pieza.getRadius());
        return result;
    }
}
