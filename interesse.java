
public class interesse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo = 400;
		final double tasso = 0.04;
		double interesse = 0;
		if ( saldo >=0) {
			System . out . println (" Saldo positivo ");
			 interesse = saldo * tasso ;
			saldo = saldo + interesse ;
			}
			System . out . println ( interesse ); // ERRORE !
	}

}
