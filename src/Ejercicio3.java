
public class Ejercicio3 {
	
	/*	Lee los n�meros del 1 al 10000 
	 *  Muestra en pantalla cu�les de esos n�meros son primos  
	 */
	// Lee los n�meros del 1 al 10000 
	public static void primos(){
		int i, j;
		boolean primo=true;
		for (i=2; i<=10000; i++) {
			primo=true;
			for (j=2; j<=i && primo; j++) {
				if (i%j==0 && j!=i) {
					primo=false;
				}
				else {
					primo=true;
				}
			}
			if (primo) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		// Muestra en pantalla cu�les de esos n�meros son primos 
		primos();
	}

}