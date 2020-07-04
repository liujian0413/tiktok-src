package com.ttnet.org.chromium.base;

import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Reflect {
    private final boolean isClass;
    public final Object object;

    public static class NULL {
    }

    public <T> T get() {
        return this.object;
    }

    public Reflect create() throws ReflectException {
        return create(new Object[0]);
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return this.object.toString();
    }

    public Class<?> type() {
        if (this.isClass) {
            return (Class) this.object;
        }
        return this.object.getClass();
    }

    public Map<String, Reflect> fields() {
        Field[] declaredFields;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class type = type();
        do {
            for (Field field : type.getDeclaredFields()) {
                if ((!this.isClass) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, field(name, new Class[0]));
                    }
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        return linkedHashMap;
    }

    private Reflect(Object obj) {
        this.object = obj;
    }

    /* renamed from: on */
    public static Reflect m146421on(Class<?> cls) {
        return new Reflect(cls);
    }

    private Reflect(Class<?> cls) {
        this.object = cls;
        this.isClass = true;
    }

    private static Class<?> forName(String str) throws ReflectException {
        try {
            return Class.forName(str);
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* renamed from: on */
    public static Reflect m146422on(Object obj) {
        return new Reflect(obj);
    }

    private static Object unwrap(Object obj) {
        if (obj instanceof Reflect) {
            return ((Reflect) obj).get();
        }
        return obj;
    }

    public Reflect call(String str) throws ReflectException {
        return call(str, null, new Object[0]);
    }

    /* renamed from: on */
    public static Reflect m146423on(String str) throws ReflectException {
        return m146421on(forName(str));
    }

    public static Class<?>[] types(Object... objArr) {
        Class<NULL> cls;
        if (objArr == null) {
            return new Class[0];
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                cls = NULL.class;
            } else {
                cls = obj.getClass();
            }
            clsArr[i] = cls;
        }
        return clsArr;
    }

    /* renamed from: as */
    public <P> P mo116068as(Class<P> cls) {
        final boolean z = this.object instanceof Map;
        C466051 r1 = new InvocationHandler() {
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                int i;
                String name = method.getName();
                try {
                    return Reflect.m146422on(Reflect.this.object).call(name, Reflect.types(objArr), objArr).get();
                } catch (ReflectException e) {
                    if (z) {
                        Map map = (Map) Reflect.this.object;
                        if (objArr == null) {
                            i = 0;
                        } else {
                            i = objArr.length;
                        }
                        if (i == 0 && name.startsWith("get")) {
                            return map.get(Reflect.property(name.substring(3)));
                        }
                        if (i == 0 && name.startsWith("is")) {
                            return map.get(Reflect.property(name.substring(2)));
                        }
                        if (i == 1 && name.startsWith("set")) {
                            map.put(Reflect.property(name.substring(3)), objArr[0]);
                            return null;
                        }
                    }
                    throw e;
                }
            }
        };
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, r1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Reflect) {
            return this.object.equals(((Reflect) obj).get());
        }
        return false;
    }

    public static <T extends AccessibleObject> T accessible(T t) {
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

    public static String property(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1).toLowerCase());
        sb.append(str.substring(1));
        return sb.toString();
    }

    public Reflect create(Object... objArr) throws ReflectException {
        Constructor[] declaredConstructors;
        Class[] types = types(objArr);
        try {
            return m146424on(type().getDeclaredConstructor(types), objArr);
        } catch (NoSuchMethodException e) {
            for (Constructor constructor : type().getDeclaredConstructors()) {
                if (match(constructor.getParameterTypes(), types)) {
                    return m146424on(constructor, objArr);
                }
            }
            throw new ReflectException((Throwable) e);
        }
    }

    public static Class<?> wrapper(Class<?> cls) {
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

    public Field exactField(String str, Class<?>... clsArr) throws ReflectException {
        return field0(str, clsArr);
    }

    public <T> T get(String str, Class<?>... clsArr) throws ReflectException {
        return field(str, clsArr).get();
    }

    public Reflect field(String str, Class<?>... clsArr) throws ReflectException {
        try {
            return m146422on(field0(str, clsArr).get(this.object));
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    public Reflect set(String str, Object obj) throws ReflectException {
        try {
            field0(str, new Class[0]).set(this.object, unwrap(obj));
            return this;
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    private boolean match(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr2.length; i++) {
            if (clsArr2[i] != NULL.class && !wrapper(clsArr[i]).isAssignableFrom(wrapper(clsArr2[i]))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: on */
    private static Reflect m146424on(Constructor<?> constructor, Object... objArr) throws ReflectException {
        try {
            return m146422on(((Constructor) accessible(constructor)).newInstance(objArr));
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    private Field field0(String str, Class<?>... clsArr) throws ReflectException {
        Field[] declaredFields;
        Class type = type();
        if (clsArr == null || clsArr.length <= 0) {
            try {
                return type.getField(str);
            } catch (NoSuchFieldException e) {
                do {
                    try {
                        return (Field) accessible(type.getDeclaredField(str));
                    } catch (NoSuchFieldException unused) {
                        type = type.getSuperclass();
                        if (type != null) {
                            throw new ReflectException((Throwable) e);
                        }
                    }
                } while (type != null);
                throw new ReflectException((Throwable) e);
            }
        } else {
            do {
                try {
                    for (Field field : type.getDeclaredFields()) {
                        Class type2 = field.getType();
                        if (type2 != null && type2.getName().equals(clsArr[0].getName()) && field.getName().equals(str)) {
                            return (Field) accessible(field);
                        }
                    }
                } catch (Exception unused2) {
                }
                type = type.getSuperclass();
            } while (type != null);
            throw new ReflectException("NoSuchFieldException");
        }
    }

    private Method similarMethod(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Method[] methods;
        Method[] declaredMethods;
        Class type = type();
        for (Method method : type.getMethods()) {
            if (isSimilarSignature(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : type.getDeclaredMethods()) {
                if (isSimilarSignature(method2, str, clsArr)) {
                    return method2;
                }
            }
            type = type.getSuperclass();
        } while (type != null);
        StringBuilder sb = new StringBuilder("No similar method ");
        sb.append(str);
        sb.append(" with params ");
        sb.append(Arrays.toString(clsArr));
        sb.append(" could be found on type ");
        sb.append(type());
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        throw new NoSuchMethodException(sb.toString());
    }

    private boolean isSimilarSignature(Method method, String str, Class<?>[] clsArr) {
        if (!method.getName().equals(str) || !match(method.getParameterTypes(), clsArr)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        return m146425on(similarMethod(r3, r4), r2.object, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw new com.ttnet.org.chromium.base.ReflectException((java.lang.Throwable) r3);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ttnet.org.chromium.base.Reflect call(java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object... r5) throws com.ttnet.org.chromium.base.ReflectException {
        /*
            r2 = this;
            java.lang.reflect.Method r0 = r2.exactMethod(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            java.lang.Object r1 = r2.object     // Catch:{ NoSuchMethodException -> 0x000b }
            com.ttnet.org.chromium.base.Reflect r0 = m146425on(r0, r1, r5)     // Catch:{ NoSuchMethodException -> 0x000b }
            return r0
        L_0x000b:
            java.lang.reflect.Method r3 = r2.similarMethod(r3, r4)     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.Object r4 = r2.object     // Catch:{ NoSuchMethodException -> 0x0016 }
            com.ttnet.org.chromium.base.Reflect r3 = m146425on(r3, r4, r5)     // Catch:{ NoSuchMethodException -> 0x0016 }
            return r3
        L_0x0016:
            r3 = move-exception
            com.ttnet.org.chromium.base.ReflectException r4 = new com.ttnet.org.chromium.base.ReflectException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.Reflect.call(java.lang.String, java.lang.Class[], java.lang.Object[]):com.ttnet.org.chromium.base.Reflect");
    }

    /* renamed from: on */
    private static Reflect m146425on(Method method, Object obj, Object... objArr) throws ReflectException {
        try {
            accessible(method);
            if (method.getReturnType() != Void.TYPE) {
                return m146422on(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m146422on(obj);
        } catch (Exception e) {
            throw new ReflectException((Throwable) e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r2 = type();
        r3 = r2.getMethods();
        r4 = r3.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r6 < r4) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r7 = r3[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (r0.equals(r7.getName()) != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r8 = r7.getParameterTypes();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (com.ttnet.org.chromium.base.Logger.debug() != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r9 = r8.length;
        r11 = 0;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r11 < r9) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r13 = r8[r11];
        r15 = new java.lang.StringBuilder("Reflect type = ");
        r15.append(r2);
        r15.append(" method = ");
        r15.append(r0);
        r15.append(" paramTypes ");
        r15.append(r12);
        r15.append(" = ");
        r15.append(r13.getName());
        com.ttnet.org.chromium.base.Logger.m146406d("Plugin", r15.toString());
        r12 = r12 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        throw new java.lang.NoSuchMethodException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        return r2.getDeclaredMethod(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r2 = r2.getSuperclass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r2 == null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.reflect.Method exactMethod(java.lang.String r17, java.lang.Class<?>[] r18, java.lang.Object... r19) throws java.lang.NoSuchMethodException {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.Class r2 = r16.type()
            java.lang.reflect.Method r3 = r2.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x000d }
            return r3
        L_0x000d:
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0012 }
            return r3
        L_0x0012:
            java.lang.Class r2 = r2.getSuperclass()
            if (r2 != 0) goto L_0x000d
            java.lang.Class r2 = r16.type()
            java.lang.reflect.Method[] r3 = r2.getMethods()
            int r4 = r3.length
            r6 = 0
        L_0x0022:
            if (r6 >= r4) goto L_0x007f
            r7 = r3[r6]
            java.lang.String r8 = r7.getName()
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x007c
            java.lang.Class[] r8 = r7.getParameterTypes()
            boolean r9 = com.ttnet.org.chromium.base.Logger.debug()
            if (r9 == 0) goto L_0x0075
            int r9 = r8.length
            r10 = 1
            r11 = 0
            r12 = 1
        L_0x003e:
            if (r11 >= r9) goto L_0x0075
            r13 = r8[r11]
            java.lang.String r14 = "Plugin"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r5 = "Reflect type = "
            r15.<init>(r5)
            r15.append(r2)
            java.lang.String r5 = " method = "
            r15.append(r5)
            r15.append(r0)
            java.lang.String r5 = " paramTypes "
            r15.append(r5)
            r15.append(r12)
            java.lang.String r5 = " = "
            r15.append(r5)
            java.lang.String r5 = r13.getName()
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            com.ttnet.org.chromium.base.Logger.m146406d(r14, r5)
            int r12 = r12 + r10
            int r11 = r11 + 1
            goto L_0x003e
        L_0x0075:
            if (r8 == 0) goto L_0x007c
            int r5 = r8.length
            int r8 = r1.length
            if (r5 != r8) goto L_0x007c
            return r7
        L_0x007c:
            int r6 = r6 + 1
            goto L_0x0022
        L_0x007f:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.Reflect.exactMethod(java.lang.String, java.lang.Class[], java.lang.Object[]):java.lang.reflect.Method");
    }
}
