import java.util.Scanner;


class Task389 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int m = scan.nextInt();
	double[][] matrix = new double[n][m];

	double maxNum = Integer.MIN_VALUE;

	for (int i = 0; i < n; i++) {
	    double minNum = Double.MAX_VALUE;
	    for (int j = 0; j < m; j++) {
		double a = scan.nextDouble();
		matrix[i][j] = a;
		
		if (a < minNum) {
		    minNum = a;
		}
	    }

	    if (minNum > maxNum) {maxNum = minNum;}
	}

	boolean flag = true;

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < m; j++) {
		if (matrix[i][j] == maxNum) {
		    System.out.print(i + " " + j);
		    flag = false;
		    break;
		}
	    }

	    if (!flag) {break;}
	}

    }
}

