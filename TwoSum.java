
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?





 */

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        //clone the array and sorted as new array arr
        int[] arr = nums.clone();
        Arrays.sort(arr);


        //algorithm to find the values that can can produced target
        int j=nums.length-1;
        int i=0;

        while(i!=j){

            if(arr[i]+arr[j]>target){
                j--;
            }
            else if (arr[i]+arr[j]<target){
                i++;
            }
            else {
                break;
            }
        }


        //get the values
        int value1=arr[i];
        int value2=arr[j];


        int flag=0;int x=0; int y=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==value1&&x==0){
                i=k;
                ++flag;
                //after it checks passed dont need to check further itteration
                x++;

            }
            else  if(nums[k]==value2&&y==0){
                j=k;
                ++flag;
                //after it checks passed dont need to check further itteration
                y++;

            }
            if(flag==2){
                break;
            }
        }



        int [] index={i,j};
        return index;

    }
}
