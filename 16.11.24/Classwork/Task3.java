import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double x = scan.nextDouble();

	System.out.println("1 – возвести число в квадрат; 2 – извлечь корень квадратный; 3 – вычислить синус; 4 – косинус");

	int a = scan.nextInt();

	switch (a) {
	    case 1: System.out.print(x * x);
		break;
	    case 2: System.out.print(Math.sqrt(x));
		break;
	    case 3: System.out.print(Math.sin(x));
		break;
	    case 4: System.out.print(Math.cos(x));
		break;
	    default: System.out.print("Неверная операция");
	}
    }
}
