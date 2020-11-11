package arrays1;
/*  Simple KBC app */
public class KBCApp {

	public static void main(String[] args) {
		KBCSystem app = new KBCSystem();
		app.startGame();
		int priceWon = app.getPrice();
		System.out.println(" User <Name> won "+priceWon);
	}
}
