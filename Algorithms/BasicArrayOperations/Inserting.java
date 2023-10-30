package BasicArrayOperations;
import java.util.*;

public class Inserting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Object[] LA = {123, 789, 87, 7843, 458724, 6, 444, 123123, 123, 123, null};
        System.out.println("Inserting an item in an array");

        for (int i = 0; i < LA.length - 1; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        }

        System.out.print("\nWhat number would you like to insert: ");
        int item = input.nextInt(); input.nextLine();
        System.out.print("Insert in index: ");
        int k = input.nextInt(); input.nextLine();

        for (int j = LA.length - 2; j >= k; j--) {
            LA[j + 1] = LA[j];
        }
        LA[k] = item;

        System.out.println("\nThe array elements after insertion: ");
        for (int i = 0; i < LA.length; i++) {
            System.out.println("LA[" + i + "] = " + LA[i]);
        } 
    }
}
