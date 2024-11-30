import java.util.Scanner;


class Task382 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	double[][] matrix = new double[6][9];
	double maxNum = Integer.MIN_VALUE;
	double minNum = Integer.MAX_VALUE;

	for (int i = 0; i < 6; i++) {
	    for (int j = 0; j < 9; j++) {
		double a = scan.nextDouble();
		matrix[i][j] = a;
		
		if (a > maxNum) {maxNum = a;}
		if (a < minNum) {minNum = a;}
	    }
	}
	
	System.out.print((maxNum + minNum) / 2);

    }
}