package excepciones;

public class Ejercicio3 {
	
	/*	Lee los números del 1 al 10000 
	 *  Muestra en pantalla cuáles de esos números son primos  
	 */
	// Lee los números del 1 al 10000 
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
	
	public static boolean testjunit (int x) {
		boolean centis=true;
		
		if(x%2==0 && x!=2) {
			centis=false;
		}
		for(int i=3; i<x; i+=2) {
			if (x%i==0) {
				centis=false;
			}
		}
		return centis;
	}
	public static void main(String[] args) {
		// Muestra en pantalla cuáles de esos números son primos 
		primos();
	}

}
