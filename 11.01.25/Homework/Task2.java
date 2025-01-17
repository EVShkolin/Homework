import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Pattern pattern = Pattern.compile("-?[24680]{4,5}");
        int counter = 0;
        int printedNums = 0;

        while (printedNums < 10) {
            int num = rand.nextInt();
            Matcher matcher = pattern.matcher(num + "");
            if (matcher.matches()) {
                System.out.println(num);
                printedNums++;
            }
            counter++;
        }
        System.out.println("Total: " + counter);
    }
}
