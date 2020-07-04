package com.p280ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.p280ss.android.ugc.aweme.p307au.C6887b;

/* renamed from: com.ss.android.ugc.aweme.common.l */
public final class C25701l implements SensorEventListener {

    /* renamed from: b */
    public static float f67635b = 6.0f;

    /* renamed from: a */
    public boolean f67636a = true;

    /* renamed from: c */
    C25703b f67637c;

    /* renamed from: d */
    SensorManager f67638d;

    /* renamed from: e */
    Sensor f67639e;

    /* renamed from: f */
    public boolean f67640f;

    /* renamed from: g */
    private float f67641g;

    /* renamed from: h */
    private float f67642h;

    /* renamed from: i */
    private float f67643i;

    /* renamed from: j */
    private long f67644j;

    /* renamed from: k */
    private long f67645k;

    /* renamed from: l */
    private C25702a f67646l;

    /* renamed from: com.ss.android.ugc.aweme.common.l$a */
    public interface C25702a {
        /* renamed from: a */
        void mo66561a();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.l$b */
    static class C25703b {

        /* renamed from: a */
        int f67647a;

        /* renamed from: b */
        final float[] f67648b = new float[this.f67650d];

        /* renamed from: c */
        final long[] f67649c = new long[this.f67650d];

        /* renamed from: d */
        int f67650d = 20;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66598a() {
            this.f67647a = 0;
            for (int i = 0; i < this.f67650d; i++) {
                this.f67649c[i] = 0;
            }
        }

        C25703b(int i) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo66600a(long j) {
            boolean z;
            int i = this.f67647a;
            long j2 = 0;
            long j3 = 0;
            int i2 = 0;
            boolean z2 = true;
            for (int i3 = 0; i3 < this.f67650d; i3++) {
                i--;
                if (i < 0) {
                    i = this.f67650d - 1;
                }
                long j4 = this.f67649c[i];
                if (j4 <= 0 || j - j4 > 2000) {
                    return false;
                }
                if (j2 > 0 && j2 - j4 > 800) {
                    return false;
                }
                if (j3 > 0 && j3 - j4 > 500) {
                    return false;
                }
                float f = this.f67648b[i];
                if (Math.abs(f) >= C25701l.f67635b) {
                    if (f > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 == 0 || z != z2) {
                        i2++;
                        j2 = j4;
                    } else {
                        z = z2;
                    }
                    if (i2 >= 2) {
                        return true;
                    }
                    z2 = z;
                    j3 = j4;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66599a(float f, long j) {
            this.f67648b[this.f67647a] = f;
            this.f67649c[this.f67647a] = j;
            this.f67647a = (this.f67647a + 1) % this.f67650d;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: b */
    public final void mo66595b() {
        this.f67638d.unregisterListener(this);
        this.f67640f = false;
    }

    /* renamed from: a */
    public final void mo66594a() {
        this.f67644j = 0;
        this.f67637c.mo66598a();
        this.f67638d.registerListener(this, this.f67639e, 2);
        this.f67640f = true;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f67636a && sensorEvent.sensor != null && sensorEvent.sensor.getType() == 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f67644j > 50) {
                this.f67644j = currentTimeMillis;
                float f = sensorEvent.values[0];
                float f2 = sensorEvent.values[1];
                float f3 = sensorEvent.values[2];
                this.f67643i = this.f67642h;
                this.f67642h = (float) Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
                this.f67641g = (this.f67641g * 0.9f) + (this.f67642h - this.f67643i);
                this.f67637c.mo66599a(this.f67641g, currentTimeMillis);
                if (currentTimeMillis - this.f67645k >= 2000 && Math.abs(this.f67641g) > f67635b && this.f67637c.mo66600a(currentTimeMillis)) {
                    this.f67637c.mo66598a();
                    this.f67645k = currentTimeMillis;
                    if (this.f67646l != null) {
                        this.f67646l.mo66561a();
                    }
                }
            }
        }
    }

    public C25701l(Context context, C25702a aVar) {
        if (this.f67636a) {
            this.f67646l = aVar;
            this.f67638d = (SensorManager) context.getSystemService("sensor");
            this.f67639e = this.f67638d.getDefaultSensor(1);
            this.f67637c = new C25703b(20);
        }
        f67635b = (float) C6887b.m21436b().mo16903b(context, "shake_threshold", 6);
    }
}
