import java.util.Scanner;
import java.util.Arrays;


class Task2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	double[] array = new double[n];
	

	int firstNegative = -1;
	int lastPositive = -1;
	
	for (int i = 0; i < n; i++) {
	    double a = scan.nextDouble();
	    array[i] = a;

	    if (a > 0) {
		lastPositive = i;
	    }
	    if (a < 0 && firstNegative < 0) {
		firstNegative = i;
	    }
	}

	if (firstNegative > 0) {	
	    double temp = array[firstNegative];
	    array[firstNegative] = array[lastPositive];
	    array[lastPositive] = temp;
	}
	
	System.out.print(Arrays.toString(array));
    }
}


