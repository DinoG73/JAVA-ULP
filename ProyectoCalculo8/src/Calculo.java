
public class Calculo {
	public static boolean esPrimo(int numero) {
	    if (numero <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(numero); i++) {
	        if (numero % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static int valorAbsoluto(int numero) {
		return Math.abs(numero);
	}
	
	public static void calcularRaices(double a, double b, double c) {
	    double discriminant = b * b - 4 * a * c;

	    if (discriminant > 0) {
	        double raiz1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	        double raiz2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	        System.out.println("Las raíces son " + raiz1 + " y " + raiz2);
	    } else if (discriminant == 0) {
	        double raiz = -b / (2 * a);
	        System.out.println("La raíz es " + raiz);
	    } else {
	        System.out.println("La ecuación no tiene solución real.");
	    }
	}
}
