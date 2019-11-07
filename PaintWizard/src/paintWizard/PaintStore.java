package paintWizard;

import java.util.ArrayList;
import java.util.List;

public class PaintStore {

	List<Paint> paints = new ArrayList<>();

	public PaintStore() {
		super();
	}

	public boolean addPaint(Paint paint) {
		return this.paints.add(paint);
	}

	public boolean removePaint(Paint paint) {
		return this.paints.remove(paint);
	}

	public void printPaints() {
		for (Paint p : paints) {
			System.out.println(p);
		}
	}

	public paint leastwaste(int roomSize) {
		Paint minpaint = null;
		int minWaste = Integer.MAX_VALUE;
		for (Paint p : this.paints) {
		
	}
}
