package Day2Training;

public class singleDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars.length);
		cars[0] = "Opel";
		System.out.println(cars[0]);
		
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
	}

}
