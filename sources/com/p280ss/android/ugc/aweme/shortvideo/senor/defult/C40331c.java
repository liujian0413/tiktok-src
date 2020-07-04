package com.p280ss.android.ugc.aweme.shortvideo.senor.defult;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.c */
public final class C40331c extends C40328a {

    /* renamed from: b */
    private C20707b f104742b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f104736a) {
            this.f104742b.mo55941a(sensorEvent.values, m128808a(sensorEvent));
        }
    }

    C40331c(C20707b bVar, boolean z) {
        super(z);
        this.f104742b = bVar;
    }
}
