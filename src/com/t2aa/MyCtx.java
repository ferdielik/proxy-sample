package com.t2aa;

import java.io.Serializable;
import java.lang.reflect.Proxy;

/**
 * Created by ferhat on 02/11/16.
 */
public class MyCtx
{

    public static <T> T getInstance(Class<T> clazz)
    {

        return (T) Proxy.newProxyInstance(MyCtx.class.getClassLoader(), new Class[]{clazz , Serializable.class},
                new MyInvocationHandler());
    }
}
