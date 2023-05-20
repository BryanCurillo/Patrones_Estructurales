/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Danie
 */
public class piezasCuadradas {
 
    private double anchura;

    public piezasCuadradas(double anchura) {
        this.anchura = anchura;
    }

    public double getAnchura() {
        return anchura;
    }

    public double getCuadrado() {
        double result;
        result = Math.pow(this.anchura, 2);
        return result;
    }
    
}
