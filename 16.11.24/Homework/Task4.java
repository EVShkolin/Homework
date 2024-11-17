import java.util.Scanner;


public class Task4 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int counter = 0;

	for (int i = 0; i < n; i++) {

	    int num = scan.nextInt();
	    int len = (num + "").length();

	    if (oddOrEven(num) && (len == 3 || len == 5)) {
		counter++;
	    }
	}

	System.out.print(counter == 2);	
    }



    static boolean oddOrEven (int num) {
	
	int n = num % 2;  //  такая четность / нечетность должна быть у всех цифр

	while (num != 0) {

	    if (num % 10 % 2 != n) {
		return false;
	    }

	    num /= 10;

	}	

	return true;
    }
}
