/*
*Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
*/

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();

        System.out.println("*");
//        Loop 1
        for (int i=1;i<=jj;i++){
            System.out.print("*");

            for(int p=1;p<=i;p++){
                System.out.print(p);
            }
            for (int j=1;j<i;j++){
                System.out.print(i-j);
            }
            System.out.println("*");
        }

//        Loop 2
        for (int u=1;u<jj;u++){
            System.out.print("*");


            for(int r=1;r<=jj-u;r++){
                System.out.print(r);
            }
            for (int e=1;e<jj-u;e++){
                System.out.print(jj-e-u);

            }
            System.out.println("*");
        }
        System.out.print("*");
        
    }
}

