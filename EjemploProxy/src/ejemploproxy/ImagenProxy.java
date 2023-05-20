/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploproxy;

/**
 *
 * @author LaptopSA
 */
public class ImagenProxy implements Imagen{

    private ImagenReal imagen = null;
    private String nombreImagen = "";

    // ---------------------------
    public ImagenProxy(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    // ---------------------------
    @Override
    public void mostrarImagen() {
        if (this.imagen == null) {
            this.imagen = new ImagenReal(nombreImagen);
        }
        this.imagen.mostrarImagen();
    }
}
