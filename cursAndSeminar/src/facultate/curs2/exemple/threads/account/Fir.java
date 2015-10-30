package facultate.curs2.exemple.threads.account;

public class Fir extends Thread{
	
	@Override
	public void run(){
		for(int i = 0; i<10; i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Cont.extragere((int)(Math.random() * 500));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
