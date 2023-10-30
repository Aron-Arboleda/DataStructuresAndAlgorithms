package BasicArrayOperations;
import java.util.Scanner;

public class Retrieving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int LA[] = { 1, 3, 5, 7, 8 };
        int n = 5, j = 0;

        System.out.println("The original array elements are :");
        for (int i = 0; i < LA.length; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        System.out.print("Search this item: ");
        int item = input.nextInt(); input.nextLine();

        while (j < n) {
            if (LA[j] == item) {
                break;
            }
            j = j + 1;
        }

        System.out.println("Found element " + item + " at position " + (j + 1));
    }
}
