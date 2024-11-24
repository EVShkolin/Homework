import java.util.Scanner;
import java.util.Arrays;


class Task5 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	int[] arr = new int[6];
	int index = 0;

	while (n != 0) {
	    arr[index] = n % 10;
	    n /= 10;
	    index++;
	}	

	for (int i = 0; i < index; i++) {
	    System.out.print(arr[i] + " ");
	}

    }
}



