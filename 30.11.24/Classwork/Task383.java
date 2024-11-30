import java.util.Scanner;


class Task381 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();

	int[][] matrix = new int[18][n];
	int maxNum = Integer.MIN_VALUE;

	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		int a = scan.nextInt();
		matrix[i][j] = a;
		
		if (Math.abs(a) > maxNum) {maxNum = Math.abs(a);}
	    }
	}

	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		if (matrix[i][j] == (maxNum)) {
		    System.out.print(i + " " + j);
		    break;
		}
	    }
	}

    }
}
