/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploproxy;

/**
 *
 * @author LaptopSA
 */
public class ImagenReal implements Imagen {

    private String nombre;

    // ---------------------------
    public ImagenReal(String nombre) {
        this.nombre = nombre;
    }

    // ---------------------------
    @Override
    public void mostrarImagen() {
        System.out.println("Mostrando imagen: [" + nombre + "]");
    }
}
