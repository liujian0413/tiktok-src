package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.senor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.senor.a */
public final class C38467a extends C40328a {

    /* renamed from: b */
    private C20749b f100031b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        double a = m128808a(sensorEvent);
        if (this.f104736a) {
            this.f100031b.mo56042a((double) sensorEvent.values[0], (double) sensorEvent.values[1], (double) sensorEvent.values[2], a);
        }
    }

    public C38467a(C20749b bVar, boolean z) {
        super(z);
        this.f100031b = bVar;
    }
}
