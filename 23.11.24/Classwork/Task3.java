import java.util.Scanner;


class Task3 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int[] nums = new int[n];
	int maxSum = 0;
	int minSum = 999999;
	int maxNumIndex = 0;
	int minNumIndex = 0;

	for (int i = 0; i < n; i++) {
	    nums[i] = scan.nextInt();
	}

	for (int i = 0; i < n - 1; i++) {
	    if (nums[i] + nums[i+1] > maxSum) {
		maxSum = nums[i] + nums[i+1];
		maxNumIndex = i + 1;
	    }
	    if (nums[i] + nums[i+1] < minSum) {
		minSum = nums[i] + nums[i+1];
		minNumIndex = i+1;
	    }
	}

	System.out.println("а) " + maxSum);
	System.out.println("б) " + minSum);
	System.out.println("в) " + maxNumIndex + " " + (maxNumIndex + 1));
	System.out.println("г) " + minNumIndex + " " + (minNumIndex + 1));
    }
}
