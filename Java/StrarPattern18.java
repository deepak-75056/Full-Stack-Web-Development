/*
 * Print the following pattern
Pattern for N = 4



Hint
As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
The dots represent spaces.



Input Format :
N (Total no. of rows)
Output Format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
   *
  *** 
 *****
 */

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
        int jg= inp.nextInt();
        for (int i=1;i<=jg;i++){
            for (int g=1;g<jg+1-i;g++){
                System.out.print(" ");
            }

            for (int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

		
	}

}


