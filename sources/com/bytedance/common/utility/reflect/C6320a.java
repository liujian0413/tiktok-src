package com.bytedance.common.utility.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.common.utility.reflect.a */
public final class C6320a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f18553a;

    /* renamed from: com.bytedance.common.utility.reflect.a$a */
    public static class C6321a<T> {

        /* renamed from: a */
        public final Class<? extends T> f18554a;

        /* renamed from: b */
        public final T f18555b;
    }

    static {
        HashMap hashMap = new HashMap();
        f18553a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f18553a.put(Byte.class, Byte.TYPE);
        f18553a.put(Character.class, Character.TYPE);
        f18553a.put(Short.class, Short.TYPE);
        f18553a.put(Integer.class, Integer.TYPE);
        f18553a.put(Float.class, Float.TYPE);
        f18553a.put(Long.class, Long.TYPE);
        f18553a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f18553a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f18553a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f18553a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f18553a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f18553a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f18553a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f18553a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f18553a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: b */
    private static Object[] m19608b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C6321a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C6321a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f18555b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    private static Class<?>[] m19605a(Object... objArr) {
        Class cls;
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C6321a aVar = objArr[i];
            if (aVar != null && (aVar instanceof C6321a)) {
                cls = aVar.f18554a;
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
    public static <T> T m19599a(Object obj, String str) {
        try {
            return m19606b(obj, str);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0019 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m19606b(java.lang.Object r4, java.lang.String r5) throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        /*
            java.lang.Class r0 = r4.getClass()
            r1 = 0
        L_0x0005:
            r2 = 1
            if (r1 != 0) goto L_0x001f
            java.lang.reflect.Field r3 = r0.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0012 }
            r3.setAccessible(r2)     // Catch:{ NoSuchFieldException -> 0x0011 }
            r1 = r3
            goto L_0x0016
        L_0x0011:
            r1 = r3
        L_0x0012:
            java.lang.Class r0 = r0.getSuperclass()
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.NoSuchFieldException r4 = new java.lang.NoSuchFieldException
            r4.<init>()
            throw r4
        L_0x001f:
            r1.setAccessible(r2)
            java.lang.Object r4 = r1.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.C6320a.m19606b(java.lang.Object, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    private static boolean m19604a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f18553a.containsKey(clsArr[i]) || !((Class) f18553a.get(clsArr[i])).equals(f18553a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m19600a(Object obj, String str, Object... objArr) {
        try {
            return m19607b(obj, str, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T> T m19598a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return m19602a(cls, str, (Class<?>[]) m19605a(objArr)).invoke(null, m19608b(objArr));
    }

    /* renamed from: b */
    private static <T> T m19607b(Object obj, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return m19602a(obj.getClass(), str, (Class<?>[]) m19605a(objArr)).invoke(obj, m19608b(objArr));
    }

    /* renamed from: a */
    public static <T> T m19601a(String str, String str2, Object... objArr) {
        try {
            return m19598a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m19602a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m19603a(cls.getDeclaredMethods(), str, clsArr);
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
    private static Method m19603a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m19604a((Class<?>[]) method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }
}
