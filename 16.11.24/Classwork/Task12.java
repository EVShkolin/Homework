import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Введите переменную :  ");
	
	double x = scan.nextDouble();
	scan.nextLine();

	System.out.print("Введите функцию (a, b) :   ");
	String choice = scan.nextLine();

	if (choice.equals("a")) {
	    System.out.print(f(x));
	}
	else if (choice.equals("b")) {
	    System.out.print(g(x));
	}
	else {
	    System.out.print("Неверная функция");
	}

	
    }

    static double f(double x) {
	if (x >= -2 && x < 2) {
	    return x*x;
	}
	else {
	    return 4;
	}
    }

    static double g(double x) {
	if (x <= 2) {
	    return x*x + 4*x + 5;
	}
	else {
	    return 1 / (x*x + 4*x + 5);
	}
    }

}
