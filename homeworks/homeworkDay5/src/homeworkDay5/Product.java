package homeworkDay5;

public class Product {
	int id;
	String gameName;
	double gamePrice;
	double gameDiscount;
	
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
	public double getGamePrice() {
		if (gameDiscount != 0)
			return ((100 - gameDiscount) / 100) * gamePrice;
		else
			return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public double getGameDiscount() {
		return gameDiscount;
	}
	public void setGameDiscount(double gameDiscount) {
		this.gameDiscount = gameDiscount;
	}
	
}
