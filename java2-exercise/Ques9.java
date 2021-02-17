package com.company;

interface furniture {
    public void stressTest();
    public void fireTest();
}

abstract class chair implements furniture{
    String color;
    int cost;
    boolean cushion;
    public abstract void chairType();
}
abstract class Table implements furniture
{
    String color;
    int height;
    int width;
    int length;
    public abstract void tableType();
}
class woodenTable extends Table
{
    @Override
    public void stressTest()
    {
        System.out.println("Stress test of wooden table");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire test of wooden table");
    }

    @Override
    public void tableType() {
        System.out.println("Table type : Wooden");
    }
}
class metalTable extends Table
{

    @Override
    public void stressTest() {
        System.out.println("Stress test of metal table");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire test of metal table");
    }

    @Override
    public void tableType() {
        System.out.println("Table type : Metal");
    }
}
class metalChair extends chair
{

    @Override
    public void stressTest() {
        System.out.println("Stress test of metal chair");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire test of metal chair");
    }

    @Override
    public void chairType() {
        System.out.println("Chair type : Metal");
    }
}
class woodenChair extends chair
{

    @Override
    public void stressTest() {
        System.out.println("Stress test of wooden chair");
    }

    @Override
    public void fireTest() {
        System.out.println("Fire test of wooden chair");
    }

    @Override
    public void chairType() {
        System.out.println("Chair type :Wooden");
    }
}
public class Ques9 {
    public static void main(String[] args) {
        //Design classes having attributes for furniture where there are wooden chairs and table,
        // metal chairs and tables. There are stress and fire tests for each products

        chair ch = null;
        String str = "wooden";
        if (str.equals("wooden"))
        {
            ch = new woodenChair();
            ch.chairType();
            ch.stressTest();
            ch.fireTest();
        }
        else if (str.equals("metal"))
        {
            ch = new metalChair();
            ch.chairType();
            ch.fireTest();
            ch.stressTest();
        }
    }
}
