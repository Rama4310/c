import java.util.Scanner;

public class CountOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of an array");

		int[] cteven = new int[scan.nextInt()];

		int count = 0;

		int a = 0;
		while (a < cteven.length) {
			cteven[a] = scan.nextInt();
			a++;
		}

		int b = 0;
		while (b < cteven.length) {
			if (cteven[b] % 2 == 0) {
				System.out.print(cteven[b] + " ");
				count++;
			}
			b++;
		}
		System.out.println(" ");
		System.out.println("count of even number are " + count + ".");

	}

}
