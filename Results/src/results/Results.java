package results;

public class Results {
	
	int total, phys, chem, bio;
	boolean physPass = true, chemPass = true, bioPass = true;

	
	double percentage;
	
	private int total(int a, int b, int c) {
		total = a + b + c;
		return total;
	}
	private double percentage(double a, double b, double c) {
		return ((a + b + c)*100)/450;
	}
	
	public void printResults() {
		percentage = percentage(phys, chem, bio);
		total = total(phys, chem, bio);
		
		System.out.println("Physics: " + phys + "/150");
		System.out.println("Chemistry: " + chem + "/150");
		System.out.println("Biology: " + bio + "/150");
		System.out.println("Total: " + total + "/450");
		System.out.println("Percentage:" + percentage + "%");
			if (phys < 90) {
				physPass = false;
			}
			if (chem < 90) {
				chemPass = false;
			}
			if (bio < 90) {
				bioPass = false;
			}
			if (physPass == false) {
				System.out.println("You failed Physics!");
			}
			if (chemPass == false) {
				System.out.println("You failed Chemistry!");
			}
			if (bioPass == false) {
				System.out.println("You failed Biology!");
			}
			if (percentage < 60 | phys < 90 | chem < 90 | bio < 90) { 
				System.out.println("Lol you failed!");
		} else {
			System.out.println("Congrats, you passed!");
		}
	}
}
