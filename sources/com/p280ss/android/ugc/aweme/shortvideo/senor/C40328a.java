package com.p280ss.android.ugc.aweme.shortvideo.senor;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Build.VERSION;
import android.os.SystemClock;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.a */
public abstract class C40328a implements SensorEventListener {

    /* renamed from: a */
    public boolean f104736a;

    public C40328a(boolean z) {
        this.f104736a = z;
    }

    /* renamed from: a */
    protected static double m128808a(SensorEvent sensorEvent) {
        return m128809a(Long.valueOf(sensorEvent.timestamp));
    }

    /* renamed from: a */
    public static double m128809a(Long l) {
        long j;
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - l.longValue());
        if (VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - l.longValue());
        } else {
            j = Long.MAX_VALUE;
        }
        return (double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - l.longValue())));
    }
}
