import java.util.Scanner;


public class Task10 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	
	if (n % 10 == 1 && n != 11) {
	    System.out.print(n + " год");
	}
	else if ((n % 10 == 2 && n != 12) || (n % 10 == 3 && n != 13) || (n % 10 == 4 && n != 14)) {
	    System.out.print(n + " года");
	}
	else {
    	    System.out.print(n + " лет");
	}
    }
}
