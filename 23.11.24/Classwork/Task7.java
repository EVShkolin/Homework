import java.util.Scanner;


class Task7 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double[] numbers = new double[n];
	
	for (int i = 0; i < n; i++) {
	    numbers[i] = scan.nextDouble();
	}

	double sum = 0;
	double mult = 1;
	double sumOfSquares = 0;
	double sumFirst6 = 0;
	
	int k1 = scan.nextInt();
	int k2 = scan.nextInt();
	double sumk = 0;

	for (int i = 0; i < n; i++) {
	    sum += numbers[i];
	    mult *= numbers[i];
	    sumOfSquares += numbers[i] * numbers[i];
	    
	    if (i < 6) {
		sumFirst6 += numbers[i];
	    }

	    if (i >= k1 - 1 && i >= k2 - 1) {
		sumk += numbers[i];
	    }
	    
	}

	System.out.println("а) " + sum);
	System.out.println("б) " + mult);
	System.out.println("в) " + sumOfSquares);
	System.out.println("г) " + sumFirst6);
	System.out.println("д) " + sumk);
	System.out.println("е) " + (sum / n));
	System.out.println("ж) " + sumk / (k2 - k1 + 1));
    }
}

