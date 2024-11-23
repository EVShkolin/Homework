import java.util.Scanner;


public class Task9 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double a = scan.nextDouble();

	System.out.println("в) " + f1(a));
	System.out.print("г) " + f2(a));

    }


    static double f1(double x) {
	if (x <= 0) {return 0;}
	else if (x <= 1) {return x;}
	else {return Math.pow(x, 4);}
    }

    static double f2(double x) {
	if (x <= 0) {return 0;}
	else if (x <= 1) {return x*x - 1;}
	else {return x*x - Math.sin(Math.PI * x * x);}
    }
}
