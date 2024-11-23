import java.util.Scanner;


class Task11 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	

	int[][] matrix = new int[n][9];

	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < 9; j++) {
		matrix[i][j] = scan.nextInt();		
	    }
	}

	for (int i = 0; i < 9; i++) {
	    int sum = 0;

	    for (int j = 0; j < n; j++) {
		sum += matrix[j][i];
	    }
	    if (i % 2 == 1) {
	        System.out.print("Среднее арифметическое " + (i + 1) + " столбца = " + (sum / n) );
		System.out.println(" (четный столбец)");
	    }
	    else {
		System.out.println("Среднее арифметическое " + (i + 1) + " столбца = " + (sum / n) );

	    }
	}

    }
}

