package Day2Training;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//		System.out.println(myNumbers[0][3]);
		myNumbers[1][2] = 9;
//		System.out.println(myNumbers[1][2]);
		
		//looping multi-dimensional array
		 for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
//		        System.out.println(myNumbers[i][j]);
		      }
		    }
		 
		 int a[][]= {{8,5,1},{4,3,1},{1,1,2}};
		 int b[][]= {{6,4,2},{5,3,2},{2,3,3}};
		 int c[][]= new int[3][3];
		 for (int row=0;row <3;row++) {
			 for (int col=0;col <3; col++) {
			 c[row][col]=  a[row][col]+ b[row][col];
			 System.out.println(c[row][col]+ " ");
			 }
			 System.out.println();
		 }
	}
	}

