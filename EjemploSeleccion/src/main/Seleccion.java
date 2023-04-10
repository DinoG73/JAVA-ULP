package main;

public class Seleccion {
	
	public static void votar(int edad) {
		if(edad>=16) {
			System.out.println("Usted puede votar");
		}else {
			System.out.println("Usted no puede votar");
		}
	}
	
	public static void mostrarTriangulo(double lado1, double lado2, double lado3) {
		if (lado1==lado2 && lado1==lado3) {
			System.out.println("Triangulo Equilatero");
		}else {
			if (lado1!=lado2 && lado1!= lado3 &&lado2!=lado3) {
				System.out.println("Triangulo Escaleno");
			}else {
				System.out.println("Triangulo isoceles");
			}
		}
	}
}
