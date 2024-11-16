import java.util.ArrayList;
import java.util.Scanner;


public class Task8 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<>();

	boolean hasLocalMax = false;

	while (scan.hasNextInt()) {
	    int a = scan.nextInt();
	    arr.add(a);
	}

	for (int i = 0; i < arr.size() - 2; i++) {
	    if (arr.get(i+1) > arr.get(i) && arr.get(i+1) > arr.get(i+2)) {
	        if (arr.get(i+1) % 2 == 0) {
		    hasLocalMax = true;
		    break;
		}
	    }
	}

	System.out.print(hasLocalMax);
    }
}
