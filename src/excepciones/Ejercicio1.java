package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
	
	/* Escribir una funci�n con 2 enteros y 1 car�cter
	 * Debe pedir si el usuario quiere sumar, restar, multiplicar o dividir y pedir dos n�meros para realizar la operaci�n
	 * Devolver el resultado
	 *		
	 */
	
	// Escribir una funci�n con 2 enteros y 1 car�cter
	
	public static int funcion(int num1, int num2, char account, int result) {
		char suma = '+', resta = '-', mult = '*', div = '/';
		if (account == suma) {
			result = num1+num2;
			System.out.printf("%d + %d = ",num1,num2);
		}
		else if (account == resta) {
			result = num1-num2;
			System.out.printf("%d - %d = ",num1,num2);
		}
		else if (account == mult) {
			result = num1*num2;
			System.out.printf("%d * %d = ",num1,num2);
		}
		else if (account == div) {
			result = num1/num2;
			System.out.printf("%d / %d = ",num1,num2);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0, y=0, result=0;
		char operacion=' ';
		boolean error=true;
		
		Scanner keyboard = new Scanner(System.in);
		
		do {
			//  Debe pedir si el usuario quiere sumar, restar, multiplicar o dividir y pedir dos n�meros para realizar la operaci�n
			try {
				do {
					System.out.println("Introduce una operaci�n a realizar (suma (+), resta (-), multiplicaci�n(*), divisi�n(/)");
					operacion = keyboard.next().charAt(0); //llamar un caracter
				} while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/');
				System.out.println("Introduce el primer n�mero: ");
				x = keyboard.nextInt();
				System.out.println("Introduce el segundo n�mero: ");
				y = keyboard.nextInt();
				error=false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Car�cter incorrecto");
			} 
			finally {keyboard.nextLine();}
		} while (error);
		System.out.println(funcion(x,y,operacion,result));	// operacion tomar�a el valor de account en la funci�n y result el de resultado
		
		keyboard.close();
		
		
	}

}
