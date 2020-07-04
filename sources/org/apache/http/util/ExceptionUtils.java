package org.apache.http.util;

import java.lang.reflect.Method;

public final class ExceptionUtils {
    private static final Method INIT_CAUSE_METHOD = getInitCauseMethod();
    static Class class$java$lang$Throwable;

    private static Method getInitCauseMethod() {
        Class cls;
        Class cls2;
        try {
            Class[] clsArr = new Class[1];
            if (class$java$lang$Throwable == null) {
                cls = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls;
            } else {
                cls = class$java$lang$Throwable;
            }
            clsArr[0] = cls;
            if (class$java$lang$Throwable == null) {
                cls2 = class$("java.lang.Throwable");
                class$java$lang$Throwable = cls2;
            } else {
                cls2 = class$java$lang$Throwable;
            }
            return cls2.getMethod("initCause", clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    static Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public static void initCause(Throwable th, Throwable th2) {
        if (INIT_CAUSE_METHOD != null) {
            try {
                INIT_CAUSE_METHOD.invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
    }
}
