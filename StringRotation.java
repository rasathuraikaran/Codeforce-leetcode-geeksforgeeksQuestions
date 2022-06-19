/*
Given two strings a and b. The task is to find if the string 'b' can be obtained by rotating another string 'a' by exactly 2 places.

Example 1:

Input:
a = amazon
b = azonam
Output: 1
Explanation: amazon can be rotated anti
clockwise by two places, which will make
it as azonam.
Example 2:

Input:
a = geeksforgeeks
b = geeksgeeksfor
Output: 0
Explanation: If we rotate geeksforgeeks by
two place in any direction , we won't get
geeksgeeksfor.
Your Task:
The task is to complete the function isRotated() which takes two strings as input parameters and checks if given strings can be formed by rotations. The function returns true if string 1 can be obtained by rotating string 2 by two places, else it returns false.

Expected Time Complexity: O(N).
Expected Auxilary Complexity: O(N).
Challenge: Try doing it in O(1) space complexity.

Constraints:
1 ≤ length of a, b ≤ 105

 */
public class StringRotation {

    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {

        int n=str1.length();
        if(n==1){

            if(str1.equals(str2)){
                return true;
            }
            else return false;
        }

        if(isAntiClockwise(str1,str2)||isClockwise(str1,str2)) return true;


        return false;
    }


    public static boolean isAntiClockwise(String str1, String str2)
    {

        // amazon--onamaz
        int n=str1.length();
        char [] copy=new char[str1.length()];
        char temp1=str1.charAt(n-1);
        char temp2=str1.charAt(n-2);


        for(int i=n-1;i>1;i--){

            copy[i]=str1.charAt(i-2);
        }
        copy[0]=temp2;
        copy[1]=temp1;
        String copy1 = String.valueOf(copy);

        if(copy1.equals(str2)) return true;


        return false;
    }


    public static boolean isClockwise(String str1, String str2)
    {
        // amazon--azonam

        int n=str1.length();
        char [] copy=new char[str1.length()];

        char temp1=str1.charAt(0);;
        char temp2=str1.charAt(1);;


        for(int i=0;i<n-2;i++){

            copy[i]=str1.charAt(i+2);;
        }
        copy[n-2]=temp1;
        copy[n-1]=temp2;
        String copy1 = String.valueOf(copy);


        if(copy1.equals(str2)) return true;


        return false;
    }
}
