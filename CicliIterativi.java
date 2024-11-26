import java.util.Scanner;
public class CicliIterativi {

	public static void main(String[] args) {

Scanner input = new Scanner(System.in);		
		
int cont = 0;
		while (cont <= 10) {
			
			cont++;
			if (cont % 2 == 0) {
			System.out.println(cont);}
		}

		for (int i = 0; i <= 10; ++i) {
			
			System.out.println(i);
		}	
	
int scelta = 0;

/*do {
	System.out.println("Qualsiasi tasto 0 per terminare: ");
	scelta = input.nextInt();
	
	
}*/

while (scelta != 0);


for (int i = 1; i <= 10; ++i) {
	if (i % 2 != 0)
	System.out.println(i);
}

for (int i = 1; i <= 10; i++) {
	
	for (int j = 1; j <= 10; j++) {
		
		System.out.print(i * j + "  ");
		
	}
	
	System.out.print("\n");
}


}}
