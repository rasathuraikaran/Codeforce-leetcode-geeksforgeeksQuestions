/*

Given an unsorted array, find the minimum difference between any pair in given array.


Example 1:

Input: nums = [2, 4, 5, 9, 7]
Output: 1
Explanation: Difference between 5 and 4 is 1.
Example 2:

Input: nums = [3, 10, 8, 6]
Output: 2
Explanation: Difference between 8 and 6 is 2.


Your Task:
You don't need to read or print anything.
Your task is to complete the function minimum_difference() which takes the array as input parameter and returns the minimum difference  between any pair in given array.


 */
public class MinimumDifferencePair {
    public int minimum_difference(int[] nums) {


        int n = nums.length;
        //initially arange to assending order
        sort(nums);


//find the difference between next two nuber
        for (int i = 0; i < n; i++) {
            if (i == n - 1) nums[i] = nums[i] - nums[0];
            else nums[i] = nums[i + 1] - nums[i];


        }
        //then sorting
        sort(nums);

        return nums[0];
    }

    //using insertion sort
    static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
