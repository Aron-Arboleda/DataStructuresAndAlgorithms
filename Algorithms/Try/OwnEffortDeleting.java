package Try;
import java.util.*;

public class OwnEffortDeleting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arr = {123,789,87,7843,458724,6,444,34};
        System.out.println("Deleting an item in an array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        } 
        System.out.print("\nEnter item index: ");
        int index = input.nextInt(); input.nextLine(); 
        int[] deletedList = delete(arr, index);


        
        System.out.println();
        for (int i = 0; i < deletedList.length - 1; i++) {
            System.out.println("deletedList[" + i + "] = " + deletedList[i]);
        }   
    }

    public static int[] delete(int[] arr, int index){
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        return arr;
    }
}
