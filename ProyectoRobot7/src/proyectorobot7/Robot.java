package proyectorobot7;

public class Robot {
	private int bateria = 500;
	private String name;
	
	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void avanzar(int pasos) {
		int consumo;
		consumo = pasos / 10;
		this.bateria -= consumo;
		System.out.println(this.bateria);
	}
	
	public boolean bateriaVacia() {
		return bateria <= 0;
	}
}

