/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocuadrilatero;

/**
 *
 * @author bruno
 */
public class Cuadrilatero {
    private double largo;
    private double alto;
    
    public Cuadrilatero(double width, double height){
        largo = width;
        alto = height;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularPerimetro(){
        return (largo + alto) *2;
    }
    
    public double calcularArea(){
        return largo * alto;
    }
    
    public boolean esUnCuadrado(){
         return  largo == alto;
        
        
    }
}
