import java.util.Scanner;
import java.util.ArrayList;


public class Task2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> numbers = new ArrayList<>();

	int localMax = 0;

	while (scan.hasNextInt()) {
	    int a = scan.nextInt();
	    numbers.add(a);
	}

	for (int i = 0; i < numbers.size() - 2; i++) {
	    if (numbers.get(i) < numbers.get(i+1) && numbers.get(i+1) > numbers.get(i+2)) {
		localMax++;
	    }
	}

	System.out.print(localMax == 2);
    }
}
