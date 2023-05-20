/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploproxy;

/**
 *
 * @author LaptopSA
 */
public class EjemploProxy {

    public static void main(String[] args) {

        Documento doc = new Documento("Presupuesto.doc");
        try {
            Thread.sleep(3000);
            doc.hacerScroll();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
