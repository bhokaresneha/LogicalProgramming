/* Problem Statement=>
                    Fibonacci series is a special type of series in which the next term is the sum of the previous two terms.
                    For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).
* */
package com.bridgelabz;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num,n0=0,n1=1,fibonacci;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no ");
        num=scanner.nextInt();
        System.out.println("Febonacci Series=>"+n0+" "+n1);
        for (int i=2 ;i< num ;i++)
        {
            fibonacci= n0 + n1;
            System.out.print(" "+fibonacci);
            n0=n1;
            n1=fibonacci;
        }
    }
}
