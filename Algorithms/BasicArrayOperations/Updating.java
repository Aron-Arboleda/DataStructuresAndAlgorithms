package BasicArrayOperations;
import java.util.Scanner;

public class Updating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int LA[] = {1,3,5,7,8};
        int n = 5;

        System.out.println("The original array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println("LA["+ i + "] = " + LA[i]);
        }

        System.out.print("\nUpdate the item at position: ");
        int k = input.nextInt(); input.nextLine(); 
        System.out.print("Replacement number: ");
        int item = input.nextInt(); input.nextLine(); 

        LA[k-1] = item;

        System.out.println("\nThe array elements after updation: ");

        for (int i = 0; i < n; i++) {
            System.out.println("LA["+ i + "] = " + LA[i]);
        }
    }
}
