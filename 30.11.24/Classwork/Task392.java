import java.util.Scanner;


class Task392 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int[][] matrix = new int[8][8];
	
	for (int i = 0; i < 8; i++) {
	    for (int j = 0; j < 8; j++) {
		matrix[i][j] = scan.nextInt();
	    }
	}
	
	int minNum = Integer.MAX_VALUE;
	int maxColumnSum = Integer.MIN_VALUE;

	for (int i = 0; i < 8; i++) {
	    int columnSum = 0;
	    int currentMinNum = Integer.MAX_VALUE;

	    for (int j = 0; j < 8; j++) {
		columnSum += Math.abs(matrix[j][i]);

		if (matrix[j][i] < currentMinNum) {currentMinNum = matrix[j][i];}
	    }

	    if (columnSum > maxColumnSum) {
		maxColumnSum = columnSum;
		minNum = currentMinNum;
	    }
	}

	System.out.print(minNum);
    }
}

