package com.company;

import java.util.function.BiFunction;
import java.util.function.Function;
interface IsGreater {
    boolean isGreater(int a,int b);
}
interface Incrementer {
    int increment(int x);
}
interface Concat {
    String concat(String s1,String s2);
}
interface ToUpper {
    String toUpper(String str);
}


public class Ques1 {
    public static void main(String[] args) {
        //Write the following a functional interface and implement it using lambda:
        //(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
        //(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
        //(3) Concatination of 2 string                                                   Parameter (String , String ) Return (String)
        //(4) Convert a string to uppercase and return .                                Parameter (String) Return (String)

        int a=5,b=9;
        IsGreater i = (x,y)-> x>y?true:false;
        System.out.println("\n"+a+" is greater than "+b+" : "+i.isGreater(a,b));

        int c=11;
        Incrementer in= x->x+1;
        System.out.println("\nOriginal value : "+c+"\nIncremented value: "+ in.increment(c));

        String str1="Hello", str2=" World";
        Concat cn = (x,y)->x.concat(y);
        System.out.println("s1: "+str1+"\ns2: "+str2+"\nConcatenated string: "+cn.concat(str1,str2));

        String str="change to uppercase";
        ToUpper t= s->s.toUpperCase();
        System.out.println("\nOriginal String: "+str+"\nString in upper case: "+t.toUpper(str));



    }
}
