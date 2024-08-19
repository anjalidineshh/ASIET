import java.util.*;
public class multimat
{
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	       
	        System.out.print("Enter the number of rows of the first matrix: ");
	        int row1 = s.nextInt();
	        System.out.print("Enter the number of columns of the first matrix: ");
	        int col1 = s.nextInt();

	        System.out.print("Enter the number of rows of the second matrix: ");
	        int row2 = s.nextInt();
	        System.out.print("Enter the number of columns of the second matrix: ");
	        int col2 = s.nextInt();

	        if (col1 != row2) {
	            System.out.println("Matrix multiplication is not possible with these dimensions.");
	            return;
	        }
	        int[][] matrix1 = new int[row1][col1];
	        int[][] matrix2 = new int[row2][col2];
	        int[][] result = new int[row1][col2];
	        System.out.println("Enter the elements of the first matrix:");
	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < col1; j++) {
	                matrix1[i][j] = s.nextInt();
	            }
	        }
	        System.out.println("Enter the elements of the second matrix:");
	        for (int i = 0; i < row2; i++) {
	            for (int j = 0; j < col2; j++) {
	                matrix2[i][j] = s.nextInt();
	            }
	        }

	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < col2; j++) {
	                for (int k = 0; k < col1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        System.out.println("The product of the matrices is:");
	        for (int i = 0; i < row1; i++) {
	            for (int j = 0; j < col2; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


