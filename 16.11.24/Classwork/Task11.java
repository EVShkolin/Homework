import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();

	int multiplication = 1;

	for (int i = 0; i < n; i++) {
	    int a = scan.nextInt();
	    if (a % 7 == 0) {
		multiplication *= a;
	    }
	}
	System.out.print(multiplication);
    }
}
