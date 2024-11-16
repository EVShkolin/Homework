import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt(), b = scan.nextInt();

	double z = scan.nextDouble();

	int x = a % b;

	if (x == 0) {
	    z *= x;
	}
	else {
	    z /= x;
	}
	
	System.out.print(z);
    }
}
