package com.company;

public class Ques2 {

    public static void main(String[] args) {
        //WAP to sorting string without using string Methods?
        String str = "hello";
        System.out.println("Original String : " + str);
        char temp = 0;
        char[] chars = str.toCharArray();
        for (int i=0;i<chars.length;i++)
        {
            for (int j = i+1;j<chars.length;j++)
            {
                if (chars[j]<chars[i])
                {
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        String sorted_str = new String(chars);
        System.out.println("Sorted String is " + sorted_str);
    }
}
