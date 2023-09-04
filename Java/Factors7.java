/*Write a program that takes a number as input and prints all its factors except 1 and the number itself..
If the number has only two factors (1 and the number itself), then the program should print -1.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Explanation of Sample Output 1 :
The factors for the number excluding 1 and itself are 2 and 4, so the output is 2 4.
Sample Input 2 :
11
Sample Output 2 :
-1
Explanation of Sample Output 2 :
11 is a prime number having factors 1 and 11 so that output will be -1.*/

import java.util.*;

public class Factors7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            } else {
                continue;
            }
        }

    }

}
/*
 * 
 * Time Complexity: O(n*sqrt(n))
 * Space Complexity: O(1)
 * 
 * Where n is the number of elements.
 * 
 * 
 * public class Solution {
 * static int factor(int n) {
 * int count = 0;
 * 
 * // Counting the factors for all the numbers.
 * for (int i = 1; i <= n; i++) {
 * // Counting the factors for number i.
 * for (int j = 1; j < Math.sqrt(n) + 1; j++) {
 * if (i % j == 0) {
 * if (i / j == j) {
 * count += 1;
 * }
 * 
 * else {
 * count += 2;
 * }
 * 
 * count %= 2;
 * }
 * }
 * }
 * 
 * return count;
 * }
 * 
 * }
 */
