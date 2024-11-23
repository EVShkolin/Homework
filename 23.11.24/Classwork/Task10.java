import java.util.Scanner;
import java.util.Arrays;


class Task10 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int k = scan.nextInt();
	double[] numbers = new double[k];

	double maxNum = Double.MIN_VALUE;
	double minNum = Double.MAX_VALUE;
	int maxIndex = 0;
	int minIndex = 0;
	
	for (int i = 0; i < k; i++) {
	    double a = scan.nextDouble();
	    numbers[i] = a;
	    if (a > maxNum) {
		maxNum = a;
		maxIndex = i;
	    }
	    if (a < minNum) {
		minNum = a;
		minIndex = i;
	    }
	}

	
	double[] numbers2 = Arrays.copyOf(numbers, k);
	double[] numbers3 = Arrays.copyOf(numbers, k);
	double[] numbers4 = Arrays.copyOf(numbers, k);


	int m = scan.nextInt() - 1;
	int n = scan.nextInt() - 1;
	double temp = 0;
	
	// 2 и 5 элементы
	temp = numbers[1];
	numbers[1] = numbers[4];
	numbers[4] = temp;

	// m-й и n-й элементы
	temp = numbers2[m];
	numbers2[m] = numbers2[n];
	numbers2[n] = temp;

	// 3 и максимальный
	temp = numbers3[2];
	numbers3[2] = numbers2[maxIndex];
	numbers3[maxIndex] = temp;

	// 1 и минимальный
	temp = numbers4[0];
	numbers4[0] = numbers3[minIndex];
	numbers4[minIndex] = temp;
	
	System.out.println("2 и 5 элементы");
	System.out.println(Arrays.toString(numbers));

	System.out.println("m-й и n-й элементы");
	System.out.println(Arrays.toString(numbers2));

	System.out.println("3 и максимальный");
	System.out.println(Arrays.toString(numbers3));

	System.out.println("1 и минимальный");
	System.out.println(Arrays.toString(numbers4));
	
    }
}

