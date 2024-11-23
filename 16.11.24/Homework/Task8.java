import java.util.Scanner;
import java.util.Arrays;


public class Task8 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] numbers = new int[n];
	numbers[0] = 1;

	int count = 3;
	
	for (int i = 1; i < n; i++) {
	   
	    if (i % 2 == 0) {
		numbers[i] = count;	
	    }
	    else {
		numbers[i] = -count;
	    }

	    count += 2;
	}

	System.out.print(Arrays.toString(numbers));
    }

}
