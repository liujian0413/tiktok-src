package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C15340w;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.d */
public final class C15310d {

    /* renamed from: a */
    private static C15310d f39578a = new C15310d();

    /* renamed from: b */
    private static Boolean f39579b;

    /* renamed from: c */
    private static boolean f39580c = false;

    /* renamed from: a */
    public static C15310d m44545a() {
        return f39578a;
    }

    /* renamed from: a */
    public final void mo38677a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list) {
        m44546a(context, str, 8, str2, str3, null, i2, list, 0);
    }

    /* renamed from: a */
    public static void m44546a(Context context, String str, int i, String str2, String str3, String str4, int i2, List<String> list, long j) {
        int i3 = i;
        List<String> list2 = list;
        if (f39579b == null) {
            f39579b = Boolean.valueOf(false);
        }
        if (f39579b.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                String str5 = "missing wakeLock key. ";
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str5.concat(valueOf);
                } else {
                    new String(str5);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (7 == i3 || 8 == i3 || 10 == i3 || 11 == i3) {
                    if (list2 != null && list.size() == 1 && "com.google.android.gms".equals(list2.get(0))) {
                        list2 = null;
                    }
                    List<String> list3 = list2;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int a = C15340w.m44627a(context);
                    String packageName = context.getPackageName();
                    WakeLockEvent wakeLockEvent = r1;
                    WakeLockEvent wakeLockEvent2 = new WakeLockEvent(currentTimeMillis, i, str2, i2, list3, str, elapsedRealtime, a, str3, "com.google.android.gms".equals(packageName) ? null : packageName, C15340w.m44628b(context), j, str4);
                    try {
                        context.startService(new Intent().setComponent(C15308b.f39569a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
                    } catch (Exception e) {
                        Log.wtf("WakeLockTracker", e);
                    }
                }
            }
        }
    }
}
