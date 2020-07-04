package com.google.android.gms.common.p749d;

import android.content.Context;
import com.google.android.gms.common.util.C15333p;

/* renamed from: com.google.android.gms.common.d.a */
public final class C15173a {

    /* renamed from: a */
    private static Context f39248a;

    /* renamed from: b */
    private static Boolean f39249b;

    /* renamed from: a */
    public static synchronized boolean m44148a(Context context) {
        synchronized (C15173a.class) {
            Context applicationContext = context.getApplicationContext();
            if (f39248a == null || f39249b == null || f39248a != applicationContext) {
                f39249b = null;
                if (C15333p.m44603j()) {
                    f39249b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                        f39249b = Boolean.valueOf(true);
                    } catch (ClassNotFoundException unused) {
                        f39249b = Boolean.valueOf(false);
                    }
                }
                f39248a = applicationContext;
                boolean booleanValue = f39249b.booleanValue();
                return booleanValue;
            }
            boolean booleanValue2 = f39249b.booleanValue();
            return booleanValue2;
        }
    }
}
