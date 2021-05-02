package gameCenterHomework;

public class GameCenter {
	private int id;
	private String gameName;
	private double price;
	private double discount;
	
	public GameCenter() {
		
	}

	public GameCenter(int id, String gameName, double price) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.price = price;
		this.discount=discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
