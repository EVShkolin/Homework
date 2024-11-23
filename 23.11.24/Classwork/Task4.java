import java.util.Scanner;


class Task4 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int sum = 0;
	int num = 1;

	while (num != 0) {
	    num = scan.nextInt();

	    if (num > 0 && num % 2 == 0) {
		sum += num;
	    }
	}

	System.out.print(sum);
    }
}
