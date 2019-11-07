package animalInterface;

public abstract class Sword implements Weapon{
	public void attack(int baseDam, int modifier) {
		// TODO Auto-generated method stub
		int totDam = baseDam + modifier;
		System.out.println("Sword attack: " + totDam);
	}
		
	
}
