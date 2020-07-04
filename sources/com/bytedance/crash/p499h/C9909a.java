package com.bytedance.crash.p499h;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.crash.h.a */
public final class C9909a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f27027a;

    /* renamed from: com.bytedance.crash.h.a$a */
    public static class C9910a<T> {

        /* renamed from: a */
        public final Class<? extends T> f27028a;

        /* renamed from: b */
        public final T f27029b;
    }

    static {
        HashMap hashMap = new HashMap();
        f27027a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f27027a.put(Byte.class, Byte.TYPE);
        f27027a.put(Character.class, Character.TYPE);
        f27027a.put(Short.class, Short.TYPE);
        f27027a.put(Integer.class, Integer.TYPE);
        f27027a.put(Float.class, Float.TYPE);
        f27027a.put(Long.class, Long.TYPE);
        f27027a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f27027a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f27027a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f27027a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f27027a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f27027a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f27027a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f27027a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f27027a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: b */
    private static Object[] m29302b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C9910a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C9910a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f27029b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    private static Class<?>[] m29301a(Object... objArr) {
        Class cls;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C9910a aVar = objArr[i];
            if (aVar != null && (aVar instanceof C9910a)) {
                cls = aVar.f27028a;
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
    private static boolean m29300a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f27027a.containsKey(clsArr[i]) || !((Class) f27027a.get(clsArr[i])).equals(f27027a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m29297a(String str, String str2, Object... objArr) {
        try {
            return m29296a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T> T m29296a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return m29298a(cls, str, (Class<?>[]) m29301a(objArr)).invoke(null, m29302b(objArr));
    }

    /* renamed from: a */
    private static Method m29298a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m29299a(cls.getDeclaredMethods(), str, clsArr);
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
    private static Method m29299a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m29300a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }
}
