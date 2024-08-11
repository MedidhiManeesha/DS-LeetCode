import java.util.HashMap;

public class EqualArrays {
    // Function to check if two arrays are equal or not.
    public static boolean check(int[] arr1, int[] arr2) {
        // Check if lengths are different
        if (arr1.length != arr2.length) {
            return false;
        }
        
        // Create hashmaps to store frequency counts of elements
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        // Populate the first hashmap with counts of elements from arr1
        for (int num : arr1) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        
        // Populate the second hashmap with counts of elements from arr2
        for (int num : arr2) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        
        // Compare the two hashmaps
        return map1.equals(map2);
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        System.out.println(check(arr1, arr2));  // Output: true

        int[] arr1b = {1, 2, 5};
        int[] arr2b = {2, 4, 15};
        System.out.println(check(arr1b, arr2b));  // Output: false
    }
}
