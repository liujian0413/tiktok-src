package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.senor.d */
public final class C38470d extends C40328a {

    /* renamed from: b */
    private SensorManager f100034b;

    /* renamed from: c */
    private final C20749b f100035c;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        double a = m128808a(sensorEvent);
        if (this.f104736a) {
            float[] fArr = new float[9];
            if (this.f100034b != null) {
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
            }
            double[] dArr = new double[9];
            for (int i = 0; i < 9; i++) {
                dArr[i] = (double) fArr[i];
            }
            this.f100035c.mo56074a(dArr, a);
        }
    }

    public C38470d(SensorManager sensorManager, C20749b bVar, boolean z) {
        super(z);
        this.f100035c = bVar;
        this.f100034b = sensorManager;
    }
}
