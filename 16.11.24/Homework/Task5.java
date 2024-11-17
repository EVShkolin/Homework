import java.util.Scanner;
import java.util.Arrays;


public class Task5 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	double[] numbers = new double[n];

	for (int i = 0; i < n; i++) {
	    double num = scan.nextDouble();
	    
	    if (num < 0) {
		numbers[i] = num + 0.5;
	    }
	    else {
		numbers[i] = 0.1;
	    }
	}
	
	System.out.print(Arrays.toString(numbers));
    }
}
