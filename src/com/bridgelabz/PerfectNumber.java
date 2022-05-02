/*Problem Statement=>
                2. Perfect Number
                        a. Just like the Armstrong number, the Perfect Number is also a special type of positive number.
                           When the number is equal to the sum of its positive divisors excluding the number, it is called a Perfect Number.
                           For example, 28 is the perfect number because when we sum the divisors of 28, it will result in the same number.
                           The divisors of 28 are 1, 2, 4, 7, and 14. So,
                        b. 28 = 1+2+4+7
                        c. 28 = 28
* */
package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    static int perfectNumber;
     public static void main(String[] args)
     {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number To check it is Perfect Number or not :");
            perfectNumber = scanner.nextInt();
            int count = 0;
            for (int i = 1;i < perfectNumber;i++){
                if(perfectNumber % i == 0){
                    count = count + i;
                    System.out.print(i+" ");
                }
            }
            if (count == perfectNumber){
                System.out.println(perfectNumber+ " is a Perfect Number");
            }
            else
                System.out.println(perfectNumber+ " is not a Perfect Number");
        }
    }

