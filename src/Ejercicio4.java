import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	/*  El usuario introduce un número
	 *  El programa lee el número y lo descompone en factores primos
	 *  Muestra el número descomprimido y sus factores
	 * 
	 */
	
	public static boolean primos(int x){
		int i;
		boolean primo=true;
		for (i=x-1; i>1 && primo; i--) {
				if (x%i==0) {
					primo=false;
				}
				
			}
		return primo;
	}
	public static void main(String[] args) {
		int x=0, i=2;
		boolean centis = true, centis2=true;
		
		Scanner keyboard = new Scanner (System.in);
		
		
		do {
			centis = true;
			try {
				System.out.println("Introduce un número a descomponer");
				x = keyboard.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error, introduzca un carácter válido: ");
				centis = false;
			} 
			finally {
				keyboard.nextLine();
			}
		} while (!centis);
		do {
			if (primos(i)) {
				if (x % i == 0) {
					x /= i;
					System.out.printf("%d ", i);
				} else {
					i++;
				}
			} 
			else {
				i++;
			}
		} while (centis2);
		keyboard.close();
	}

}
