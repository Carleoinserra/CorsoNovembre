import java.util.Scanner;
public class Helloworld {

	public static void main(String[] args) {
		
		
		System.out.println("Ciao mondo!!!");
		
		// variabili numeriche in java
	    // numeri interi
		int num = 5;
		
		// numeri con la virgola
		double num1 = 5.3;
		
		final int  num2 = 6;
		
	   
		// le stringhe
		String parola = "ciao";
		
		/*
		 * 
		 * sono un commento su più lineee
		 */
		
		
		// booleani
		boolean ok = true;
		
		System.out.println(num + " " + num1 + " " + num + " " + parola);
		
		// System.out.print è equivalente a println ma non va a capo
		
		
		
		System.out.print(ok);
		System.out.print("ciao");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Scrivi il tuo nome: ");
		String nome = input.next();
		System.out.println("Benvenuto " + nome);
		
		
		
		

	}

}
