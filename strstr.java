/*

leetcode interview question
Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().



Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */
public class strstr {

    public int strStr(String haystack, String needle) {
        int index=-1;
        int l;
        int flag=0;
        if(needle.length()==0) return 0;
        for(int i=0;i<haystack.length();i++){
            l=i;
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int j=0;j<needle.length();j++){

                    if(haystack.charAt(l)==needle.charAt(j)) {
                        l++;
                        flag=1;
                    }
                    else {
                        flag=0;
                        break;
                    }
                    if(l>=haystack.length()&&j!=needle.length()-1)return -1;

                }
                if(flag==1) {
                    index=i;
                    return i;
                }
            }

        }
        return index;
    }

}
