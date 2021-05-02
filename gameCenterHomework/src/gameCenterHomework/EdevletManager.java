package gameCenterHomework;

public class EdevletManager {
	private Logger[] loggers;
	public EdevletManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	public void control(Customer customer, EDevlet eDevlet) {
		if(customer.getId()==eDevlet.getId()) {
			System.out.println("Müþteri doðrulandý");
			
		}else {
			System.out.println("Müþteri farklý");
		}
		
		
	}
	
	
}
