package com.company;

public class Ques3 {
    public static void main(String[] args) {
        //WAP to produce NoClassDefFoundError and ClassNotFoundException exception

        try{

            Class.forName("TestClass");

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
