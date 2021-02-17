package com.company;

public class Ques6 {
    public static void main(String[] args) {
        //WAP showing try, multi-catch and finally blocks

        try{

            System.out.println("Inside try Block");
            int a[] = new int[5];
            a[5] = 30/0;

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurs " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound exception occurs " +e);
        }
        catch (Exception e)
        {
            System.out.println("Parent Exception occurs  " +e);
        }

        finally {
            System.out.println("finally block always executed..  ");
        }
    }
}
