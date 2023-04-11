package proyectotriangulo;

public class ProyectoTriangulo {

	public static void main(String[] args) {
		Triangulo tri1 = new Triangulo(5,4,5);
		
		
		System.out.println(tri1.esUnTriangulo());
		
		tri1.tipoTriangulo();
	}

}
