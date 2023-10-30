public class removeElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Count of elements that are not equal to val
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Overwrite element at index k with non-val element
                k++; // Increment count
            }
        }
        
        return k;
    }
    
    public static void main(String[] args) {
        removeElement solution = new removeElement();
        int[] nums = {3, 2, 2, 3, 4, 5, 3};
        int val = 3;
        
        int result = solution.removeElement(nums, val);
        
        System.out.println("Remaining elements: " + result);
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
