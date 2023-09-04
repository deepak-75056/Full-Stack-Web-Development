/*Write a program to print multiplication table of n
Input Format :
A single integer, n
Output Format :
First 10 multiples of n each printed in new line
Constraints :
0 <= n <= 10,000
Sample Input 1 :
2
Sample Output 1 :
2
4
6
8
10
12
14
16
18
20
*/

import java.util.Scanner;

class MultiplicationTable5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= 10; i++) { // int i=1; while(i<=10){ System.out.println(i*n); i++; }
            System.out.println(n * i);
        }
    }
}
