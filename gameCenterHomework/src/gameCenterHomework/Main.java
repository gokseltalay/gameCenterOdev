package gameCenterHomework;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {};
		EdevletManager edevletManager=new EdevletManager(loggers);
		Customer g�ksel = new Customer(1, "G�ksel", "Talayo�lu");
		EDevlet ki�i =new EDevlet(1,"G�ksel","Talayo�lu");
		edevletManager.control(g�ksel, ki�i);
		
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer g�ksel1 = new Customer(1, "G�ksel", "Talayo�lu");
		customerManager.add(g�ksel);
		
		GameManager gameManager=new GameManager(loggers);
		GameCenter oyun1 =new GameCenter(14, "Forza Horizon", 456);
		gameManager.buy(g�ksel, oyun1);
		
		
	}

}
