import java.util.Scanner;
import java.util.Arrays;


class Task6 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int[] progression = new int[10];
	int a1 = scan.nextInt();
	progression[0] = a1;
	int p = scan.nextInt();

	for (int i = 1; i < 10; i++) {
	    progression[i] = a1 + p * i;
	}

	
	int[] fibonacci = new int[20];
	fibonacci[0] = 1;
	fibonacci[1] = 1;

	for (int i = 2; i < 20; i++) {
	    fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
	}

	System.out.println(Arrays.toString(progression));
	System.out.println(Arrays.toString(fibonacci));
	
    }
}
