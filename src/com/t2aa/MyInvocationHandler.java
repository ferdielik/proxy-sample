package com.t2aa;

import static java.lang.System.out;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ferhat on 02/11/16.
 */
public class MyInvocationHandler implements InvocationHandler
{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        out.println(method.getName()+" invoked");

        return "merhaba";
    }
}
