/*
*Print the following pattern for the given N number of rows.
Pattern for N = 4




The dots represent spaces.


Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
3
Sample Output 1:
  1 
 12
123
 */
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
        Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for(int i=1;i<=jj;i++){
            
            for(int p=1;p<jj+1-i;p++){
                System.out.print(" ");
            }
            for(int q=1;q<=i;q++){
                System.out.print(q);
            }
            
            System.out.println();
        }

		
	}

}
