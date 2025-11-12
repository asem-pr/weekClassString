package org.example;

import java.util.Scanner;

public class Test5
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println(sum);
        String aa = Integer.toString(a);
        String bb = Integer.toString(b);
        System.out.println(aa+bb);


    }
}
