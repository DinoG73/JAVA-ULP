/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocuadrilatero;

/**
 *
 * @author bruno
 */
public class ProyectoCuadrilatero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic
        Cuadrilatero cuad1 = new Cuadrilatero(76, 52);
        
        System.out.println(cuad1.calcularArea()); 
        System.out.println("hola");
        System.out.println(cuad1.calcularPerimetro());
        System.out.println(cuad1.esUnCuadrado());
        cuad1.setAlto(76);
         System.out.println(cuad1.esUnCuadrado());
                
    }
    
}
