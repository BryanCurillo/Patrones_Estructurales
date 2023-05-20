/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serviciomovil;

import java.util.Scanner;

/**
 *
 * @author LaptopSA
 */
public class Cliente {

    public static void main(String[] args) {
        FachadaMovil fachada = new FachadaMovil();
        Movil mobile = null;
        System.out.println("INGRESE 1 para activar servicios, 2 para apagar servicios moviles u otro numero para finalizar");
        Scanner s = new Scanner(System.in);
        String letra;
        do {
            letra = s.nextLine();
            if (letra.endsWith("1")) {
                mobile = fachada.on();
                System.out.println("MOVIL ACTIVADO");
            } else {
                if (letra.endsWith("2")) {
                    fachada.off(mobile);
                    System.out.println("MOVIL APAGADO");
                    System.out.println("\nLINDO DIA USUARIO");
                }
            }
        } while (letra.equals("1"));

    }

}
