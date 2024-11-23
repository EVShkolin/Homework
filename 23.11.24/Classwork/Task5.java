import java.util.Scanner;


class Task5 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int K = scan.nextInt();
	int num = 1;
	int greaterK = 0;

	while (num != 0) {
	    num = scan.nextInt();

	    if (num > K) {
		greaterK = num;
	    }
	}

	System.out.print(greaterK);
    }
}
