package com.p280ss.android.agilelogger.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.agilelogger.utils.c */
public final class C19197c {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f51863a;

    /* renamed from: com.ss.android.agilelogger.utils.c$a */
    public static class C19198a<T> {

        /* renamed from: a */
        public final Class<? extends T> f51864a;

        /* renamed from: b */
        public final T f51865b;
    }

    static {
        HashMap hashMap = new HashMap();
        f51863a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f51863a.put(Byte.class, Byte.TYPE);
        f51863a.put(Character.class, Character.TYPE);
        f51863a.put(Short.class, Short.TYPE);
        f51863a.put(Integer.class, Integer.TYPE);
        f51863a.put(Float.class, Float.TYPE);
        f51863a.put(Long.class, Long.TYPE);
        f51863a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f51863a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f51863a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f51863a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f51863a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f51863a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f51863a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f51863a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f51863a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: b */
    private static Object[] m62923b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C19198a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C19198a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f51865b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    private static Class<?>[] m62922a(Object... objArr) {
        Class cls;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C19198a aVar = objArr[i];
            if (aVar != null && (aVar instanceof C19198a)) {
                cls = aVar.f51864a;
            } else if (aVar == null) {
                cls = null;
            } else {
                cls = aVar.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    /* renamed from: a */
    private static boolean m62921a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            if (clsArr2 == null || clsArr2.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr2 == null) {
            if (clsArr.length == 0) {
                return true;
            }
            return false;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f51863a.containsKey(clsArr[i]) || !((Class) f51863a.get(clsArr[i])).equals(f51863a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m62918a(String str, String str2, Object... objArr) {
        try {
            return m62917a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T> T m62917a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return m62919a(cls, str, (Class<?>[]) m62922a(objArr)).invoke(null, m62923b(objArr));
    }

    /* renamed from: a */
    private static Method m62919a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m62920a(cls.getDeclaredMethods(), str, clsArr);
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
    private static Method m62920a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m62921a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }
}
