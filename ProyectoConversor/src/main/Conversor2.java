package main;

public class Conversor2{
	
	public static double convertirAPesos(int dolar){
        
        double pesos;
        pesos = dolar * 220.25;
        
        return pesos;
        
    }
    
    public static double convertirADolar(int pesos){
        
        double dolar;
        dolar = pesos / 220.25;
        
        return dolar;
    }
}