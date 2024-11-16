import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Введите переменную a :  ");
	
	double a = scan.nextDouble();

	System.out.print("Введите переменную n :  ");

	int n = scan.nextInt();
	scan.nextLine();


	System.out.print("Введите функцию (a, b, c) :   ");
	String choice = scan.nextLine();

	if (choice.equals("a")) {
	    System.out.print(f(a, n));
	}
	else if (choice.equals("b")) {
	    System.out.print(g(a, n));
	}
	else if (choice.equals("c")) {
	    System.out.print(t(a, n));
	}
	else {
	    System.out.print("Неверная функция");
	}

    }


    static double f(double a, int n) {
	return Math.pow(a, n);
    }

    static double g(double a, int n) {
	double mult = 1;

	for (int i = 0; i < n; i++) {
	    mult *= (a + i);
	}

	return mult;
    }

    static double t(double a, int n) {
	double sum = (double)1 / a;

	for (int i = 1; i <= n; i++) {
	    a *= (a + i);
	    sum += (double)1 / a;
	}
	
	return sum;
    }
}
