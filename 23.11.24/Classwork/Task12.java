import java.util.Scanner;
import java.util.Arrays;


class Task12 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int m = scan.nextInt();
	double[][] matrix = new double[n][m];
	double maxNum = 0;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		double a = scan.nextDouble();
		matrix[i][j] = a;

		if (Math.abs(a) > Math.abs(maxNum)) {
		    maxNum = a;
		}
	    }
	}

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		matrix[i][j] /= maxNum;
		}
	    }

	for (double[] arr : matrix) {
	    System.out.println(Arrays.toString(arr));
	}
    }
}

