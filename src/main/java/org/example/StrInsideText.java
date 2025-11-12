package org.example;

public class StrInsideText

{
	public static void main(String[] args)
	{
        String str1 = "One two and lets Do";
        String str2 = "One";
        String str3 = "four";
        boolean check = str1.contains(str2);
        System.out.println(check);

        boolean check2 = str2.contains(str3);
        System.out.println(check2);
    }
}
