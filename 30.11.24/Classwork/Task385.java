import java.util.Scanner;


class Task385 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();

	double[][] matrix = new double[n][n];

	double minNum = Integer.MAX_VALUE;
	int lineIndex = 0;
	double sum = 0;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		double a = scan.nextDouble();
		matrix[i][j] = a;
		
		if (a < minNum) {
		    minNum = a;
		    lineIndex = i;
		}
	    }
	}

	for (int i = 0; i < n; i++) {
	    sum += matrix[lineIndex][i];
	}
	
	System.out.print(sum);

    }
}
