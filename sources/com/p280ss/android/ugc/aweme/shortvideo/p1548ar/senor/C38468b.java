package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.senor.b */
public final class C38468b extends C40328a {

    /* renamed from: b */
    private C20749b f100032b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f104736a) {
            this.f100032b.mo56093c((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], m128808a(sensorEvent));
        }
    }

    public C38468b(C20749b bVar, boolean z) {
        super(z);
        this.f100032b = bVar;
    }
}
