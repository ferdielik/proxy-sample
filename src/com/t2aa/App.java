package com.t2aa;


import static java.lang.System.out;

/**
 * Created by ferhat on 02/11/16.
 */
public class App
{
    public static void main(String[] args)
    {

        MyInterface i = MyCtx.getInstance(MyInterface.class);

        out.println("greeting message is: " + i.getGreetingMessage());
    }
}
