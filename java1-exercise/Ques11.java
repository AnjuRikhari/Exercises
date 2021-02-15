package com.company;

import java.util.Scanner;

class Bank{
       protected String name;
       protected int noOfBranches;
       protected float rateofInterest;

       Bank(String name, int noOfBranches, float rateofInterest){
           this.name = name;
           this.noOfBranches = noOfBranches;
           this.rateofInterest = rateofInterest;
       }
       public void getDetails()
       {
           System.out.println("Bank name : "+name);
           System.out.println("No of Branches : "+noOfBranches);
           System.out.println("Rate of interest : "+rateofInterest);
           System.out.println();
       }
}

class SBI extends Bank{

    SBI(String name, int noOfBranches, float rateofInterest){
        super(name,noOfBranches,rateofInterest);
    }
}

class BOI extends Bank{

    BOI(String name, int noOfBranches, float rateofInterest){
        super(name,noOfBranches,rateofInterest);
    }
}
class ICICI extends Bank{

    ICICI(String name, int noOfBranches, float rateofInterest){
        super(name,noOfBranches,rateofInterest);
    }
}
public class Ques11 {
    public static void main(String[] args) {
        // Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails
        // which provide there specific details like rateofinterest etc,print details of every banks.
        Bank b = new SBI("SBI",200,7);
        b.getDetails();

        Bank b1 = new BOI("BOI",70,8);
        b1.getDetails();

        Bank b2 = new ICICI("ICICI",90,9);
       b2.getDetails();
    }
}
