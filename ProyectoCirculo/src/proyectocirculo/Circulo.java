/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectocirculo;

/**
 *
 * @author bruno
 */
public class Circulo {
    private final double PI = 3.14;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        return PI * (radio * radio);
    }
    
    public double calcularPerimetro(){
        return 2 * PI * radio;
    }
    
}
