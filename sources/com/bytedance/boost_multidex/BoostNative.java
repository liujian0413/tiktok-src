package com.bytedance.boost_multidex;

import android.os.Build.VERSION;
import java.io.File;
import java.lang.reflect.Method;

final class BoostNative {
    private static volatile boolean alreadyInit;
    private static boolean supportFastLoadDex;

    static {
        Monitor.get().loadLibrary("boost_multidex");
    }

    BoostNative() {
    }

    private static void checkSupportFastLoad(Result result) {
        try {
            Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class, String.class});
            if (VERSION.SDK_INT >= 19) {
                String str = (String) declaredMethod.invoke(null, new Object[]{"persist.sys.dalvik.vm.lib", null});
                result.vmLibName = str;
                Monitor monitor = Monitor.get();
                StringBuilder sb = new StringBuilder("VM lib is ");
                sb.append(str);
                monitor.logInfo(sb.toString());
                if ("libart.so".equals(str)) {
                    Monitor.get().logWarning("VM lib is art, skip!");
                    return;
                }
            }
            String str2 = (String) declaredMethod.invoke(null, new Object[]{"ro.yunos.version", null});
            if ((str2 == null || str2.isEmpty()) && !new File("/system/lib/libvmkid_lemur.so").exists()) {
                supportFastLoadDex = initialize(VERSION.SDK_INT, RuntimeException.class);
                result.supportFastLoadDex = supportFastLoadDex;
                return;
            }
            result.isYunOS = true;
            Monitor monitor2 = Monitor.get();
            StringBuilder sb2 = new StringBuilder("Yun os is ");
            sb2.append(str2);
            sb2.append(", skip boost!");
            monitor2.logWarning(sb2.toString());
        } catch (Throwable th) {
            result.addUnFatalThrowable(th);
            Monitor.get().logWarning("Fail to init", th);
        }
    }

    private static native boolean initialize(int i, Class<RuntimeException> cls);

    static synchronized boolean isSupportFastLoad() {
        boolean z;
        synchronized (BoostNative.class) {
            if (!alreadyInit) {
                checkSupportFastLoad(Result.get());
                alreadyInit = true;
            }
            z = supportFastLoadDex;
        }
        return z;
    }

    static native Object loadDirectDex(String str, byte[] bArr);

    static native boolean makeOptDexFile(String str, String str2);

    static native long obtainCheckSum(String str);

    static native void recoverAction();
}
