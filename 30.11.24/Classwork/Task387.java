import java.util.Scanner;
import java.util.Arrays;


class Task387 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double[][] matrix = new double[n][n];

	double maxNum = Integer.MIN_VALUE;
	boolean onMainDiagonal = false;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		double a = scan.nextDouble();
		matrix[i][j] = a;
		
		if (a > maxNum) {
		    maxNum = a;

		    if (i == j) {onMainDiagonal = true;}   
		    else {onMainDiagonal = false;}
		}
	    }
	}

	double[] sequence = new double[n+5];
	double multiplier = onMainDiagonal ? 10 : 0.5;

	for (int i = 0; i < n + 5; i++) {
	    sequence[i] = scan.nextDouble() * multiplier;
	}

	System.out.print(Arrays.toString(sequence));

    }
}
