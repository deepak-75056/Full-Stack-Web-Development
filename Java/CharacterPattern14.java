
/*
*Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
*/
import java.util.*;

public class CharacterPattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 65;
        for (int i = 1; i <= n; i++) {
            char p = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(p);
                p++;
            }
            System.out.println();
        }
    }
}
