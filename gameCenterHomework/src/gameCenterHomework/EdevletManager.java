package gameCenterHomework;

public class EdevletManager {
	private Logger[] loggers;
	public EdevletManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	public void control(Customer customer, EDevlet eDevlet) {
		if(customer.getId()==eDevlet.getId()) {
			System.out.println("M��teri do�ruland�");
			
		}else {
			System.out.println("M��teri farkl�");
		}
		
		
	}
	
	
}
