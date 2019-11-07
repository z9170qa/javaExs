package exEx;

	public class ExEx {

	   public static void main(String[] args) {
	      try {
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	      } catch (ArrayIndexOutOfBoundsException aioube) {
	         System.out.println("Exception thrown  :" + aioube);
	      }
	      System.out.println("Out of the block");
	   }
	   
	   
	}
	

