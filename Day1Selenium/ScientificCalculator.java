package practiceSession;

public class ScientificCalculator extends Calculator implements calculatePF{
	
	public static void main (String[]args) {
		float result= add(100.17f, 208.92f);
		int result1 = Calculator.add(5, 8);
		float newresult = Calculator.subtract(15.6f, 20.8f);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(newresult);
		
	}
	//float add
		public static float add (float f1, float f2) {
			
		return f1 + f2;
		}
		@Override
		public int calcPF(int basic) {
			// TODO Auto-generated method stub
			return basic + 500;
		}
}
