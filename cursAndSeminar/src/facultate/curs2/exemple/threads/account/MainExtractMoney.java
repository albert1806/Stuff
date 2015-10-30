package facultate.curs2.exemple.threads.account;

public class MainExtractMoney {

	public static void main(String[] args){
		Fir f1 = new Fir();
		Fir f2 = new Fir();
		f1.start();
		f2.start();
	}
}
