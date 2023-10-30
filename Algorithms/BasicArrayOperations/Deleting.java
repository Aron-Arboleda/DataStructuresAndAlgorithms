package BasicArrayOperations;
import java.util.Scanner;

public class Deleting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int LA[] = {123,78,2312,45,345234};
		int n = 5, i, j;

		System.out.println("The original array elements are :");
		for(i = 0; i < n; i++) {
			System.out.println("LA[" + i + "] = " + LA[i]);
		}
		
		System.out.print("\nDelete the item at position: ");
		int k = input.nextInt(); input.nextLine();

		j = k;

		while(j < n) {
			LA[j-1] = LA[j];
			j = j + 1;
		}
		
		n = n - 1;

		System.out.println("\nThe array elements after deletion :");
		for(i = 0; i < n; i++) {
			System.out.println("LA[" +  i +"] = " + LA[i]);
		}
	}
}

