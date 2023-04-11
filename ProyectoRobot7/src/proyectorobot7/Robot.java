package proyectorobot7;

public class Robot {
	private final int bateria = 500;
	private String name;
	
	public Robot(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void avanzar(int pasos) {
		
	}
	
	public boolean bateriaVacia() {
		return bateria <= 0;
	}
}

