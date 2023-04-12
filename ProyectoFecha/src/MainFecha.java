
public class MainFecha {

	public static void main(String[] args) {
		Fecha date1 = new Fecha(27, 6, 2006);
		Fecha date2 = new Fecha(27, 6, 2008);
		
		System.out.println(date1.esBisiesto());
		System.out.println(date2.esBisiesto());
		System.out.println(date1.calcuarAnios(date2));
		
		
	}

}
