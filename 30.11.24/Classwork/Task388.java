import java.util.Scanner;


class Task388 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int[][] matrix = new int[17][17];
	int maxNum = Integer.MIN_VALUE;

	for (int i = 0; i < 17; i++) {
	    for (int j = 0; j < 17; j++) {
		int a = scan.nextInt();
		matrix[i][j] = a;
		
		if (a > maxNum) {maxNum = a;}
	    }
	}

	for (int i = 0; i < 17; i++) {
	    for (int j = 0; j < 17; j++) {
		if (matrix[i][j] == maxNum) {System.out.println(i + " " + j);}
	    }
	}
	
    }
}

