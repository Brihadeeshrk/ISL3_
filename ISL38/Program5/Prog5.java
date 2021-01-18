/*
Write a java program to read 2 matrices and place the product in a third matrix.
 Use constructors and suitable methods.
*/

import java.util.*;

class Prog5 {
    public static void main(String[] args) {
        int m, n, m1, n1, sum;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Rows and Columns of M1");
        m = ob.nextInt();
        n = ob.nextInt();
        System.out.println("Enter Rows and Columns of M2");
        m1 = ob.nextInt();
        n1 = ob.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m1][n1];
        if(n != m1) {
            System.out.println("Error");
			System.exit(0);
        }
        System.out.println("Enter Elements of M1");
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = ob.nextInt();
		System.out.println("Enter Elements of M2");
		for (int i = 0; i < m1; i++)
			for (int j = 0; j < n1; j++)
				b[i][j] = ob.nextInt();

        int[][] c = new int[m][n1];
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n1; j++) {
				sum = 0;
				for (int k = 0; k < n; k++) {
					sum = sum + a[i][k] * b[k][j];
				}
				c[i][j] = sum;
			}
		}
        System.out.println("Output: ");
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
    }
}