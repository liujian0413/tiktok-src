package com.bytedance.android.livesdkapi.p458j;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.j.a */
public final class C9488a {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f25977a;

    /* renamed from: com.bytedance.android.livesdkapi.j.a$a */
    public static class C9489a<T> {

        /* renamed from: a */
        public final Class<? extends T> f25978a;

        /* renamed from: b */
        public final T f25979b;

        public C9489a(Class<? extends T> cls, T t) {
            this.f25978a = cls;
            this.f25979b = t;
        }
    }

    /* renamed from: a */
    private static Class<?>[] m28012a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C9489a aVar = objArr[i];
            Class cls = (aVar == null || !(aVar instanceof C9489a)) ? aVar == null ? null : aVar.getClass() : aVar.f25978a;
            clsArr[i] = cls;
        }
        return clsArr;
    }

    static {
        HashMap hashMap = new HashMap();
        f25977a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f25977a.put(Byte.class, Byte.TYPE);
        f25977a.put(Character.class, Character.TYPE);
        f25977a.put(Short.class, Short.TYPE);
        f25977a.put(Integer.class, Integer.TYPE);
        f25977a.put(Float.class, Float.TYPE);
        f25977a.put(Long.class, Long.TYPE);
        f25977a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f25977a;
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f25977a;
        Class cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f25977a;
        Class cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f25977a;
        Class cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f25977a;
        Class cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f25977a;
        Class cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f25977a;
        Class cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f25977a;
        Class cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* renamed from: a */
    public static <T> T m28003a(Class<?> cls) {
        try {
            return m28013b(cls);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static <T> T m28013b(Class<?> cls) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        Constructor[] declaredConstructors = cls.getDeclaredConstructors();
        if (declaredConstructors == null || declaredConstructors.length == 0) {
            StringBuilder sb = new StringBuilder("Can't get even one available constructor for ");
            sb.append(cls);
            throw new IllegalArgumentException(sb.toString());
        }
        Constructor constructor = declaredConstructors[0];
        constructor.setAccessible(true);
        Class[] parameterTypes = constructor.getParameterTypes();
        if (parameterTypes == null || parameterTypes.length == 0) {
            return constructor.newInstance(new Object[0]);
        }
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            objArr[i] = m28018c(parameterTypes[i]);
        }
        return constructor.newInstance(objArr);
    }

    /* renamed from: c */
    private static Object m28018c(Class<?> cls) {
        if (Integer.TYPE.equals(cls) || Integer.class.equals(cls) || Byte.TYPE.equals(cls) || Byte.class.equals(cls) || Short.TYPE.equals(cls) || Short.class.equals(cls) || Long.TYPE.equals(cls) || Long.class.equals(cls) || Double.TYPE.equals(cls) || Double.class.equals(cls) || Float.TYPE.equals(cls) || Float.class.equals(cls)) {
            return Integer.valueOf(0);
        }
        if (Boolean.TYPE.equals(cls) || Boolean.class.equals(cls)) {
            return Boolean.valueOf(false);
        }
        if (Character.TYPE.equals(cls) || Character.class.equals(cls)) {
            return Character.valueOf(0);
        }
        return null;
    }

    /* renamed from: b */
    private static Object[] m28017b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C9489a aVar = objArr[i];
            if (aVar == null || !(aVar instanceof C9489a)) {
                objArr2[i] = aVar;
            } else {
                objArr2[i] = aVar.f25979b;
            }
        }
        return objArr2;
    }

    /* renamed from: a */
    public static <T> T m28005a(Class<?> cls, Object... objArr) {
        try {
            return m28014b(cls, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static <T> T m28014b(Class<?> cls, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Constructor constructor = cls.getConstructor(m28012a(objArr));
        constructor.setAccessible(true);
        return constructor.newInstance(m28017b(objArr));
    }

    /* renamed from: a */
    private static boolean m28011a(Class<?>[] clsArr, Class<?>[] clsArr2) {
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
                if (!clsArr[i].isAssignableFrom(clsArr2[i]) && (!f25977a.containsKey(clsArr[i]) || !((Class) f25977a.get(clsArr[i])).equals(f25977a.get(clsArr2[i])))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private static <T> T m28004a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return m28008a(cls, str, (Class<?>[]) m28012a(objArr)).invoke(null, m28017b(objArr));
    }

    /* renamed from: a */
    public static <T> T m28006a(Object obj, String str, Object... objArr) {
        try {
            return m28015b(obj, str, objArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static <T> T m28015b(Object obj, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        return m28008a(obj.getClass(), str, (Class<?>[]) m28012a(objArr)).invoke(obj, m28017b(objArr));
    }

    /* renamed from: a */
    public static <T> T m28007a(String str, String str2, Object... objArr) {
        try {
            return m28004a(Class.forName(str), str2, objArr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private static Method m28008a(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        while (true) {
            Method a = m28009a(cls.getDeclaredMethods(), str, clsArr);
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

    /* renamed from: b */
    private static void m28016b(Object obj, String str, Object obj2) throws NoSuchFieldException, IllegalAccessException {
        Class cls = obj.getClass();
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == null) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        field.set(obj, obj2);
    }

    /* renamed from: a */
    private static Method m28009a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m28011a((Class<?>[]) method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    public static void m28010a(Object obj, String str, Object obj2) {
        try {
            m28016b(obj, str, obj2);
        } catch (NoSuchFieldException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }
}
