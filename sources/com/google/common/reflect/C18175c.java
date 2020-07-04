package com.google.common.reflect;

import com.google.common.base.C17439m;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: com.google.common.reflect.c */
public final class C18175c {
    /* renamed from: a */
    public static <T> T m60058a(Class<T> cls, InvocationHandler invocationHandler) {
        C17439m.m57962a(invocationHandler);
        C17439m.m57976a(cls.isInterface(), "%s is not an interface", (Object) cls);
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
