package paint;

import java.util.Arrays;
import java.util.List;

public class PaintWizard {

	private List<Paint> paints;

	public PaintWizard(Paint... paints) {
		this.paints = Arrays.asList(paints);
	}

	public Paint leastWaste(int roomSize) {
		Paint minPaint = null;
		int minWaste = Integer.MAX_VALUE;
		for (Paint p : this.paints) {
			int _waste = p.calcWaste(roomSize);
			if (_waste < minWaste) {
				minPaint = p;
				minWaste = _waste;
			}
		}
		System.out.println(
				"The most efficient paint was " + minPaint.getName() + ", it wasted " + minWaste + "msq of paint.");
		return minPaint;
	}

	public Paint cheapest(int roomSize) {
		Paint minPaint = null;
		float minPrice = Float.MAX_VALUE;
		for (Paint p : this.paints) {
			float _price = p.calcPrice(roomSize);
			if (_price < minPrice) {
				minPaint = p;
				minPrice = _price;
			}
		}
		System.out.println("The cheapest paint was " + minPaint.getName() + ", it cost £" + minPrice + ".");
		return minPaint;
	}

}