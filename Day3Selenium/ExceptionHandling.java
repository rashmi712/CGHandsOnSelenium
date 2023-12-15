package Day3Exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 0;
		int result = 0;
		
		int a[] = new int[5];
		
		 try{
			 result = i/j;	
			 
			try { a[5] = 10;
			}
		 
		 catch (ArrayIndexOutOfBoundsException el) {
				System.out.println(el.getMessage());
				System.out.println("Array cannot hold more ");
				
			}
		finally {
			System.out.println("Processing Array");
		}
		 }
		catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		System.out.println("Result: " + result);
		}
		 

		
	
	}
}
