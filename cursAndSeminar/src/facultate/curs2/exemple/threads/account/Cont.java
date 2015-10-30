package facultate.curs2.exemple.threads.account;

public class Cont {
	static int balanta = 1000;
	static int cheltuieli = 0;
	
	static public synchronized void extragere(int valoare) throws Exception{
		if(valoare<=balanta){
			System.out.println("verif: " + valoare);
			balanta-=valoare;
			cheltuieli=+valoare;
			System.out.println("balanta: " + balanta);
			System.out.println("cheltuieli: " + cheltuieli);
		}
		else{
			throw new Exception("Suma de retragere e mai mare decat suma din cont");
			//System.out.println("respins: " + valoare);
		}
	}
}
