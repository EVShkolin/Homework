import java.util.Scanner;


public class Task7 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int m = n;

	int sum = 0, count = 0;

	while (n != 0) {
	    sum += n % 10;
	    count++;
	    n /= 10;
	}

	System.out.println("В числе " + m + " " + count + " цифр");
	System.out.println("Сумма цифр равна " + sum);
	System.out.println("Первая цифра равна " + m / (int)Math.pow(10, count - 1) );
	
	if (m >= 10) {
	    System.out.println("Предпоследняя цифра равна " + m / 10 % 10);
	}
    }
}
