package com.bytedance.news.common.service.manager;

import com.C1642a;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.news.common.service.manager.c */
public class C6446c {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, Object> f18793a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static final ConcurrentHashMap<Class, C6445a<?>> f18794b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static final ConcurrentHashMap<Class, C12255b> f18795c = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static <T> T m20127a(Class<T> cls) {
        T t = f18793a.get(cls);
        if (t == null) {
            synchronized (C6446c.class) {
                C6445a aVar = (C6445a) f18794b.get(cls);
                if (aVar != null) {
                    T a = aVar.mo15015a();
                    f18794b.remove(cls);
                    if (a != null) {
                        m20131b(cls, a);
                        return a;
                    }
                }
                t = m20130b(cls);
                if (t != null) {
                    m20131b(cls, t);
                    return t;
                }
            }
        }
        return t;
    }

    /* renamed from: b */
    private static <T> T m20130b(Class<T> cls) {
        try {
            Object newInstance = Class.forName(C1642a.m8034a("%s__ServiceProxy", new Object[]{cls.getName()})).newInstance();
            if (newInstance instanceof IServiceProxy) {
                return ((IServiceProxy) newInstance).newInstance();
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static <T> void m20128a(Class<T> cls, C6445a<T> aVar) {
        f18794b.put(cls, aVar);
    }

    /* renamed from: a */
    public static <T> void m20129a(Class<T> cls, T t) {
        f18793a.put(cls, t);
    }

    /* renamed from: b */
    private static <T> void m20131b(Class<T> cls, T t) {
        f18793a.put(cls, t);
        if (((C12255b) f18795c.get(cls)) != null) {
            f18795c.remove(cls);
        }
    }
}
