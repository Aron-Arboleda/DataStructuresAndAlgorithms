public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2, 3, 4, 7, 8, 9, 11, 13};
        int target = 9;
        System.out.print("Index of " + target + " from the array is: " + search(arr, target));
    }
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (target < arr[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
