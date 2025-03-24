import java.util.*;

public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		if (n < 0) {
			n = -n;
		}

		while (n > 3) {
			n = (n & 3) + (n >> 2);
		}

		if (n == 0 || n == 3)
			System.out.println("Divisible by 3");
		else
			System.out.println("Not divisible by 3");
		sc.close();
	}
}