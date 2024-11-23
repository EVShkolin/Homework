import java.util.Scanner;


class Task1 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int currentNum = scan.nextInt();

	int maxNum = currentNum;
	int minNum = currentNum;
	int maxPosition = 1;
	int minPosition = 1;

	for (int i = 2; i <= n; i++) {
	    currentNum = scan.nextInt();

	    if (currentNum >= maxNum) {
		maxNum = currentNum;
		maxPosition = i;
	    }
	    else if (currentNum < minNum) {
		minNum = currentNum;
		minPosition = i;
	    }
	}

	System.out.println("Максимальный номер = " + maxPosition);
	System.out.println("Минимальный номер = " + minPosition);
    }
}