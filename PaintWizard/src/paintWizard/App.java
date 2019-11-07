package paintWizard;

public class App {

	
	public static void main(String[] args) {
		
		PaintStore pS = new PaintStore();
		pS.addPaint(new Paint("CheapoMax", 19.99, 210));
		pS.addPaint(new Paint("ThatOneWithTheDog", 34.38, 480));
		pS.addPaint(new Paint("AverageJoes", 17.99, 176));
		pS.addPaint(new Paint("DuluxourousPaints", 25.00, 220));
		pS.printPaints();
		Paint cheapestPaint = pS.cheapest();
		Paint leastWaster = pS.leastWaste();
		
		
		
		
	}
	
	
}
