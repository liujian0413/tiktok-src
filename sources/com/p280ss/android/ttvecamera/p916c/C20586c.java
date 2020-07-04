package com.p280ss.android.ttvecamera.p916c;

import com.p280ss.android.ttvecamera.C20652m;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ttvecamera.c.c */
public final class C20586c {
    /* renamed from: a */
    private static boolean m68165a(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr == null || clsArr.length == 0) {
            if (objArr == null || objArr.length == 0) {
                return true;
            }
            return false;
        } else if (objArr == null || clsArr.length != objArr.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (objArr[i] != null && !clsArr[i].isAssignableFrom(objArr[i].getClass())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static <T> T m68163a(String str, String str2, Object[] objArr) {
        try {
            Method a = m68164a(Class.forName(str), str2, objArr);
            a.setAccessible(true);
            return a.invoke(null, objArr);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("couldn't invoke ");
            sb.append(str2);
            sb.append(", ");
            sb.append(e);
            C20652m.m68436c("TEReflectUtil", sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static Method m68164a(Class<? extends Object> cls, String str, Object[] objArr) {
        Method[] declaredMethods;
        do {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str) && m68165a(method.getParameterTypes(), objArr)) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        } while (cls != null);
        return null;
    }
}
