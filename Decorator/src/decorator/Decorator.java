/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decorator;

/**
 *
 * @author Bryan
 */
public class Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String salaryRecords = "Nombre, Salario\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("out/resultado.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/resultado.txt");

        System.out.println("- ENTRADA ----------------");
        System.out.println(salaryRecords);
        System.out.println("- CODIFICADO --------------");
        System.out.println(plain.readData());
        System.out.println("- DESCODIFICADO --------------");
        System.out.println(encoded.readData());    }
    
}
