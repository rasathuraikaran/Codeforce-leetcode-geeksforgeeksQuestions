/*

        Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
         Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.



            Example:
            Input:
            2
            5
            111 222 333 444 555
            3
            121 131 20

            Output:
            1
            0

            Explanation:
            For First test case.
            n=5;
            A[0] = 111    //which is a palindrome number.
            A[1] = 222   //which is a palindrome number.
            A[2] = 333   //which is a palindrome number.
            A[3] = 444  //which is a palindrome number.
            A[4] = 555  //which is a palindrome number.
            As all numbers are palindrome so This will return 1.

            Constraints:
            1 <=T<= 50
            1 <=n<= 20
            1 <=A[]<= 10000


 */

public class PalindromicArray {

    public static void main (String args[]){
        int[] array= {111, 222, 333, 444, 555};

        palinArray(array,array.length);

    }

    public static int palinArray(int[] a, int n)
    {


        for(int i=0;i<n;i++){
            int num=a[i];// get a num variable and assigned a[i]
            int length=  countDigit( num); // get the total digits by dividing 10 .it defined as a  static method

            int reverse_Number=0;
            for (int j=0; j<length; j++){


                int r=num%10; // get the remainder dividing by 10

                num=num/10;// and also divide further num

                reverse_Number= reverse_Number*10+r;//make reverse number by multiplying *10 + r





            }

            if(a[i]!= reverse_Number){
                System.out.println(0);
                return 0;

            }



        }
        System.out.println(1);
        return 1;

    }

    static  int countDigit(long n)
    {
        if (n/10 == 0)
            return 1;
        return 1 + countDigit(n / 10);
    }

}
