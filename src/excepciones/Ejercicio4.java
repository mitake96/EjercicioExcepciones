package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
	
	/*  El usuario introduce un n�mero
	 *  El programa lee el n�mero y lo descompone en factores primos
	 *  Muestra el n�mero descomprimido y sus factores
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
				System.out.println("Introduce un n�mero a descomponer");
				x = keyboard.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error, introduzca un car�cter v�lido: ");
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
