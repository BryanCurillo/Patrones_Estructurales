/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter;

/**
 *
 * @author Danie
 */
public class Demo {

    public static void main(String[] args) {

        Circulo hueco = new Circulo(10);
        piezasRedondas predonda = new piezasRedondas(12);
        int tamr = (int) predonda.getRadius();
        int tamx = (int) hueco.getRadio();

        if (hueco.Calculo(predonda)) {
            System.out.println("LA PIEZA REDONDA CABE: TAMAÑO MAXIMO " + tamx + " TAMAÑO DE LA FIGURA REDONDA " + tamr);
        } else {

            System.out.println("LA PIEZA REDONDE NO CABE: TAMAÑO MAXIMO " + tamx + " TAMAÑO DE LA FIGURA REDONDA " + tamr);
        }

        piezasCuadradas cuadradop = new piezasCuadradas(20);
        piezasCuadradas cuadradog = new piezasCuadradas(3);

        // APLICACION DEL ADAPTADOR
        piezasCuadradasAdaptador apadtadorcuadradop = new piezasCuadradasAdaptador(cuadradop);
        piezasCuadradasAdaptador adaptadorcuadradog = new piezasCuadradasAdaptador(cuadradog);

        int cuap = (int) apadtadorcuadradop.getRadius();
        int cuag = (int) adaptadorcuadradog.getRadius();

        if (hueco.Calculo(apadtadorcuadradop)) {
            System.out.println("LA PIEZA CUADRADA CABE: TAMAÑO MAXIMO " + tamx + " TAMAÑO DIAGONAL DEL CUADRADO " + cuap);
        } else {

            System.out.println("LA PIEZA CUADRADA NO CABE: TAMAÑO MAXIMO " + tamx + " TAMAÑO DIAGONAL DEL CUADRADO " + cuap);
        }

        if (!hueco.Calculo(adaptadorcuadradog)) {
            System.out.println("LA PIEZA CUADRADE NO CABE: TAMAÑO MAXIMO " + tamx + " TAMAÑO DIAGONAL DEL CUADRADO " + cuag);
        } else {
            System.out.println("LA PIEZA CUADRADE CABE: TAMAÑO MAXIMO " + tamx + " TAMAÑO DIAGONAL DEL CUADRADO " + cuag);
        }
    }

}
