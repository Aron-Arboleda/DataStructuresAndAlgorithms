//Name: Aron Rez D. Arboleda
//Section: BSCS-2D
//Array Operations Case Study CC4

package BasicArrayOperations;

//imported modules
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        try {
            //Initialized scanner for user input
            Scanner input = new Scanner(System.in);

            //Options for the user to pick array operations
            System.out.println("---------------Array Operations----------------");
            System.out.println("1 - Traversal ");
            System.out.println("2 - Retrieving ");
            System.out.println("3 - Updating ");
            System.out.println("4 - Deleting ");
            System.out.println("5 - Insertion ");
            
            //Getting the desired option
            System.out.print("Enter your desired option: ");
            int answer = input.nextInt(); input.nextLine();
            
            //Main array that can hold different values
            Object[] array = {"apple", 2, 2.9, "COMPSCI", "Java", "Blue", 12345, "BSCS", 3.14, "Tarlac", null};
            
            //Variables for tracking index and item 
            int index; 
            Object item;

            //Showing the elements inside the array before operating to give the user some context
            System.out.println("\nThe original array elements are :");
            show(array);

            //switch case syntax to choose a path based on the provided option of the user.
            switch (answer) {
                case 1:
                    System.out.println("\n====== Array Traversal ======");
                    //traversing through the array by showing the elements
                    int lengthOfArray = traverseAndCount(array);
                    System.out.println("Total number of elements: " + lengthOfArray + "\n(the extra slot in the array is also counted (null values(s)))");
                    break;
                case 2:
                    System.out.println("\n====== Array Retrieving ======");
                    
                    //Getting input
                    System.out.print("What is the item that you want retrieve? >>> ");
                    String itemForRetrieving = input.nextLine();

                    //updating the index variable with the index of the retrieved item.
                    index = retrieve(array, itemForRetrieving);

                    //output (index of the item) will show depending if the item is found or not.
                    if (index == -1){
                        System.out.println("Item is not found.");
                    } else {
                        System.out.println("Found value: " + itemForRetrieving);
                        System.out.println("Index of searched value: " + index);
                    }
                    break;
                case 3:
                System.out.println("\n====== Array Updating ======");
                    
                    //Getting input
                    System.out.print("What index do you want to update? >>> ");
                    index = input.nextInt(); input.nextLine();
                    System.out.print("Enter the replacement >>> ");
                    item = (Object) input.nextLine();
                    
                    //updating the array with the provided index and item if the provided index is valid.
                    if (index >= 0 && index < array.length - 2){
                        array[index] = item;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }

                    System.out.println("\nArray elements after updating:");
                    show(array);
                    
                    break;
                case 4:
                    System.out.println("\n====== Array Deleting ======");
                    
                    //Getting input
                    System.out.print("Delete the item at the index >>> ");
                    index = input.nextInt(); input.nextLine();
                    
                    //updating the array variable with the updated array (deleted an item)
                    array = delete(array, index);

                    //Showing the user the elements of the updated array after deletion
                    System.out.println("\nArray elements after deleting:");
                    show(array);
                    break;
                case 5:
                    System.out.println("\n====== Array Insertion ======");
                    
                    //Getting input
                    System.out.print("What is the item that you want insert? >>> ");
                    item = (Object) input.nextLine();
                    System.out.print("Where do you want to insert?(Enter the index) >>> ");
                    index = input.nextInt(); input.nextLine();
                    
                    //updating the array variable with the updated array (inserted with an item)
                    array = insert(array, item, index);
                    
                    //It will only show the updated array if the provided index is valid 
                    if (!(index < 0)){
                        System.out.println("\nArray elements after insertion:");
                        show(array);
                    }
                    break;
                default:
                    System.out.println("\nWrong input. Run again.");
                    break;
            }
        //providing error messages for different types of error when running the program.
        } catch (IndexOutOfBoundsException e) {
            System.out.println("The provided index is out of bounds. Try to run again.");
        } catch (InputMismatchException e) {
            System.out.println("Please enter the right input. Try to run again.");
        } catch (Exception e) {
            System.out.println("Program Error. Try to run again.");
        } 
    }

    //method to show the elements of the array.
    public static void show(Object[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        }
    }

    //method to allow the user to insert an item into an array 
    public static Object[] insert(Object[] arr, Object item, int index){
        //insert logic: moving the elements at the right side one step to provide space for the new item. 

        //if the index is greater than the length of the array, 
        //the item will be inserted at the last spot of the array since there is an available spot at the end
        //else it will do the algorithm and insert the item at the specific index
        if (index > arr.length - 2){
            arr[arr.length - 1] = item;
        } else {
            for (int j = arr.length - 2; j >= index; j--) {
                arr[j + 1] = arr[j];
            }
            arr[index] = item;
        }
        return arr;
    }

    //method to allow the user to delete an item on an array 
    public static Object[] delete(Object[] arr, int index){
        //if the provided index is out of bounds, the program will raise an IndexOutOfBoundsException.
        if (index > arr.length - 2 || index < 0){
            throw new IndexOutOfBoundsException();
        }
        
        //delete logic: moving the elements to the left side one step to overlap and replace the item that needs to be deleted
        int j = index + 1;
		while(j < arr.length) {
			arr[j-1] = arr[j];
			j = j + 1;
		}

        return arr;
    }

    //method to allow the user to delete an item on an array 
    public static int retrieve(Object[] arr, String item){
		//retrieving logic: traversing through the array to find the specific item and return its index.
        int j = 0;
        while (j <= arr.length - 2) {
            if (item.equals(arr[j].toString())) {
                break;
            }
            j = j + 1;
        }

        //returning -1 when the item is not found (j out of index bounds) and returning the index if the item is found.
        if (j > arr.length - 2){
            return -1;
        } else {
            return j;
        }
    }

    //method to traverse through the array and count the total number of items in the array. 
    public static int traverseAndCount(Object[] arr){
        //traversing logic: looping through the array to do a certain operation. (In this case counting the array's length)
		int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }
}
