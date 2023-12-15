package practiceSession;

public class Calculator {

		public static void main(String args[]){ 
			
		int n1 = 225, n2 = 115; 
		float l1 = 104.5f, l2 = 250.6f;
		float l3 = subtract(l1,l2);
		int c = add(n1,n2);
		double x = 5.2;
		double y = 10.4;
		double z = add(x,y);
		System.out.println("The sum of numbers is: "+c); 
		System.out.println("x + y: "+z);
		System.out.println("The difference of numbers is "+l3);
		
		}
		public static int add(int a,int b)   //n1 and n2 are formal parameters  
		{  
		int s;  
		s=a+b;  
		return s; //returning the sum  
		} 
		public static double add(double c,double d)   //n1 and n2 are formal parameters  
		{  
		double z;  
		z = c +d; 
		return z; //returning the sum  
		} 
		public static float subtract(float f1,float f2) 
		{
		float f3;
		f3 = f2-f1;
		return f3;
			
		}
}  

