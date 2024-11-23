import java.util.Scanner;


class Task13 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int m = scan.nextInt();
	double[][] matrix = new double[n][m];

	double maxValue = Double.MIN_VALUE;
	double minValue = Double.MAX_VALUE;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		matrix[i][j] = scan.nextDouble();
	    }
	}

	for (double[] arr : matrix) {
	    for (double num : arr) {
		if (num > maxValue) {
		    maxValue = num;
		}
		if (num < minValue) {
		    minValue = num;
		}
	    }
	}

	System.out.print((maxValue + minValue) / 2);
    }
}

