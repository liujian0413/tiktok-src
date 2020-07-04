package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.measurement.ev */
public class C16513ev {

    /* renamed from: a */
    private static volatile UserManager f46286a;

    /* renamed from: b */
    private static volatile boolean f46287b = (!m53821a());

    private C16513ev() {
    }

    /* renamed from: a */
    public static boolean m53821a() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m53822a(Context context) {
        return !m53821a() || m53823b(context);
    }

    /* renamed from: b */
    private static boolean m53823b(Context context) {
        boolean z = f46287b;
        if (!z) {
            boolean z2 = z;
            int i = 1;
            while (true) {
                if (i > 2) {
                    break;
                }
                UserManager c = m53824c(context);
                if (c == null) {
                    f46287b = true;
                    return true;
                }
                try {
                    if (!c.isUserUnlocked()) {
                        if (c.isUserRunning(Process.myUserHandle())) {
                            z2 = false;
                            f46287b = z2;
                        }
                    }
                    z2 = true;
                    f46287b = z2;
                } catch (NullPointerException unused) {
                    f46286a = null;
                    i++;
                }
            }
            z = z2;
            if (z) {
                f46286a = null;
            }
        }
        return z;
    }

    /* renamed from: c */
    private static UserManager m53824c(Context context) {
        UserManager userManager = f46286a;
        if (userManager == null) {
            synchronized (C16513ev.class) {
                userManager = f46286a;
                if (userManager == null) {
                    UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                    f46286a = userManager2;
                    userManager = userManager2;
                }
            }
        }
        return userManager;
    }
}
