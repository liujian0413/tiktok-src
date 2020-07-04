package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.util.C15321d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public final class C15307a {

    /* renamed from: a */
    private static final Object f39562a = new Object();

    /* renamed from: b */
    private static volatile C15307a f39563b;

    /* renamed from: c */
    private static boolean f39564c = false;

    /* renamed from: d */
    private final List<String> f39565d = Collections.EMPTY_LIST;

    /* renamed from: e */
    private final List<String> f39566e = Collections.EMPTY_LIST;

    /* renamed from: f */
    private final List<String> f39567f = Collections.EMPTY_LIST;

    /* renamed from: g */
    private final List<String> f39568g = Collections.EMPTY_LIST;

    /* renamed from: a */
    public static C15307a m44540a() {
        if (f39563b == null) {
            synchronized (f39562a) {
                if (f39563b == null) {
                    f39563b = new C15307a();
                }
            }
        }
        return f39563b;
    }

    private C15307a() {
    }

    /* renamed from: a */
    public static boolean m44542a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        boolean z;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            z = C15321d.m44561a(context, component.getPackageName());
        }
        if (z) {
            return false;
        }
        return context.bindService(intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean mo38676a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return m44542a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public static void m44541a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }
}
