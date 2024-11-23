import java.util.Scanner;


public class Task14 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int i = scan.nextInt(), n = scan.nextInt();
	int sum = 0, count = 0;
	
	for (int j = 1; j <= n; j++) {
	    if (j != i) {
		sum += scan.nextInt();
		count++;
	    }
	    else {
		scan.nextInt();
	    }
	}
	
	System.out.print((double)sum / count);
    }
}
