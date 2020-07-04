package com.taobao.android.dexposed;

import android.content.Context;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DeviceCheck {
    private static boolean isCheckedDeviceSupport;
    private static boolean isDeviceSupportable;

    private static boolean isDalvikMode() {
        if ("Dalvik".equals(getCurrentRuntimeValue())) {
            return true;
        }
        return false;
    }

    private static boolean isSupportSDKVersion() {
        if ((VERSION.SDK_INT >= 14 && VERSION.SDK_INT < 20) || VERSION.SDK_INT == 10 || VERSION.SDK_INT == 9) {
            return true;
        }
        return false;
    }

    private static String getCurrentRuntimeValue() {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            try {
                Method method = cls.getMethod("get", new Class[]{String.class, String.class});
                if (method == null) {
                    return "WTF?!";
                }
                try {
                    String str = (String) method.invoke(cls, new Object[]{"persist.sys.dalvik.vm.lib", "Dalvik"});
                    if ("libdvm.so".equals(str)) {
                        return "Dalvik";
                    }
                    if ("libart.so".equals(str)) {
                        return "ART";
                    }
                    if ("libartd.so".equals(str)) {
                        return "ART debug build";
                    }
                    return str;
                } catch (IllegalAccessException unused) {
                    return "IllegalAccessException";
                } catch (IllegalArgumentException unused2) {
                    return "IllegalArgumentException";
                } catch (InvocationTargetException unused3) {
                    return "InvocationTargetException";
                }
            } catch (NoSuchMethodException unused4) {
                return "SystemProperties.get(String key, String def) method is not found";
            }
        } catch (ClassNotFoundException unused5) {
            return "SystemProperties class is not found";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|(2:16|17)|18|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0079, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0035 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[SYNTHETIC, Splitter:B:16:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0057 A[SYNTHETIC, Splitter:B:42:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x005e A[SYNTHETIC, Splitter:B:46:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0065 A[SYNTHETIC, Splitter:B:50:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x006d A[SYNTHETIC, Splitter:B:57:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0074 A[SYNTHETIC, Splitter:B:61:0x0074] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean isX86CPU() {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0069, all -> 0x0050 }
            java.lang.String r2 = "getprop ro.product.cpu.abi"
            java.lang.Process r1 = r1.exec(r2)     // Catch:{ Exception -> 0x0069, all -> 0x0050 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x004e, all -> 0x0049 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0047, all -> 0x0042 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0047, all -> 0x0042 }
            java.lang.String r0 = r3.readLine()     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            java.lang.String r4 = "x86"
            boolean r0 = r0.contains(r4)     // Catch:{ Exception -> 0x0040, all -> 0x003e }
            if (r0 == 0) goto L_0x0032
            r3.close()     // Catch:{ Exception -> 0x0028 }
        L_0x0028:
            r2.close()     // Catch:{ Exception -> 0x002b }
        L_0x002b:
            if (r1 == 0) goto L_0x0030
            r1.destroy()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r0 = 1
            return r0
        L_0x0032:
            r3.close()     // Catch:{ Exception -> 0x0035 }
        L_0x0035:
            r2.close()     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            if (r1 == 0) goto L_0x007c
        L_0x003a:
            r1.destroy()     // Catch:{ Exception -> 0x007c }
            goto L_0x007c
        L_0x003e:
            r0 = move-exception
            goto L_0x0055
        L_0x0040:
            r0 = r3
            goto L_0x006b
        L_0x0042:
            r3 = move-exception
            r5 = r3
            r3 = r0
            r0 = r5
            goto L_0x0055
        L_0x0047:
            goto L_0x006b
        L_0x0049:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L_0x0055
        L_0x004e:
            r2 = r0
            goto L_0x006b
        L_0x0050:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
        L_0x0055:
            if (r3 == 0) goto L_0x005c
            r3.close()     // Catch:{ Exception -> 0x005b }
            goto L_0x005c
        L_0x005b:
        L_0x005c:
            if (r2 == 0) goto L_0x0063
            r2.close()     // Catch:{ Exception -> 0x0062 }
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r1 == 0) goto L_0x0068
            r1.destroy()     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            throw r0
        L_0x0069:
            r1 = r0
            r2 = r1
        L_0x006b:
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ Exception -> 0x0071 }
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            if (r2 == 0) goto L_0x0079
            r2.close()     // Catch:{ Exception -> 0x0078 }
            goto L_0x0079
        L_0x0078:
        L_0x0079:
            if (r1 == 0) goto L_0x007c
            goto L_0x003a
        L_0x007c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dexposed.DeviceCheck.isX86CPU():boolean");
    }

    private static boolean isYunOS() {
        String str;
        String str2 = null;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class});
            str = (String) method.invoke(null, new Object[]{"ro.yunos.version"});
            try {
                str2 = (String) method.invoke(null, new Object[]{"java.vm.name"});
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            str = null;
        }
        if ((str2 == null || !str2.toLowerCase().contains("lemur")) && (str == null || str.trim().length() <= 0)) {
            return false;
        }
        return true;
    }

    public static synchronized boolean isDeviceSupport(Context context) {
        synchronized (DeviceCheck.class) {
            try {
                if (isCheckedDeviceSupport) {
                    boolean z = isDeviceSupportable;
                    isCheckedDeviceSupport = true;
                    return z;
                }
                if (isX86CPU() || isYunOS()) {
                    isDeviceSupportable = false;
                } else {
                    isDeviceSupportable = true;
                }
                isCheckedDeviceSupport = true;
                boolean z2 = isDeviceSupportable;
                return z2;
            } catch (Throwable th) {
                isCheckedDeviceSupport = true;
                throw th;
            }
        }
    }
}
