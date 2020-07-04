package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.common.util.w */
public final class C15340w {

    /* renamed from: a */
    private static final IntentFilter f39618a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b */
    private static long f39619b;

    /* renamed from: c */
    private static float f39620c = Float.NaN;

    /* renamed from: a */
    public static int m44627a(Context context) {
        int i;
        boolean z;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f39618a);
        int i2 = 0;
        if (registerReceiver == null) {
            i = 0;
        } else {
            i = registerReceiver.getIntExtra("plugged", 0);
        }
        int i3 = (i & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (C15333p.m44599f()) {
            z = powerManager.isInteractive();
        } else {
            z = powerManager.isScreenOn();
        }
        if (z) {
            i2 = 1;
        }
        return (i2 << 1) | i3;
    }

    /* renamed from: b */
    public static synchronized float m44628b(Context context) {
        synchronized (C15340w.class) {
            if (SystemClock.elapsedRealtime() - f39619b >= 60000 || Float.isNaN(f39620c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f39618a);
                if (registerReceiver != null) {
                    f39620c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f39619b = SystemClock.elapsedRealtime();
                float f = f39620c;
                return f;
            }
            float f2 = f39620c;
            return f2;
        }
    }
}
