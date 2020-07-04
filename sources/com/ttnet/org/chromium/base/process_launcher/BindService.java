package com.ttnet.org.chromium.base.process_launcher;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

final class BindService {
    private static Method sBindServiceAsUserMethod;
    private static final Method sDoBindServiceQMethod;
    private static final Method sUpdateServiceGroupQMethod;

    private BindService() {
    }

    static boolean supportVariableConnections() {
        if (sDoBindServiceQMethod == null || sUpdateServiceGroupQMethod == null) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
    static {
        /*
            r0 = 0
            com.ttnet.org.chromium.base.StrictModeContext r1 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()     // Catch:{ Exception -> 0x0091, all -> 0x008a }
            boolean r2 = com.ttnet.org.chromium.base.BuildInfo.isAtLeastQ()     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            if (r2 == 0) goto L_0x0058
            java.lang.String r2 = "org.chromium.base.process_launcher.BindServiceInternal"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.String r3 = "doBindServiceQ"
            r4 = 6
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.Class<android.content.Intent> r5 = android.content.Intent.class
            r7 = 1
            r4[r7] = r5     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.Class<android.content.ServiceConnection> r5 = android.content.ServiceConnection.class
            r8 = 2
            r4[r8] = r5     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            r9 = 3
            r4[r9] = r5     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.Class<java.util.concurrent.Executor> r5 = java.util.concurrent.Executor.class
            r10 = 4
            r4[r10] = r5     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            r5 = 5
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r4[r5] = r11     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r4)     // Catch:{ Throwable -> 0x006c, all -> 0x0068 }
            java.lang.String r4 = "updateServiceGroupQ"
            java.lang.Class[] r5 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r5[r6] = r10     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            java.lang.Class<android.content.ServiceConnection> r6 = android.content.ServiceConnection.class
            r5[r7] = r6     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            r5[r8] = r6     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            r5[r9] = r6     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r5)     // Catch:{ Throwable -> 0x0056, all -> 0x0052 }
            r0 = r3
            goto L_0x0059
        L_0x0052:
            r2 = move-exception
            r4 = r3
            r3 = r0
            goto L_0x0074
        L_0x0056:
            r2 = move-exception
            goto L_0x006e
        L_0x0058:
            r2 = r0
        L_0x0059:
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ Exception -> 0x0063, all -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r1 = move-exception
            r4 = r0
            r0 = r2
            goto L_0x008c
        L_0x0063:
            sDoBindServiceQMethod = r0
            sUpdateServiceGroupQMethod = r2
            return
        L_0x0068:
            r2 = move-exception
            r3 = r0
            r4 = r3
            goto L_0x0074
        L_0x006c:
            r2 = move-exception
            r3 = r0
        L_0x006e:
            throw r2     // Catch:{ all -> 0x006f }
        L_0x006f:
            r4 = move-exception
            r12 = r3
            r3 = r2
            r2 = r4
            r4 = r12
        L_0x0074:
            if (r1 == 0) goto L_0x0084
            if (r3 == 0) goto L_0x0081
            r1.close()     // Catch:{ Throwable -> 0x007c }
            goto L_0x0084
        L_0x007c:
            r1 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20181a(r3, r1)     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
            goto L_0x0084
        L_0x0081:
            r1.close()     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
        L_0x0084:
            throw r2     // Catch:{ Exception -> 0x0087, all -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            goto L_0x008c
        L_0x0087:
            r2 = r0
            r0 = r4
            goto L_0x0063
        L_0x008a:
            r1 = move-exception
            r4 = r0
        L_0x008c:
            sDoBindServiceQMethod = r4
            sUpdateServiceGroupQMethod = r0
            throw r1
        L_0x0091:
            r2 = r0
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.process_launcher.BindService.<clinit>():void");
    }

    private static boolean bindServiceByCall(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return context.bindService(intent, serviceConnection, i);
    }

    static void updateServiceGroup(Context context, ServiceConnection serviceConnection, int i, int i2) {
        try {
            sUpdateServiceGroupQMethod.invoke(null, new Object[]{context, serviceConnection, Integer.valueOf(i), Integer.valueOf(i2)});
        } catch (ReflectiveOperationException unused) {
        }
    }

    private static boolean bindServiceByReflection(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler) throws ReflectiveOperationException {
        if (sBindServiceAsUserMethod == null) {
            sBindServiceAsUserMethod = Context.class.getDeclaredMethod("bindServiceAsUser", new Class[]{Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class});
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((Boolean) sBindServiceAsUserMethod.invoke(context, new Object[]{intent, serviceConnection, Integer.valueOf(i), handler, Process.myUserHandle()})).booleanValue();
    }

    static boolean doBindService(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler, Executor executor, String str) {
        if (supportVariableConnections()) {
            try {
                return ((Boolean) sDoBindServiceQMethod.invoke(null, new Object[]{context, intent, serviceConnection, Integer.valueOf(i), executor, str})).booleanValue();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else if (VERSION.SDK_INT < 24) {
            return bindServiceByCall(context, intent, serviceConnection, i);
        } else {
            try {
                return bindServiceByReflection(context, intent, serviceConnection, i, handler);
            } catch (ReflectiveOperationException unused) {
                return bindServiceByCall(context, intent, serviceConnection, i);
            }
        }
    }
}
