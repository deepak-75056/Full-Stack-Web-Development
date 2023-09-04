/*
* Print the following pattern for the given N number of rows.
Pattern for N = 3
A
BB
CCC

Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints: 0 <= N <= 26

Sample Input 1:
7
Sample Output 1:
A
BB
CCC
DDDD
EEEEE
FFFFFF
GGGGGGG
*/

import java.util.Scanner;
public class AlphaPattern13 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int alphabet = 65;
                for (int i = 1; i<= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) alphabet);
            }
            alphabet++;
            System.out.println();
        }
		
	}

}
