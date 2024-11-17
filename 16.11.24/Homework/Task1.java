import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int k = scan.nextInt(), n = scan.nextInt();
	
	int result = 0;
	int i = 0;

	while (n != 0) {
	    
	    result += (n % 10) * Math.pow(k, i);
	    i++;
	    n /= 10;

	}	
	
	System.out.print(result);
    }
}
