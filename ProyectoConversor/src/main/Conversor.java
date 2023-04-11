package main;

public class Conversor {
   private static final double CAMBIO_DOLAR_PESO = 98.5;

    public static double convertirAPesos(double dolares) {
        return dolares * CAMBIO_DOLAR_PESO;
    }

    public static double convertirADolar(double pesos) {
        return pesos / CAMBIO_DOLAR_PESO;
    }
}
