
/*
            A. Young Physicist
                time limit per test2 seconds
                memory limit per test256 megabytes
                inputstandard input
                outputstandard output



A guy named Vasya attends the final grade of a high school.
One day Vasya decided to watch a match of his favorite hockey team.
 And, as the boy loves hockey very much, even more than physics,
 he forgot to do the homework. Specifically, he forgot to complete his physics tasks.
 Next day the teacher got very angry at Vasya and decided to teach him a lesson.
 He gave the lazy student a seemingly easy task:
 You are given an idle body in space and the forces that affect it.
 The body can be considered as a material point with coordinates (0; 0; 0).
 Vasya had only to answer whether it is in equilibrium. "Piece of cake" — thought Vasya,
 we need only to check if the sum of all vectors is equal to 0. So, Vasya began to solve the problem.
 But later it turned out that there can be lots and lots of these forces, and Vasya can not cope without your help.
Help him. Write a program that determines whether a body is idle or is moving by the given vectors of forces.

Input
The first line contains a positive integer n (1 ≤ n ≤ 100), then follow n lines containing three integers each: the xi coordinate, the yi coordinate and the zi coordinate of the force vector, applied to the body ( - 100 ≤ xi, yi, zi ≤ 100).

Output
Print the word "YES" if the body is in equilibrium, or the word "NO" if it is not.


 */



import java.util.HashMap;
import java.util.Scanner;

public class YoungPhysicist {


    public static void main(String[] args) {
        Scanner ui=new Scanner(System.in);
        int n= ui.nextInt();



        int lenght=n*3;

        int x=1;
        int y=0;
        int z=0;

        HashMap<Character,Integer> forces = new HashMap<>();
        forces.put('x',0);
        forces.put('y',0);
        forces.put('z',0);
        for (int i = 0; i < lenght; i++) {
            int value= ui.nextInt();

            //sum of forces in x axis =0 and y axis =0  z axis =0

           if(x==1){
               forces.put('x',value+ forces.get('x'));

               y=1;
               x=0;
               z=0;
           }
          else   if(y==1){
                forces.put('y',value+ forces.get('y'));
               x=0;
               y=0;
                z=1;
            }
           else if (z==1){
                forces.put('z',value+ forces.get('z'));
                x=1;
               y=0;
               z=0;
            }

        }
        if (forces.get('x')==0&&forces.get('y')==0&&forces.get('z')==0) System.out.println("YES");

        else System.out.println("NO");





    }


}
