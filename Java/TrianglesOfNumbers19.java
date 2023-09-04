/*
 * Print the following pattern for the given number of rows.
Pattern for N = 4



The dots represent spaces.



Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
       1
      232
     34543
    4567654
   567898765
 */

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for (int i=1;i<=jj;i++){
            for (int j=1;j<=jj-i;j++){
                System.out.print(" ");
            }
            int s=i-1;
            for (int p=1;p<=i;p++){
                s+=1;
                System.out.print(s);
            }
            int w=s;
            for (int q=1;q<i;q++){
                w-=1;
                System.out.print(w);
            }
            System.out.println();
        }
        
        
	}
}
