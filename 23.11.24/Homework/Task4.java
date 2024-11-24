import java.util.Scanner;
import java.util.Arrays;


class Task4 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int m = scan.nextInt();
	int n = scan.nextInt();
	double sum = 0;

	double[][] matrix = new double[m][n];

	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = scan.nextDouble();
	    }
	}

	for (double[] arr : matrix) {
	    sum += maximum(arr);
	}

	System.out.print(sum);
    }


    static double maximum(double[] arr) {
	double max = Integer.MIN_VALUE;
	for (double i : arr) {
	    if (i > max) {
		max = i;
	    }
	}
	return max;
    }
}


