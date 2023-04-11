package proyectorobot7;

public class MainRobot {

	public static void main(String[] args) {
		Robot rob1 = new Robot("tito");
		
		while (!rob1.bateriaVacia()) {
			rob1.avanzar(1);
			
		}

	}

}
