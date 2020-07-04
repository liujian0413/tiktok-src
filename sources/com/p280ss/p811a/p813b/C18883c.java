package com.p280ss.p811a.p813b;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.a.b.c */
public final class C18883c {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f50895a;

    /* renamed from: com.ss.a.b.c$a */
    public static class C18884a<T> {

        /* renamed from: a */
        public final Class<? extends T> f50896a;

        /* renamed from: b */
        public final T f50897b;
    }

    static {
        HashMap hashMap = new HashMap();
        f50895a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f50895a.put(Byte.class, Byte.TYPE);
        f50895a.put(Character.class, Character.TYPE);
        f50895a.put(Short.class, Short.TYPE);
        f50895a.put(Integer.class, Integer.TYPE);
        f50895a.put(Float.class, Float.TYPE);
        f50895a.put(Long.class, Long.TYPE);
        f50895a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f50895a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f50895a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f50895a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f50895a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f50895a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f50895a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f50895a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f50895a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: a */
    private static Method m61639a(Class<?> cls, String str, Class... clsArr) {
        while (true) {
            Method a = m61640a(cls.getDeclaredMethods(), str, (Class<?>[]) clsArr);
            if (a != null) {
                a.setAccessible(true);
                return a;
            } else if (cls.getSuperclass() != null) {
                cls = cls.getSuperclass();
            } else {
                throw new NoSuchMethodException();
            }
        }
    }

    /* renamed from: a */
    private static Method m61640a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m61643a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    private static void m61641a(Class<?> cls, String str, Object... objArr) {
        m61639a(cls, str, m61644a(objArr)).invoke(null, m61645b(objArr));
    }

    /* renamed from: a */
    public static void m61642a(String str, String str2, Object... objArr) {
        try {
            m61641a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static boolean m61643a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f50895a.containsKey(clsArr[i]) || !((Class) f50895a.get(clsArr[i])).equals(f50895a.get(clsArr2[i])))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Class<?>[] m61644a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C18884a aVar = objArr[i];
            Class cls = (aVar == null || !(aVar instanceof C18884a)) ? aVar == null ? null : aVar.getClass() : aVar.f50896a;
            clsArr[i] = cls;
        }
        return clsArr;
    }

    /* renamed from: b */
    private static Object[] m61645b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C18884a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C18884a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f50897b;
            }
        }
        return objArr2;
    }
}
