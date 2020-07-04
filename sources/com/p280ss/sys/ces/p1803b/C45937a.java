package com.p280ss.sys.ces.p1803b;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.p280ss.sys.ces.C45939c;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.sys.ces.b.a */
public final class C45937a implements SensorEventListener {

    /* renamed from: g */
    private static C45937a f117406g;

    /* renamed from: a */
    private SensorManager f117407a;

    /* renamed from: b */
    private int f117408b;

    /* renamed from: c */
    private int f117409c;

    /* renamed from: d */
    private float[] f117410d = new float[3];

    /* renamed from: e */
    private DecimalFormat f117411e = new DecimalFormat("0.0");

    /* renamed from: f */
    private List<String> f117412f = new ArrayList();

    private C45937a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.f117407a = (SensorManager) applicationContext.getSystemService("sensor");
        }
    }

    /* renamed from: a */
    public static C45937a m144071a(Context context) {
        if (f117406g == null) {
            synchronized (C45937a.class) {
                if (f117406g == null) {
                    f117406g = new C45937a(context);
                }
            }
        }
        return f117406g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m144072c() {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.SensorManager r0 = r4.f117407a     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            int r0 = r4.f117408b     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            r1 = 1
            if (r0 != 0) goto L_0x001b
            android.hardware.SensorManager r0 = r4.f117407a     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            android.hardware.SensorManager r2 = r4.f117407a     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            r3 = 3
            boolean r0 = r2.registerListener(r4, r0, r3)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            if (r0 != 0) goto L_0x001b
            monitor-exit(r4)
            return
        L_0x001b:
            int r0 = r4.f117408b     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
            int r0 = r0 + r1
            r4.f117408b = r0     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
        L_0x0020:
            monitor-exit(r4)
            return
        L_0x0022:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0025:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.p1803b.C45937a.m144072c():void");
    }

    /* renamed from: d */
    private synchronized void m144073d() {
        try {
            if (this.f117407a != null) {
                this.f117408b--;
                if (this.f117408b == 0) {
                    this.f117407a.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private String m144074e() {
        StringBuilder sb;
        DecimalFormat decimalFormat;
        float f;
        if (C45939c.m144089h() != 1) {
            return null;
        }
        m144072c();
        try {
            synchronized (this) {
                int i = 0;
                while (this.f117409c == 0 && i < 10) {
                    i++;
                    wait(1000);
                }
            }
            sb = new StringBuilder();
            sb.append(this.f117411e.format((double) this.f117410d[0]));
            sb.append(", ");
            sb.append(this.f117411e.format((double) this.f117410d[1]));
            sb.append(", ");
            decimalFormat = this.f117411e;
            f = this.f117410d[2];
        } catch (Exception unused) {
            sb = new StringBuilder();
            sb.append(this.f117411e.format((double) this.f117410d[0]));
            sb.append(", ");
            sb.append(this.f117411e.format((double) this.f117410d[1]));
            sb.append(", ");
            decimalFormat = this.f117411e;
            f = this.f117410d[2];
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f117411e.format((double) this.f117410d[0]));
            sb2.append(", ");
            sb2.append(this.f117411e.format((double) this.f117410d[1]));
            sb2.append(", ");
            sb2.append(this.f117411e.format((double) this.f117410d[2]));
            m144073d();
            this.f117409c = 0;
            throw th;
        }
        sb.append(decimalFormat.format((double) f));
        String sb3 = sb.toString();
        m144073d();
        this.f117409c = 0;
        return sb3;
    }

    /* renamed from: a */
    public final void mo111215a() {
        String e = m144074e();
        if (e != null) {
            this.f117412f.add(e);
            try {
                int size = this.f117412f.size();
                if (size > 20) {
                    ArrayList arrayList = new ArrayList(this.f117412f.subList(size - 10, size));
                    this.f117412f.clear();
                    this.f117412f = arrayList;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final synchronized String mo111216b() {
        String str;
        str = "";
        int size = this.f117412f.size();
        if (size <= 0) {
            return str;
        }
        if (size == 1) {
            return (String) this.f117412f.get(0);
        }
        try {
            List<String> list = this.f117412f;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List subList = list.subList(i, size);
            String str2 = str;
            int i2 = 0;
            while (i2 < subList.size()) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append((String) subList.get(i2));
                    sb.append("|");
                    i2++;
                    str2 = sb.toString();
                } catch (Throwable unused) {
                    str = str2;
                }
            }
            str = str2.substring(0, str2.length() - 1);
        } catch (Throwable unused2) {
        }
        return str;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f117410d = sensorEvent.values;
        this.f117409c = 1;
    }
}
