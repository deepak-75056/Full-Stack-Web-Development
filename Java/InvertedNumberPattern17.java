/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints :
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
55555 
4444
333
22
1
 */
import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();
        for(int i=0;i<jj;i++){
            for(int p=1;p<=jj-i;p++){
                System.out.print(jj-i);

            }
            System.out.println();
        }

		
	}

}
