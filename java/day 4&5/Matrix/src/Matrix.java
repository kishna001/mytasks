public class Matrix {

    public static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < matrix.length; i++)
	  {
	    for (int j = 0; j < matrix[i].length; j++)
	    {
		System.out.print( matrix[i][j]  + "\t");
	     }
	     System.out.println();
	   }
	}
	public static void main(String[] args) {

		int[][] matrix = { { 3, 2, 1, 5 },
					 { 9, 11, 5, 4 },
					 { 6, 0, 13, 17 },
					 { 7, 1, 14, 15 } };
		printMatrix(matrix);
	}
}
