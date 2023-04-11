
 
package proyectocuadrilatero;


public class ProyectoCuadrilatero {

    public static void main(String[] args) {
        
        Cuadrilatero cuad1 = new Cuadrilatero(76, 52);
        
        System.out.println(cuad1.calcularArea()); 
        System.out.println("hola");
        System.out.println(cuad1.calcularPerimetro());
        System.out.println(cuad1.esUnCuadrado());
        cuad1.setAlto(76);
         System.out.println(cuad1.esUnCuadrado());
                
    }
    
}
