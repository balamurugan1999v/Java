package GFG;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class FindClosest {
	    public static int[] findClosestHigherFrequency(int[] arr) {
	        if (arr == null || arr.length == 0) {
	            return new int[0];
	        }

	        int n = arr.length;
	        // Step 1: Calculate frequencies of all elements
	        HashMap<Integer, Integer> freqMap = new HashMap<>();
	        for (int x : arr) {
	            freqMap.put(x, freqMap.getOrDefault(x, 0) + 1);
	        }

	        // Step 2: Initialize result array with -1
	        int[] ans = new int[n];
	        Arrays.fill(ans, -1);
	        System.out.println("Map" + freqMap);
	        System.out.println("ans" + Arrays.toString(ans));

	        // Step 3: Use a stack to store indices
	        // The stack will store indices of elements that are still looking for
	        // their next higher frequency element to the right.
	        Stack<Integer> stack = new Stack<>();

	        // Step 4: Iterate through the array
	        System.out.println("First Here"+stack);
	        for (int i = 0; i < n; i++) {
	            // While the stack is not empty AND the current element's frequency
	            // is greater than the frequency of the element at the top of the stack
	            while (!stack.isEmpty() && freqMap.get(arr[i]) > freqMap.get(arr[stack.peek()])) {
	                // The element at stack.peek() has found its next higher frequency element
	                // which is arr[i]
	            	System.out.println("Here"+stack+" "+Arrays.toString(ans));
	                ans[stack.pop()] = arr[i];
	            }
	            // Push the current element's index onto the stack
	            stack.push(i);
	            System.out.println(stack+" "+stack.peek());
	        }

	        // Step 5: Return the result
	        // Elements remaining in the stack don't have a higher frequency element to their right,
	        // so their corresponding ans values remain -1 (as initialized).
	        return ans;
	    }

	    public static void main(String[] args) {
	        // Test cases
	        int[] arr1 = {1, 1, 2, 3, 2, 1};
	        System.out.println("Input: " + Arrays.toString(arr1));
	        System.out.println("Output: " + Arrays.toString(findClosestHigherFrequency(arr1))); // Expected: [-1, -1, 1, 2, 1, -1]

	       /* int[] arr2 = {1, 2, 3, 4, 5}; // All frequencies are 1
	        System.out.println("Input: " + Arrays.toString(arr2));
	        System.out.println("Output: " + Arrays.toString(findClosestHigherFrequency(arr2))); // Expected: [-1, -1, -1, -1, -1]

	        int[] arr3 = {5, 4, 3, 2, 1}; // All frequencies are 1
	        System.out.println("Input: " + Arrays.toString(arr3));
	        System.out.println("Output: " + Arrays.toString(findClosestHigherFrequency(arr3))); // Expected: [-1, -1, -1, -1, -1]

	        int[] arr4 = {10, 20, 10, 20, 30, 10};
	        // Frequencies: 10:3, 20:2, 30:1
	        // Expected:
	        // 10 (freq 3) -> -1
	        // 20 (freq 2) -> 10 (freq 3)
	        // 10 (freq 3) -> -1
	        // 20 (freq 2) -> 10 (freq 3)
	        // 30 (freq 1) -> 10 (freq 3)
	        // 10 (freq 3) -> -1
	        // Output: [-1, 10, -1, 10, 10, -1]
	        System.out.println("Input: " + Arrays.toString(arr4));
	        System.out.println("Output: " + Arrays.toString(findClosestHigherFrequency(arr4)));

	        int[] arr5 = {1, 1, 1, 2, 2, 3};
	        // Frequencies: 1:3, 2:2, 3:1
	        // Expected:
	        // 1 (freq 3) -> -1
	        // 1 (freq 3) -> -1
	        // 1 (freq 3) -> -1
	        // 2 (freq 2) -> 1 (freq 3)
	        // 2 (freq 2) -> 1 (freq 3)
	        // 3 (freq 1) -> 1 (freq 3)
	        // Output: [-1, -1, -1, 1, 1, 1]
	        System.out.println("Input: " + Arrays.toString(arr5));
	        System.out.println("Output: " + Arrays.toString(findClosestHigherFrequency(arr5)));
	        */
	        
	        
	}

}
