import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int hour = scan.nextInt();

	if (hour >= 6 && hour < 12) {
	    System.out.print("Доброе утро");
	}
	else if (hour >= 12 && hour < 18) {
	    System.out.print("Добрый день");
	}
	else if (hour >= 18 && hour <= 23) {
	    System.out.print("Добрый вечер");
	}
	else {
	    System.out.print("Доброй ночи");
	}
    }
}