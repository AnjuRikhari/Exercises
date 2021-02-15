package com.company;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        //Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;
        int uCount,lCount,sCount,nCount;
        uCount=lCount=sCount=nCount=0;
        System.out.println("Enter the String : ");
        str = sc.nextLine();

        for (int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if (ch>=65 && ch<=90)
            {
                uCount++;
            }
            else if (ch>=97 && ch<=122)
            {
                lCount++;
            }
            else if (ch>=48 && ch<=57)
            {
                nCount++;
            }
            else
                sCount++;
        }
        System.out.println("No. of Uppercase letters :  " + uCount);
        System.out.println("No. of Lowercase letters :  " + lCount);
        System.out.println("No. of Digits :  " + nCount);
        System.out.println("No. of Special Characters :  " + sCount);

        int total = uCount+lCount+nCount+sCount;
        System.out.println("total Characters :  " + total);
        float upperP,lowerP, numP, specialP;
        upperP = (uCount*100)/total;
      //  System.out.println("perc. of Uppercase letters :  " + uCount/total);
        lowerP = (lCount*100)/total;
        numP = (nCount*100)/total;
        specialP = (sCount*100)/total;

        System.out.println("Percentage of Uppercase letters :  " + upperP);
        System.out.println("Percentage of Lowercase letters :  " + lowerP);
        System.out.println("Percentage of Digits :  " + numP);
        System.out.println("Percentage of Special Characters :  " + specialP);
    }
}
