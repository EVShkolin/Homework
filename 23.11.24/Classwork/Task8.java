import java.util.Scanner;


class Task8 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double[] numbers = new double[n];
	
	for (int i = 0; i < n; i++) {
	    numbers[i] = scan.nextDouble();
	}
	
	double firstMax = Double.MIN_VALUE;
	double secondMax = Double.MIN_VALUE;
	double firstMin = Double.MAX_VALUE;
	double secondMin = Double.MAX_VALUE;

	int firstMaxIndex = 0;		
	int secondMaxIndex = 0;
	int firstMinIndex = 0;
	int secondMinIndex = 0;

	for (int i = 0; i < n; i++) {
	    if (numbers[i] >= firstMax) {
		secondMax = firstMax;
		firstMax = numbers[i];

		secondMaxIndex = firstMaxIndex;
		firstMaxIndex = i;
	    }
	    if (numbers[i] <= firstMin) {
		secondMin = firstMin;
		firstMin = numbers[i];

		secondMinIndex = firstMinIndex;
		firstMinIndex = i;
	    }	
	}

	System.out.println(secondMax);
	System.out.println(secondMin);
	System.out.println(secondMaxIndex);
	System.out.print(secondMinIndex);
    }
}

