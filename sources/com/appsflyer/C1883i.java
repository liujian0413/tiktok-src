package com.appsflyer;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.appsflyer.i */
final class C1883i implements SensorEventListener {

    /* renamed from: ʽ */
    private double f6811;

    /* renamed from: ˊ */
    private final long[] f6812 = new long[2];

    /* renamed from: ˋ */
    private final String f6813;

    /* renamed from: ˎ */
    private final String f6814;

    /* renamed from: ˏ */
    private final int f6815;

    /* renamed from: ॱ */
    private final float[][] f6816 = new float[2][];

    /* renamed from: ॱॱ */
    private long f6817;

    /* renamed from: ᐝ */
    private final int f6818;

    public final int hashCode() {
        return this.f6818;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: ˊ */
    private void m8766() {
        for (int i = 0; i < 2; i++) {
            this.f6816[i] = null;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.f6812[i2] = 0;
        }
        this.f6811 = 0.0d;
        this.f6817 = 0;
    }

    /* renamed from: ˎ */
    private Map<String, Object> m8768() {
        HashMap hashMap = new HashMap(7);
        hashMap.put("sT", Integer.valueOf(this.f6815));
        hashMap.put("sN", this.f6814);
        hashMap.put("sV", this.f6813);
        float[] fArr = this.f6816[0];
        if (fArr != null) {
            hashMap.put("sVS", m8765(fArr));
        }
        float[] fArr2 = this.f6816[1];
        if (fArr2 != null) {
            hashMap.put("sVE", m8765(fArr2));
        }
        return hashMap;
    }

    /* renamed from: ˊ */
    public final void mo7485(Map<C1883i, Map<String, Object>> map) {
        m8769(map, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final void mo7486(Map<C1883i, Map<String, Object>> map) {
        m8769(map, true);
    }

    /* renamed from: ˊ */
    private static List<Float> m8765(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf : fArr) {
            arrayList.add(Float.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: ˎ */
    static C1883i m8767(Sensor sensor) {
        return new C1883i(sensor.getType(), sensor.getName(), sensor.getVendor());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1883i)) {
            return false;
        }
        C1883i iVar = (C1883i) obj;
        return m8771(iVar.f6815, iVar.f6814, iVar.f6813);
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        if (!(sensorEvent == null || sensorEvent.values == null)) {
            Sensor sensor = sensorEvent.sensor;
            if (sensor == null || sensor.getName() == null || sensor.getVendor() == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int type = sensorEvent.sensor.getType();
                String name = sensorEvent.sensor.getName();
                String vendor = sensorEvent.sensor.getVendor();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                if (m8771(type, name, vendor)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    float[] fArr2 = this.f6816[0];
                    if (fArr2 == null) {
                        this.f6816[0] = Arrays.copyOf(fArr, fArr.length);
                        this.f6812[0] = currentTimeMillis;
                        return;
                    }
                    float[] fArr3 = this.f6816[1];
                    if (fArr3 == null) {
                        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                        this.f6816[1] = copyOf;
                        this.f6812[1] = currentTimeMillis;
                        this.f6811 = m8770(fArr2, copyOf);
                    } else if (50000000 <= j - this.f6817) {
                        this.f6817 = j;
                        if (Arrays.equals(fArr3, fArr)) {
                            this.f6812[1] = currentTimeMillis;
                            return;
                        }
                        double r0 = m8770(fArr2, fArr);
                        if (r0 > this.f6811) {
                            this.f6816[1] = Arrays.copyOf(fArr, fArr.length);
                            this.f6812[1] = currentTimeMillis;
                            this.f6811 = r0;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ˏ */
    private static double m8770(float[] fArr, float[] fArr2) {
        double d = 0.0d;
        for (int i = 0; i < Math.min(fArr.length, fArr2.length); i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: ˎ */
    private void m8769(Map<C1883i, Map<String, Object>> map, boolean z) {
        boolean z2 = false;
        if (this.f6816[0] != null) {
            z2 = true;
        }
        if (z2) {
            map.put(this, m8768());
            if (z) {
                m8766();
            }
        } else if (!map.containsKey(this)) {
            map.put(this, m8768());
        }
    }

    private C1883i(int i, String str, String str2) {
        this.f6815 = i;
        if (str == null) {
            str = "";
        }
        this.f6814 = str;
        if (str2 == null) {
            str2 = "";
        }
        this.f6813 = str2;
        this.f6818 = ((((i + 31) * 31) + this.f6814.hashCode()) * 31) + this.f6813.hashCode();
    }

    /* renamed from: ˏ */
    private boolean m8771(int i, String str, String str2) {
        if (this.f6815 != i || !this.f6814.equals(str) || !this.f6813.equals(str2)) {
            return false;
        }
        return true;
    }
}
