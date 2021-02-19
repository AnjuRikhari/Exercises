package com.company;

interface Add {
    int addNum(int x,int y);
}

public class Ques2 {

    public static void main(String[] args) {
	//Create a functional interface whose method takes 2 integers and return one integer
        int a=10,b=4;
       Add add = (x,y) -> x+y;
       System.out.println("Result is "+add.addNum(a,b));
    }
}
