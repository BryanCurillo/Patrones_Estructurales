/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package composite;
import java.awt.*;

/**
 *
 * @author Bryan
 */
public interface Shape {

    int getX();

    int getY();

    int getWidth();

    int getHeight();

    void move(int x, int y);

    boolean isInsideBounds(int x, int y);

    void select();

    void unSelect();

    boolean isSelected();

    void paint(Graphics graphics);
   
}
