import java.util.Scanner;


class Task384 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int m = scan.nextInt();
	int n = scan.nextInt();

	double[][] matrix = new double[m][n];
	double sum = 0;

	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = scan.nextDouble();
	    }
	}
	
	for (double[] line : matrix) {
	    double maxNum = Double.MIN_VALUE;
	    
	    for (double num : line) {
		if (num > maxNum) {maxNum = num;}
	    }
	    
	    sum += maxNum;
	}

	System.out.print(sum);

    }
}
