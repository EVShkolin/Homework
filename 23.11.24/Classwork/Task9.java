import java.util.Scanner;


class Task9 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double[] numbers = new double[n];
	
	for (int i = 0; i < n; i++) {
	    numbers[i] = scan.nextDouble();
	}

	for (int i = 0; i < n - 1; i++) {
	    for (int j = i; j < n - 1; j++) {
		if (numbers[j] > numbers[j+1]) {
		    double temp = numbers[j];
		    numbers[j] = numbers[j + 1];
		    numbers[j + 1] = temp;
		}
	    }
	}

	System.out.print(numbers[n-1]);
    }
}

