import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	int sum = 0;

	for (int i = 0; i < n; i++) {
	    int a = scan.nextInt();
	    if (a > 0) {
		sum += a;
	    }
	}
	System.out.print(2 * sum);
    }
}
