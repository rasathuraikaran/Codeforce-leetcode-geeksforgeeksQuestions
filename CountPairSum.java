
/*
Count pair sum
Basic Accuracy: 68.6% Submissions: 6302 Points: 1
Given two sorted arrays(arr1[] and arr2[]) of size M and N of distinct elements. Given a value Sum. The problem is to count all pairs from both arrays whose sum is equal to Sum.
Note: The pair has an element from each array.


Example 1:

Input:
M=4, N=4 , Sum = 10
arr1[] = {1, 3, 5, 7}
arr2[] = {2, 3, 5, 8}
Output: 2
Explanation: The pairs are: (5, 5) and (7, 3).


Example 2:

Input:
N=4, M=4, sum=5
arr1[] = {1, 2, 3, 4}
arr2[] = {5, 6, 7, 8}
Output: 0


Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function countPairs() that takes array arr1, array arr2, integer M, integer N and integer x as parameters and return the count of all pairs from both arrays whose sum is equal to x.



Expected Time Complexity: O(M+N).
Expected Auxiliary Space: O(1).



Constraints:
1 ≤ M, N ≤ 105


 */
public class CountPairSum {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int arr1[],int arr2[], int M, int N, int x)
    {
        int i=0;
        int count =0;
        int j=N-1;

        /*
        in sorted array we set initially two pointers one is to i=0 another one is j=n-1 to lenght of another array
        after thaat we add if its smaller one then i++  greater one j--


         */
        while(j>=0&&i<M){

            if(arr1[i]+arr2[j]==x) {count++;i++;j--;}
            else  if(arr1[i]+arr2[j]<x) i++;
            else   j--;



        }
        return count;
    }
}
