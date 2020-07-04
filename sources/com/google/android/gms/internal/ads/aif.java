package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@C6505uv
final class aif implements SensorEventListener {

    /* renamed from: a */
    public aih f40275a;

    /* renamed from: b */
    private final SensorManager f40276b;

    /* renamed from: c */
    private final Object f40277c = new Object();

    /* renamed from: d */
    private final Display f40278d;

    /* renamed from: e */
    private final float[] f40279e = new float[9];

    /* renamed from: f */
    private final float[] f40280f = new float[9];

    /* renamed from: g */
    private float[] f40281g;

    /* renamed from: h */
    private Handler f40282h;

    aif(Context context) {
        this.f40276b = (SensorManager) context.getSystemService("sensor");
        this.f40278d = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39444a() {
        if (this.f40282h == null) {
            Sensor defaultSensor = this.f40276b.getDefaultSensor(11);
            if (defaultSensor == null) {
                acd.m45779c("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.f40282h = new apn(handlerThread.getLooper());
            if (!this.f40276b.registerListener(this, defaultSensor, 0, this.f40282h)) {
                acd.m45779c("SensorManager.registerListener failed.");
                mo39446b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo39446b() {
        if (this.f40282h != null) {
            this.f40276b.unregisterListener(this);
            this.f40282h.post(new aig(this));
            this.f40282h = null;
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f40277c) {
                if (this.f40281g == null) {
                    this.f40281g = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f40279e, fArr);
            switch (this.f40278d.getRotation()) {
                case 1:
                    SensorManager.remapCoordinateSystem(this.f40279e, 2, 129, this.f40280f);
                    break;
                case 2:
                    SensorManager.remapCoordinateSystem(this.f40279e, 129, 130, this.f40280f);
                    break;
                case 3:
                    SensorManager.remapCoordinateSystem(this.f40279e, 130, 1, this.f40280f);
                    break;
                default:
                    System.arraycopy(this.f40279e, 0, this.f40280f, 0, 9);
                    break;
            }
            m45970a(1, 3);
            m45970a(2, 6);
            m45970a(5, 7);
            synchronized (this.f40277c) {
                System.arraycopy(this.f40280f, 0, this.f40281g, 0, 9);
            }
            if (this.f40275a != null) {
                this.f40275a.mo39450a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo39445a(float[] fArr) {
        synchronized (this.f40277c) {
            if (this.f40281g == null) {
                return false;
            }
            System.arraycopy(this.f40281g, 0, fArr, 0, this.f40281g.length);
            return true;
        }
    }

    /* renamed from: a */
    private final void m45970a(int i, int i2) {
        float f = this.f40280f[i];
        float[] fArr = this.f40280f;
        fArr[i] = fArr[i2];
        this.f40280f[i2] = f;
    }
}
