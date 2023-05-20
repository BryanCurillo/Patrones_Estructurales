/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Danie
 */
public class piezasCuadradasAdaptador extends piezasRedondas {

    private piezasCuadradas pieza;

    public piezasCuadradasAdaptador(piezasCuadradas peg) {
        this.pieza = peg;
    }

    @Override
    public double getRadius() {
        
        //CALCULA EL TAMAÑO MINIMO DEL AGUJERO
        double result;
        result = (Math.sqrt(Math.pow((pieza.getAnchura() / 2), 2) * 2));
        return result;
    }

}
