package org.example;

public class CompareOfString
{
    public static void main(String[] args)
    {
        String str1 = "IEMIT";
        String str2 = "IEMIT";
        String str3 = "IEmIT";
        boolean compare1 = str1.equals(str2);
        System.out.println(compare1);
        boolean compare2 = str2.equals(str3);
        System.out.println(compare2);

    }
}
