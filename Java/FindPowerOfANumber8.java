/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints:
0 <= x <= 8 
0 <= n <= 9
Sample Input 1 :
3 4
Sample Output 1 :
81
*/

import java.util.Scanner;
public class FindPowerOfANumber8{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int result=power(x,n-1);
        return x*result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int n = sc.nextInt();
        int result = power(x,n);
        System.out.println(result);
    }
}

/*
 * import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int ans = 1;
		
		while(n > 0) {
			ans *= x;
			n--;
		}
		
		System.out.println(ans);
		
	}
}
 */

/*

	Time Complexity: O(Log(N))
	Space Complexity: O(1)
	
	Where 'N' is the given number.


public class Solution {

	public static long Pow(int X, int N) {

// Base Case X ^ 0 = 1.
		if (N == 0)
			return 1;

// 0 ^ N = 0.
		if (X == 0)
			return 0;

// N is even.
		if (N % 2 == 0) {

			// X ^ N = (X ^ (N / 2)) * (X ^ (N / 2)).
			return (Pow(X, N / 2) * Pow(X, N / 2));
		}

// N is odd.
		else {

			// X ^ N = (X * X ^ (N / 2)) * (X ^ (N / 2)).
			return (X * Pow(X, N / 2) * Pow(X, N / 2));
		}
	}
}
*/

/* 

    Time Complexity: O(N)
    Space Complexity: O(1)

    Where 'N' is the given number.
    

    


public class Solution {
	public static long Pow(int X, int N) {

		// Base Case X ^ 0 = 1
		if (N == 0)
			return 1;

		// 0 ^ N = 0
		if (X == 0)
			return 0;

		// X ^ N = X * (X ^ (N - 1))
		return X * Pow(X, N - 1);
	}

}


*/
