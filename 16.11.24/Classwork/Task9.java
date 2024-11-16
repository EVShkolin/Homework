import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	int sum = 0, count = 0;

	for (int i = 0; i < n; i++) {
	    int a = scan.nextInt();
	    if (a % 5 == 0 && a % 7 != 0) {
		sum += a;
		count++;
	    }
	}
	System.out.print("Количество = " + count + ", сумма = " + sum);
    }
}