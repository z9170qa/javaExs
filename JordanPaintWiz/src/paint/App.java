package paint;

public class App {

	public static void main(String[] args) {
		PaintWizard wizard = new PaintWizard(new Paint("CheapoMax", 21, 19.99f, 10),
				new Paint("ThatOneWithTheDog", 40, 34.38f, 12), new Paint("AverageJoes", 16, 17.99f, 11),
				new Paint("DuluxourousPaints", 10, 25f, 22));
		Paint cheapest = wizard.cheapest(1500);
		Paint leastWaste = wizard.leastWaste(1500);
	}

}