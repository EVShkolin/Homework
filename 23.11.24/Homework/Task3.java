import java.util.*;


class Task3 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	Double[] array = new Double[n];
	
	for (int i = 0; i < n; i++) {
	    array[i] = scan.nextDouble();
	}

	ArrayList<Double> uniqueElements = new ArrayList<>();
	ArrayList<Double> repeatedElements = new ArrayList<>();

	for (double i : array) {
	    if (count(array, i) == 1) {
		uniqueElements.add(i);
	    }
	    else if (!repeatedElements.contains(i)) {
		repeatedElements.add(i);
	    }
	}


	System.out.println("Числа, входящие 1 раз: ");
	System.out.println(uniqueElements);

	System.out.println("Числа, входящие более 1 раза: ");
	System.out.println(repeatedElements);

	System.out.println("Число различных членов последовательности: ");
	System.out.println(uniqueElements.size());

	System.out.println("Число повторяющихся чисел: ");
	System.out.println(array.length - uniqueElements.size());

	System.out.println("Если ли 1 пара совпадающих чисел: ");
	System.out.println(uniqueElements.size() != 0);


    }


    static int count(Double[] arr, double num) {
	int counter = 0;
	for (double x : arr) {
	    if (x == num) {
		counter++;
	    }
	}

	return counter;
    }
}



