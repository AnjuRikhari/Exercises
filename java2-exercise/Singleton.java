package com.company;

public class Singleton {
    private static Singleton singleton = null;
    public String str;
    private Singleton()
    {
        str = "Inside Singleton class";
    }
    public static Singleton getInstance()
    {
        if (singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}
