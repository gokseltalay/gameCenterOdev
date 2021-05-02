package gameCenterHomework;

public class ValiditaionService implements Validation {

	@Override
	public boolean validation(Customer customer, EDevlet devlet) {
		if(customer.getId()==devlet.getId()) {
			return true;
		}
		else {
			return false;
		}
}
}
