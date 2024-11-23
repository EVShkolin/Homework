import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int k = scan.nextInt();	

	switch (k) {
	    case 1: System.out.print("плохо");
		break;	
	    case 2: System.out.print("неудовлетворительно");
		break;	
	    case 3: System.out.print("удовлетворительно");
		break;	
    	    case 4: System.out.print("хорошо");
		break;	
	    case 5: System.out.print("отлично");
		break;	
	    default: System.out.print("ошибка");

	}

    }
}