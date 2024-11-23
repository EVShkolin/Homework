import java.util.Scanner;


class Task14 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double[][] matrix = new double[n][n];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		matrix[i][j] = scan.nextDouble();
	    }
	}

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		if (matrix[i][j] != 0) {
		    System.out.print("(" + i + "," + j + ") ");
		}
	    }
	}
    }
}

