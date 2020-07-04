package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.stats.C16977a;

/* renamed from: com.google.android.gms.internal.measurement.bq */
public final class C16424bq {

    /* renamed from: a */
    static Object f45980a = new Object();

    /* renamed from: b */
    static C16977a f45981b;

    /* renamed from: c */
    private static Boolean f45982c;

    /* renamed from: a */
    public static boolean m53530a(Context context) {
        C15267r.m44384a(context);
        if (f45982c != null) {
            return f45982c.booleanValue();
        }
        boolean a = C16432by.m53552a(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        f45982c = Boolean.valueOf(a);
        return a;
    }

    /* renamed from: a */
    public static void m53529a(Context context, Intent intent) {
        C16416bi a = C16697t.m54864a(context).mo43216a();
        if (intent == null) {
            a.mo43200e("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        a.mo43187a("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean a2 = C16425br.m53533a(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (f45980a) {
                context.startService(intent2);
                if (a2) {
                    try {
                        if (f45981b == null) {
                            C16977a aVar = new C16977a(context, 1, "Analytics WakeLock");
                            f45981b = aVar;
                            aVar.mo44200a(false);
                        }
                        f45981b.mo44199a(1000);
                    } catch (SecurityException unused) {
                        a.mo43200e("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
