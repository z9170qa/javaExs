package flowchart;

public class Flowchart {


public String capitalA (int a) {

	if (a > 2000) {
		System.out.println("A");
		if (a > 6000) {
			return "C";
		}
		else {
			System.out.println("B");
		} 	if (a > 4000) {
				return "D";
			}
			else {
				return "E";
		}
		
	}
	else {
		System.out.println("1");
	}
		if (a > 100) {
			System.out.println("3");
		}
		else {
			return "2";
		}
			if (a > 600) {
				return "5";
		}
			else {
				System.out.println("4");
			}
				if (a > 500) {
					return "6";
				}
				else {
					return "7";
				}
		

}
}
