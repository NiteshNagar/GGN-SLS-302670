import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		System.out.println("enter the number.");
		Scanner in = new Scanner(System.in);
		int num_rows = in.nextInt();
		in.close();

		for (int i = num_rows; i >= 1; i--) {
			for (int k = 0; k < num_rows - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");

			System.out.print("\n");
		}
	}
}
