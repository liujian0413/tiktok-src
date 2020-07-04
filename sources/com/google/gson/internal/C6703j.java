package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.j */
public abstract class C6703j {
    /* renamed from: a */
    public abstract <T> T mo16131a(Class<T> cls) throws Exception;

    /* renamed from: a */
    public static C6703j m20728a() {
        try {
            Class cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", new Class[]{Class.class});
            return new C6703j() {
                /* renamed from: a */
                public final <T> T mo16131a(Class<T> cls) throws Exception {
                    m20729b(cls);
                    return method.invoke(obj, new Object[]{cls});
                }
            };
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, new Object[]{Object.class})).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new C6703j() {
                    /* renamed from: a */
                    public final <T> T mo16131a(Class<T> cls) throws Exception {
                        m20729b(cls);
                        return declaredMethod2.invoke(null, new Object[]{cls, Integer.valueOf(intValue)});
                    }
                };
            } catch (Exception unused2) {
                try {
                    final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new C6703j() {
                        /* renamed from: a */
                        public final <T> T mo16131a(Class<T> cls) throws Exception {
                            m20729b(cls);
                            return declaredMethod3.invoke(null, new Object[]{cls, Object.class});
                        }
                    };
                } catch (Exception unused3) {
                    return new C6703j() {
                        /* renamed from: a */
                        public final <T> T mo16131a(Class<T> cls) {
                            StringBuilder sb = new StringBuilder("Cannot allocate ");
                            sb.append(cls);
                            throw new UnsupportedOperationException(sb.toString());
                        }
                    };
                }
            }
        }
    }

    /* renamed from: b */
    static void m20729b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            StringBuilder sb = new StringBuilder("Interface can't be instantiated! Interface name: ");
            sb.append(cls.getName());
            throw new UnsupportedOperationException(sb.toString());
        } else if (Modifier.isAbstract(modifiers)) {
            StringBuilder sb2 = new StringBuilder("Abstract class can't be instantiated! Class name: ");
            sb2.append(cls.getName());
            throw new UnsupportedOperationException(sb2.toString());
        }
    }
}
