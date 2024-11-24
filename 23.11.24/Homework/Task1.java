import java.util.Scanner;
import java.util.Arrays;


class Task1 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	double[] array1 = new double[15];

	double maxValue = Double.MIN_VALUE;
	double minValue = Double.MAX_VALUE;
	int maxIndex = 0;
	int minIndex = 0;
	
	for (int i = 0; i < 15; i++) {
	    double a = scan.nextDouble();
	    array1[i] = a;

	    if (a > maxValue) {
		maxValue = a;
		maxIndex = i;
	    }
	    if (a < minValue) {
		minValue = a;
		minIndex = i;
	    }
	}

	double[] array2 = Arrays.copyOf(array1, 15);
	double[] array3 = Arrays.copyOf(array1, 15);
	
	int k = scan.nextInt();
	int s = scan.nextInt() - 2;

	double temp = 0;

	for (int i = 2; i < 5; i++) {
	    temp = array1[i];
	    array1[i] = array1[9-i+1];
	    array1[9-i+1] = temp;
	}

	for (int i = k; i < s; i++, s--) {
	    temp = array2[i];
	    array2[i] = array2[s];
	    array2[s] = temp;
	}

	for (int i = Math.min(minIndex, maxIndex), j = Math.max(maxIndex, minIndex); i < j; i++, j--) {
	    temp = array3[i];
	    array3[i] = array3[j];
	    array3[j] = temp;
	}

	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
	System.out.println(Arrays.toString(array3));
	
    }
}

