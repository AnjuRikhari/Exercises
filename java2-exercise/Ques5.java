package com.company;

public class Ques5 {
    public static void main(String[] args) {
        //WAP to show object cloning in java using cloneable and copy constructor both

        try{
            Employee s1=new Employee(101,"Smith");
            Employee s2=(Employee)s1.clone();
            System.out.println("Normal object : "+s1.empid+" "+s1.name);
            System.out.println();
            System.out.println("Cloned object: "+s2.empid+" "+s2.name);
            s2.name="Clark"; s2.empid=102;
            System.out.println("Changing cloned object");
            System.out.println(s1.empid+" "+s1.name);
            System.out.println(s2.empid+" "+s2.name);
            Employee s3=new Employee(s2);
            System.out.println(s3.empid+" "+s3.name);

        }catch(CloneNotSupportedException c){
            c.printStackTrace();
        }

    }

}

