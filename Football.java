/*

                                A. Football
                                time limit per test2 seconds
                                memory limit per test256 megabytes
                                inputstandard input
                                outputstandard output



Petya loves football very much. One day, as he was watching a football match,
 he was writing the players' current positions on a piece of paper.
 To simplify the situation he depicted it as a string consisting of zeroes and ones.
  A zero corresponds to players of one team; a one corresponds to players of another team.
  If there are at least 7 players of some team standing one after another, then the situation is considered dangerous.
  For example, the situation 00100110111111101 is dangerous and 11110111011101 is not.
  You are given the current situation. Determine whether it is dangerous or not.

Input
The first input line contains a non-empty string consisting of characters "0" and "1", which represents players. The length of the string does not exceed 100 characters. There's at least one player from each team present on the field.

Output
Print "YES" if the situation is dangerous. Otherwise, print "NO".

Examples
inputCopy
001001
outputCopy
NO



inputCopy
1000000001
outputCopy
YES



 */

import java.util.HashMap;
import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        HashMap<String ,Integer> Counts=new HashMap<>();
        Scanner ui = new Scanner(System.in);
        int x1=0;// if we get 1 ,x1 will increament
        int y0=0;// if we get 0 ,y0 will increament


        boolean isEndOfProgramming=false;
        String number =ui.next();





        for(int i=0; i<number.length();i++){

            if(1==Integer.parseInt(String.valueOf(number.charAt(i)))){
                Counts.put("0",++x1);
                y0=0;

            }
            else{
                Counts.put("1",++y0);

                x1=0;
            }


            if(x1==7 ||y0==7) {
                System.out.println("YES");

                isEndOfProgramming=true;
                break;

            }


        }
        if(isEndOfProgramming==false) {
            System.out.println("NO");

        }









    }
}