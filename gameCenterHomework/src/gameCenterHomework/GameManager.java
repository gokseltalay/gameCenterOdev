package gameCenterHomework;

public class GameManager {
	private Logger[] loggers;
	public GameManager(Logger[] loggers) {
		this.loggers= loggers;
		
	}
	public void buy(Customer customer, GameCenter gameCenter) {
		System.out.println(gameCenter.getGameName()+" : oyunu alýndý");
		System.out.println(customer.getFirstName()+ " : oyunu alan kiþi");
			
	}
	public void discount(GameCenter gameCenter, Customer customer) {
		System.out.println(gameCenter.getGameName()+" : oyunu alýndý");
		System.out.println(customer.getFirstName()+ " : oyunu lan kiþi");
		System.out.println(gameCenter.getPrice());
	}
}
