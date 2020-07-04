package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.facebook.appevents.codeless.f */
final class C13143f implements SensorEventListener {

    /* renamed from: a */
    public C13144a f34815a;

    /* renamed from: com.facebook.appevents.codeless.f$a */
    public interface C13144a {
        /* renamed from: a */
        void mo32298a();
    }

    C13143f() {
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f34815a != null) {
            float f = sensorEvent.values[0];
            double d = (double) (f / 9.80665f);
            double d2 = (double) (sensorEvent.values[1] / 9.80665f);
            double d3 = (double) (sensorEvent.values[2] / 9.80665f);
            Double.isNaN(d);
            Double.isNaN(d);
            double d4 = d * d;
            Double.isNaN(d2);
            Double.isNaN(d2);
            double d5 = d4 + (d2 * d2);
            Double.isNaN(d3);
            Double.isNaN(d3);
            if (Math.sqrt(d5 + (d3 * d3)) > 2.299999952316284d) {
                this.f34815a.mo32298a();
            }
        }
    }
}
