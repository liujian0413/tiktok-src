package com.p280ss.android.ugc.aweme.shortvideo.senor.defult;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.aweme.shortvideo.senor.C40328a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.defult.b */
public final class C40330b extends C40328a {

    /* renamed from: b */
    private C20707b f104741b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i;
        float f = sensorEvent.values[0];
        float f2 = sensorEvent.values[1];
        float[] fArr = sensorEvent.values;
        if (f2 > 0.0f && Math.abs(f) < f2) {
            i = 0;
        } else if (f > 0.0f && Math.abs(f2) < f) {
            i = 270;
        } else if (f2 >= 0.0f || Math.abs(f) >= (-f2)) {
            i = 90;
        } else {
            i = NormalGiftView.ALPHA_180;
        }
        if (TextUtils.equals(Build.MODEL, "vivo X9")) {
            i = 0;
        }
        if (this.f104736a) {
            this.f104741b.mo55929a(0.0f, 0.0f, (float) i);
        }
    }

    C40330b(C20707b bVar, boolean z) {
        super(z);
        this.f104741b = bVar;
    }
}
