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
   public int minimum_difference(int[] nums)
    {
       
       
           int n = nums.length;
           Arrays.sort(nums);
       //sort the array find the consecutive diffrence then find small one
            int smallDiff=nums[1]- nums[0];
      
        
        
        for (int i=0;i<n;i++){
            if(i==n-1)  nums[i]= nums[i]- nums[0];
            else nums[i]= nums[i+1]- nums[i];
            
            
            
            if(smallDiff>nums[i])  smallDiff=nums[i];
            
            
            
            
        }
       
        
        return  smallDiff;
    }
}
