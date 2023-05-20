/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bridge;

/**
 *
 * @author Danie
 */
public interface Dispositivo {
    boolean isEnabled();

    void encendido();

    void apagado();

    int getVolumen();

    void setVolumen(int percent);

    int getCanal();

    void setCanal(int channel);

    void mostrar();
}