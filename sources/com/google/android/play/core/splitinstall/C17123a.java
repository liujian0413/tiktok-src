package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.play.core.internal.C6525f;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.google.android.play.core.splitinstall.a */
public final class C17123a {

    /* renamed from: a */
    private static final C6525f f47836a = new C6525f("SplitInstallHelper");

    /* renamed from: a */
    public static void m56758a(Context context) {
        if (VERSION.SDK_INT > 25 && VERSION.SDK_INT < 28) {
            f47836a.mo15889a("Calling dispatchPackageBroadcast", new Object[0]);
            try {
                Class cls = Class.forName("android.app.ActivityThread");
                Method method = cls.getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mAppThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                obj.getClass().getMethod("dispatchPackageBroadcast", new Class[]{Integer.TYPE, String[].class}).invoke(obj, new Object[]{Integer.valueOf(3), new String[]{context.getPackageName()}});
                f47836a.mo15889a("Called dispatchPackageBroadcast", new Object[0]);
            } catch (Exception e) {
                f47836a.mo15890a((Throwable) e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m56759a(Context context, String str) throws UnsatisfiedLinkError {
        try {
            C17132b.m56780a(str);
        } catch (UnsatisfiedLinkError e) {
            boolean z = false;
            try {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    C17132b.m56781b(sb2);
                    z = true;
                }
                if (!z) {
                    throw e;
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
    }
}
