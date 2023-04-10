package main;



public class Utilitario {
	
	public static void dibujaCuadrado(int n) {
		for(int i = 0; i < n; i++) {
			System.out.print("*" + " ");
		}
		System.out.println();
		
		for(int i = 0; i < n -2; i++) {
			System.out.print("*" + " ");
			for(int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print("*" + " ");
		}
		
		System.out.println(" ");
	}
	
	public static void elMayorEs(int n1, int n2, int n3) {
		int aux;
		if(n1 > n2) {
			aux = n1;
		}else {
			aux = n2;
		}
		if(n3 > aux) {
			aux = n3;
		}
		
		System.out.println("El mayor es: " + aux);
		if(n1 == n2 && n2 == n3) {
			System.out.println("Los numero son iguales");
		}
	}
	
	public static void elDiaEs(int dia) {
		switch (dia) {
		
		case 1: {
			System.out.println("Lunes");
			break;
		}
		case 2: {
			System.out.println("Martes");
			break;
		}
		case 3: {
			System.out.println("Miercoles");
			break;
		}
		case 4: {
			System.out.println("Jueves");
			break;
		}
		case 5: {
			System.out.println("Viernes");
			break;
		}
		case 6: {
			System.out.println("Sabado");
			break;
		}
		case 7: {
			System.out.println("Domingo");
			break;
		}
		default:
			System.out.println("No existe ese dia");
			break;
		}
	}
	
	
}
