import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
	
	/* Escribir una función con 2 enteros y 1 carácter
	 * Debe pedir si el usuario quiere sumar, restar, multiplicar o dividir y pedir dos números para realizar la operación
	 * Devolver el resultado
	 * Sobrecargar la función anterior para que se puedan usar enteros y decimales
	 *		
	 */
	
	// Escribir una función con 2 enteros y 1 carácter
	
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
	
	// Sobrecargar la función anterior para que se puedan usar enteros y decimales
	
	public static double funcion(double num1, double num2, double account, double result) {
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
			//  Debe pedir si el usuario quiere sumar, restar, multiplicar o dividir y pedir dos números para realizar la operación
			try {
				do {
					System.out.println("Introduce una operación a realizar (suma (+), resta (-), multiplicación(*), división(/)");
					operacion = keyboard.next().charAt(0); //llamar un caracter
				} while (operacion != '+' && operacion != '-' && operacion != '*' && operacion != '/');
				System.out.println("Introduce el primer número: ");
				x = keyboard.nextInt();
				System.out.println("Introduce el segundo número: ");
				y = keyboard.nextInt();
				error=false;
			} catch (InputMismatchException e) {
				error = true;
				System.out.println("Carácter incorrecto");
			} 
			finally {keyboard.nextLine();}
		} while (error);
		System.out.println(funcion(x,y,operacion,result));	// operacion tomaría el valor de account en la función y result el de resultado
		
		keyboard.close();
		
		
	}

}