package Try;
import java.util.*;

public class OwnEffortInserting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Object[] arr = {123,789,87,7843,458724,6,444,null};
        System.out.println("Inserting an item in an array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.print("\nWhat number would you like to insert: ");
        int item = input.nextInt(); input.nextLine();
        System.out.print("Insert in index: ");
        int index = input.nextInt(); input.nextLine();
        Object[] insertedList = insert(arr, index, item);
        System.out.println();
        for (int i = 0; i < insertedList.length; i++) {
            System.out.println("insertedList[" + i + "] = " + insertedList[i]);
        } 
    }

    public static Object[] insert(Object[] arr, int index, int item){
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        return arr;
    }
}
