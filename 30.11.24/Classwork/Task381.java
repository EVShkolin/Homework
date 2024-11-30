import java.util.Scanner;
import java.util.Arrays;


class Task381 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int[][] matrix = new int[10][10];
	int maxNum = Integer.MIN_VALUE;

	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		int a = scan.nextInt();
		matrix[i][j] = a;
		
		if (a > maxNum) {maxNum = a;}
	    }
	}

	for (int i = 0; i < 10; i++) {
	    for (int j = 0; j < 10; j++) {
		if (matrix[i][j] == (maxNum)) {matrix[i][j] = 0;}
	    }
	}
	
	for (int[] arr : matrix) {
	    System.out.println(Arrays.toString(arr));
	}

    }
}
