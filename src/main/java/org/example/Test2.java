package org.example;

import java.util.Scanner;

public class Test2
{
	public static void main(String[] args)
	{
        Scanner sc = new
                Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        System.out.println(str.contains(word));
    }
}
