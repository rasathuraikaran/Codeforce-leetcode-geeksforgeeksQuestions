/*

Success
Details
Runtime: 15 ms, faster than 23.81% of Java online submissions for Single Number.
Memory Usage: 43.2 MB, less than 74.49% of Java online submissions for Single Number.

Show off your acceptance:

06/10/2022 13:19	Accepted	15 ms	43.2 MB	java
06/10/2022 13:05	Accepted	24 ms	55.4 MB	java


Question
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1


Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.


 */

import java.util.HashMap;
import java.util.Map;


public class SingleNumber {

    public int singleNumber(int[] nums) {

        HashMap<Integer,Integer> numbers=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            numbers.put(nums[i], numbers.get(nums[i])+1);

        }
        for(Map.Entry m : numbers.entrySet()){
            if(Integer.parseInt(m.getValue().toString() )== 1) {
                return (int) m.getKey();
            }

        }
        return 0;
    }
}
