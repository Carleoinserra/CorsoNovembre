
public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ora = 18;
		int minuti = 50;
		
		if (ora >= 0 && ora <= 24 && minuti >= 0 && minuti <= 60) {
			
			System.out.println("Ora accettata");
		}
		
		else {
			System.out.println("Non è un orario");
		}
		
		boolean ora_ok = ora >= 0 && ora <= 24;
		boolean minuti_ok = minuti >= 0 && minuti <= 60;
		
		if (ora_ok && minuti_ok) {
			System.out.println("Ora accettata");
		}
		
		else {
			System.out.println("Non è un orario");
		}
		
		
		if (!ora_ok && !minuti_ok) {
			System.out.println("Non è un orario");
		}
		else {
			System.out.println("Ora accettata");
		}
		}

	}


