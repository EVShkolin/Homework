import java.util.Scanner;


public class Task6 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Действительное число a : ");
	double a = scan.nextDouble();

	System.out.print("Натуральное число n : ");
	int n = scan.nextInt();
	scan.nextLine();

	System.out.print("Вычислить (a, b) : ");
	String choice = scan.nextLine();

	if (choice.equals("a")) {
	    System.out.print(f1(a, n));
	}
	else if (choice.equals("b")) {
	    System.out.print(f2(a, n));
	}
	else {
	    System.out.print("Неверный ввод");
	}
    }


    static double f1(double a, int n) {
	double sum = 0;

	for (int i = 0; i <= n; i++) {
	    sum += 1 / (Math.pow(a, Math.pow(2, i)));
	}

	return sum;
    }


    static double f2 (double a, int n) {
	double mult = 1;

	for (int i = 0; i <= n; i++) {
	    mult *= (a - i * n);
	}

	return mult;
    }
}












