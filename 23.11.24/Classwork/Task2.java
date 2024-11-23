import java.util.Scanner;


class Task2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double maxSum = 0;
	double minMult = 999999;

	for (int i = 0; i < n; i++) {
	    double a = scan.nextDouble();
	    double b = scan.nextDouble();

	    if (a + b > maxSum) {
		maxSum = a + b;
	    }
	    if (a * b < minMult) {
		minMult = a * b;
	    }
	}

	System.out.println("Маскимальная сумма значений чисел в паре = " + maxSum);
	System.out.println("Минимальное произведение значений чисел в паре = " + minMult);	
    }
}
