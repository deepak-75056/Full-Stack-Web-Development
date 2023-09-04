/*
 * Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
 */


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
Scanner inp=new Scanner(System.in);
        int jj= inp.nextInt();

        for (int j=0;j<jj;j++){
            int i=0+(j*2);
            int l=i;
            for (int p=1;p<=jj-j;){
                if (l%2!=0){
                    System.out.print(l);
                    p+=1;
                }
                l+=1;
            }
            int jg=0;
            for (int q=0;q<j;){
                if (jg%2!=0){
                    System.out.print(jg);
                    q+=1;
                }
                jg++;
            }
            System.out.println();

        }
	}
}