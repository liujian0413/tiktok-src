package com.p280ss.android.ttve.nativePort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ttve.nativePort.TESystemUtils */
public class TESystemUtils {
    public static int getOutputLatency(int i) {
        try {
            Class cls = Class.forName("android.media.AudioSystem");
            if (cls == null) {
                return 0;
            }
            Method declaredMethod = cls.getDeclaredMethod("getOutputLatency", new Class[]{Integer.TYPE});
            if (declaredMethod == null) {
                return 0;
            }
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(cls, new Object[]{Integer.valueOf(i)})).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }
}
