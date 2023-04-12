

public class Fecha {
	private  int dia;
	private  int mes;
	private  int ano;
	
	
	public Fecha(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean esBisiesto() {
		return this.ano % 4 == 0;
	}
	
	/*calcularAños(): Este método recibirá un objeto del tipo Fecha y retornará un entero que 
será la cantidad de años transcurridos entre esta Fecha y la que recibe por parámetro.*/
	public int calcuarAnios(Fecha fecha1) {
		int aniosTranscurridos = fecha1.ano -this.ano;
		if(fecha1.mes < this.mes || (fecha1.mes == this.mes && fecha1.dia < this.dia)) {
			aniosTranscurridos--;
		}
		return aniosTranscurridos;
	}
}
