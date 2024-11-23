import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	final double PI = 3.141592653589793;

	int m = scan.nextInt(), n = scan.nextInt();
	
	if (Math.abs((double)m / n - PI)  < Math.abs((double)n / m - PI)) {

	    System.out.print("m * 10 = " + m * 10);

	}
	else {

	    System.out.print("n * 2 = " + n * 2);

	}
    }
}
