package com.bytedance.common.utility.reflect;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* renamed from: com.bytedance.common.utility.reflect.b */
public final class C6322b {

    /* renamed from: a */
    public final Object f18556a;

    /* renamed from: b */
    private final boolean f18557b;

    /* renamed from: com.bytedance.common.utility.reflect.b$a */
    public static class C6323a {
    }

    /* renamed from: a */
    public final C6322b mo15157a(String str, Object obj) throws ReflectException {
        try {
            m19624c(str, new Class[0]).set(this.f18556a, m19620b(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: a */
    public final <T> T mo15159a(String str, Class<?>... clsArr) throws ReflectException {
        return mo15161b(str, clsArr).f18556a;
    }

    /* JADX INFO: used method not loaded: com.bytedance.common.utility.reflect.ReflectException.<init>(java.lang.Throwable):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return m19613a(m19625d(r3, r4), r2.f18556a, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.bytedance.common.utility.reflect.ReflectException((java.lang.Throwable) r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.common.utility.reflect.C6322b mo15158a(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.bytedance.common.utility.reflect.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.m19621b(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.f18556a     // Catch:{ NoSuchMethodException -> 0x000b }
            com.bytedance.common.utility.reflect.b r0 = m19613a(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r0
        L_0x000b:
            java.lang.reflect.Method r3 = r2.m19625d(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.f18556a     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.bytedance.common.utility.reflect.b r3 = m19613a(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.bytedance.common.utility.reflect.ReflectException r4 = new com.bytedance.common.utility.reflect.ReflectException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.C6322b.mo15158a(java.lang.String, java.lang.Class[], java.lang.Object[]):com.bytedance.common.utility.reflect.b");
    }

    /* renamed from: a */
    public final C6322b mo15156a() throws ReflectException {
        return m19614a(new Object[0]);
    }

    public final int hashCode() {
        return this.f18556a.hashCode();
    }

    public final String toString() {
        return this.f18556a.toString();
    }

    /* renamed from: b */
    private Class<?> m19618b() {
        if (this.f18557b) {
            return (Class) this.f18556a;
        }
        return this.f18556a.getClass();
    }

    private C6322b(Object obj) {
        this.f18556a = obj;
    }

    /* renamed from: a */
    public static C6322b m19609a(Class<?> cls) {
        return new C6322b(cls);
    }

    private C6322b(Class<?> cls) {
        this.f18556a = cls;
        this.f18557b = true;
    }

    /* renamed from: a */
    public static C6322b m19610a(Object obj) {
        return new C6322b(obj);
    }

    /* renamed from: c */
    private static Class<?> m19623c(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: a */
    public static C6322b m19611a(String str) throws ReflectException {
        return m19609a(m19623c(str));
    }

    /* renamed from: b */
    private static Object m19620b(Object obj) {
        if (obj instanceof C6322b) {
            return ((C6322b) obj).f18556a;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6322b) {
            return this.f18556a.equals(((C6322b) obj).f18556a);
        }
        return false;
    }

    /* renamed from: b */
    public static Class<?> m19619b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        if (cls.isPrimitive()) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            if (Short.TYPE == cls) {
                return Short.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Void.TYPE == cls) {
                return Void.class;
            }
        }
        return cls;
    }

    /* renamed from: a */
    private C6322b m19614a(Object... objArr) throws ReflectException {
        Constructor[] declaredConstructors;
        Class[] b = m19622b(objArr);
        try {
            return m19612a(m19618b().getDeclaredConstructor(b), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor constructor : m19618b().getDeclaredConstructors()) {
                if (m19617a((Class<?>[]) constructor.getParameterTypes(), (Class<?>[]) b)) {
                    return m19612a(constructor, objArr);
                }
            }
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: b */
    private static Class<?>[] m19622b(Object... objArr) {
        Class<C6323a> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                cls = C6323a.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    /* renamed from: a */
    private static <T extends AccessibleObject> T m19615a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* renamed from: b */
    public final C6322b mo15160b(String str) throws ReflectException {
        return mo15158a(str, (Class<?>[]) null, new Object[0]);
    }

    /* renamed from: a */
    private static C6322b m19612a(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return m19610a(((Constructor) m19615a((T) constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: c */
    private Field m19624c(String str, Class<?>... clsArr) throws ReflectException {
        Field[] declaredFields;
        Class b = m19618b();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return b.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) m19615a((T) b.getDeclaredField(str));
                    } catch (NoSuchFieldException unused) {
                        b = b.getSuperclass();
                        if (b != null) {
                            throw new ReflectException((Throwable) e);
                        }
                    }
                } while (b != null);
                throw new ReflectException((Throwable) e);
            }
        } else {
            do {
                try {
                    for (Field field : b.getDeclaredFields()) {
                        Class type = field.getType();
                        if (type != null && type.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) m19615a((T) field);
                        }
                    }
                } catch (Exception unused2) {
                }
                b = b.getSuperclass();
            } while (b != null);
            throw new ReflectException("NoSuchFieldException");
        }
    }

    /* renamed from: d */
    private Method m19625d(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Method[] methods;
        Method[] declaredMethods;
        Class b = m19618b();
        for (Method method : b.getMethods()) {
            if (m19616a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : b.getDeclaredMethods()) {
                if (m19616a(method2, str, clsArr)) {
                    return method2;
                }
            }
            b = b.getSuperclass();
        } while (b != null);
        StringBuilder sb = new StringBuilder("No similar method ");
        sb.append(str);
        sb.append(" with params ");
        sb.append(Arrays.toString(clsArr));
        sb.append(" could be found on type ");
        sb.append(m19618b());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        throw new NoSuchMethodException(sb.toString());
    }

    /* renamed from: b */
    public final C6322b mo15161b(String str, Class<?>... clsArr) throws ReflectException {
        try {
            return m19610a(m19624c(str, clsArr).get(this.f18556a));
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: a */
    private static boolean m19617a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != C6323a.class && !m19619b(clsArr[i]).isAssignableFrom(m19619b(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r8 = m19618b().getMethods();
        r0 = r8.length;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r1 < r0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = r8[r1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r6.equals(r2.getName()) != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r3 = r2.getParameterTypes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        return r8.getDeclaredMethod(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r8 = r8.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r8 != null) goto L_0x0009;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.reflect.Method m19621b(java.lang.String r6, java.lang.Class<?>[] r7, java.lang.Object... r8) throws java.lang.NoSuchMethodException {
        /*
            r5 = this;
            java.lang.Class r8 = r5.m19618b()
            java.lang.reflect.Method r0 = r8.getMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x000e }
            return r0
        L_0x000e:
            java.lang.Class r8 = r8.getSuperclass()
            if (r8 != 0) goto L_0x0009
            java.lang.Class r8 = r5.m19618b()
            java.lang.reflect.Method[] r8 = r8.getMethods()
            int r0 = r8.length
            r1 = 0
        L_0x001e:
            if (r1 >= r0) goto L_0x003a
            r2 = r8[r1]
            java.lang.String r3 = r2.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0037
            java.lang.Class[] r3 = r2.getParameterTypes()
            if (r3 == 0) goto L_0x0037
            int r3 = r3.length
            int r4 = r7.length
            if (r3 != r4) goto L_0x0037
            return r2
        L_0x0037:
            int r1 = r1 + 1
            goto L_0x001e
        L_0x003a:
            java.lang.NoSuchMethodException r6 = new java.lang.NoSuchMethodException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.reflect.C6322b.m19621b(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }

    /* renamed from: a */
    private static C6322b m19613a(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            m19615a((T) method);
            if (method.getReturnType() != Void.TYPE) {
                return m19610a(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m19610a(obj);
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: a */
    private boolean m19616a(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !m19617a((Class<?>[]) method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }
}
