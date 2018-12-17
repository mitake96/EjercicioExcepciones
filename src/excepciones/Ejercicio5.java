package excepciones;

public class Ejercicio5 {

	/*	Comprobar qué numeros son perfectos del 1 al 10.000
	 * 	Mostrar los números perfectos y su suma en pantalla
	 */
	public static boolean perfecto(int x) {
		int suma = 0;
		for (int i = 1; i<x; i++) {
			if (x%i==0) {
				suma += i;
			}
		}
		if (suma == x) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String concatenar(int x) {
		String cadena = "";
		if (perfecto(x)) {
			for (int i = 1; i<x; i++) {
				if (x%i==0) {
					cadena += i + "+";
				}
			}
			return cadena.substring(0, cadena.length()-1); 
		}
		else {
			return cadena;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Números perfectos: ");
		for (int i = 1; i<=10000; i++) {
			if (perfecto(i)) {
				System.out.println(i + "=" + concatenar(i));
			}
		}
		
	}

}
