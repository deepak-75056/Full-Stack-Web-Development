
/*
 * Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints:0 <= N <= 26
*/
import java.util.Scanner;

public class InterestingAlphabets15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int alphabet = 65;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) alphabet);
            }
            alphabet++;
            System.out.println();
        }

    }

}