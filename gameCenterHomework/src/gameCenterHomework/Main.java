package gameCenterHomework;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {};
		EdevletManager edevletManager=new EdevletManager(loggers);
		Customer göksel = new Customer(1, "Göksel", "Talayoðlu");
		EDevlet kiþi =new EDevlet(1,"Göksel","Talayoðlu");
		edevletManager.control(göksel, kiþi);
		
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer göksel1 = new Customer(1, "Göksel", "Talayoðlu");
		customerManager.add(göksel);
		
		GameManager gameManager=new GameManager(loggers);
		GameCenter oyun1 =new GameCenter(14, "Forza Horizon", 456);
		gameManager.buy(göksel, oyun1);
		
		
	}

}
