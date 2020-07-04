package com.p280ss.ttm.utils.app;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.ttm.utils.app.RefUtil */
public class RefUtil {
    public static Object getFieldValue(Object obj, String str) {
        Field declaredField = getDeclaredField(obj, str);
        declaredField.setAccessible(true);
        try {
            return declaredField.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Field getDeclaredField(Object obj, String str) {
        Class<Object> cls = obj.getClass();
        while (cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object invokeMethod(Object obj, String str) {
        Method declaredMethod = getDeclaredMethod(obj, str, (Class<?>[]) new Class[0]);
        if (declaredMethod == null) {
            return null;
        }
        try {
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(obj, new Object[0]);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2.getMessage());
        } catch (InvocationTargetException e3) {
            Throwable targetException = e3.getTargetException();
            if (targetException != null) {
                System.out.print(targetException.getMessage());
            }
            throw new RuntimeException(e3.getMessage());
        }
    }

    public static Method getDeclaredMethod(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != Object.class) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static void setFieldValue(Object obj, String str, Object obj2) {
        Field declaredField = getDeclaredField(obj, str);
        declaredField.setAccessible(true);
        try {
            declaredField.set(obj, obj2);
        } catch (IllegalArgumentException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    public static Method getDeclaredMethod(Object obj, String str, Class<?>... clsArr) {
        Class<Object> cls = obj.getClass();
        while (cls != Object.class) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Object invokeMethod(Object obj, String str, Class<?>[] clsArr, Object[] objArr) {
        Method declaredMethod = getDeclaredMethod(obj, str, clsArr);
        declaredMethod.setAccessible(true);
        if (declaredMethod != null) {
            try {
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            } catch (InvocationTargetException e) {
                Throwable targetException = e.getTargetException();
                if (targetException != null) {
                    System.out.print(targetException.getMessage());
                }
            }
        }
        return null;
    }
}
