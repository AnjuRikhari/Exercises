package com.company;

class MyException extends Exception
{
    public MyException(String str)
    {
        super(str);
    }
    @Override
    public synchronized Throwable fillInStackTrace(){
        return this;
    }
}
public class Ques13 {
    public static void main(String[] args) {
        //Create a custom exception that do not have any stack trace.
        int num = -1;
        try {
            if (num < 0) {
                throw new MyException("Custom Exception Message : Number is less than 0 ");
            }
        }catch (MyException e)
        {
            e.printStackTrace();
        }
    }
}
