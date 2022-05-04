package com.bridgelabz;

import java.util.Scanner;

class temperaturConversion
{
    public static void main(String arg[])
    {
        double Fahrenheit,Celsius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:  System.out.println("Enter  Fahrenheit temperature");
                Fahrenheit=sc.nextDouble();
                Celsius=(Fahrenheit-32)*5/9;
                System.out.println("Celsius temperature is = "+Celsius);
                break;
            case 2:  System.out.println("Enter  Celsius temperature");
                Celsius=sc.nextDouble();
                Fahrenheit=((9*Celsius)/5)+32;
                System.out.println("Fahrenheit temperature is = "+Fahrenheit);
                break;
            default:  System.out.println("please choose valid choice");
        }
    }
}