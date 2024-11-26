import java.util.Scanner;

public class TestRandom {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int range = (1 - 0) + 1;
		
		int random = (int) ((range * Math.random()) + 0);
		
		System.out.println(random);
		
		
	/*	
		int score = 5;
		boolean vinto = false;
		
		
		do {
		System.out.println("Indovina il numero: ");
		int numero = input.nextInt();
		
		if (numero > random) {
			
			System.out.println("Il numero che hai inserito è maggiore");
		}
		else if (numero == random) {
			
			System.out.println("Hai vinto!!!!");
			score = 0;
			vinto = true;
		}
		else {
			
			System.out.println("Il numero che hai inserito è minore");
			
		}
		
		score--;
		
			
		}
		
		while (score > 0);
		
		if (vinto == false) {
			
			System.out.println("Numero di tentativi esauriti!!! GAME OVER");
		}
		
		
	}*/

}}
