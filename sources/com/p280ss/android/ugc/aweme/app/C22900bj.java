package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;

/* renamed from: com.ss.android.ugc.aweme.app.bj */
public final class C22900bj implements SensorEventListener {

    /* renamed from: b */
    public static volatile C22900bj f60618b;

    /* renamed from: c */
    public static final C22901a f60619c = new C22901a(null);

    /* renamed from: a */
    public C22878ar f60620a;

    /* renamed from: d */
    private final SensorManager f60621d;

    /* renamed from: e */
    private Sensor f60622e;

    /* renamed from: f */
    private Sensor f60623f;

    /* renamed from: g */
    private final float[] f60624g;

    /* renamed from: h */
    private final float[] f60625h;

    /* renamed from: i */
    private final float[] f60626i;

    /* renamed from: j */
    private float f60627j;

    /* renamed from: k */
    private float f60628k;

    /* renamed from: com.ss.android.ugc.aweme.app.bj$a */
    public static final class C22901a {
        private C22901a() {
        }

        /* renamed from: a */
        private static C22900bj m75362a() {
            return C22900bj.f60618b;
        }

        public /* synthetic */ C22901a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m75363a(C22900bj bjVar) {
            C22900bj.f60618b = bjVar;
        }

        /* renamed from: a */
        public final C22900bj mo59869a(Context context) {
            C7573i.m23587b(context, "context");
            if (m75362a() == null) {
                synchronized (C7575l.m23595a(C22900bj.class)) {
                    if (m75362a() == null) {
                        m75363a(new C22900bj(context, null));
                    }
                }
            }
            C22900bj a = m75362a();
            if (a == null) {
                C7573i.m23580a();
            }
            return a;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: b */
    public final void mo59866b() {
        if (this.f60620a != null) {
            SensorManager sensorManager = this.f60621d;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo59865a() {
        if (this.f60620a != null) {
            SensorManager sensorManager = this.f60621d;
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f60622e, 1);
            }
            SensorManager sensorManager2 = this.f60621d;
            if (sensorManager2 != null) {
                sensorManager2.registerListener(this, this.f60623f, 1);
            }
        }
    }

    private C22900bj(Context context) {
        this.f60624g = new float[3];
        this.f60625h = new float[3];
        this.f60626i = new float[9];
        Object systemService = context.getSystemService("sensor");
        if (systemService != null) {
            this.f60621d = (SensorManager) systemService;
            this.f60622e = this.f60621d.getDefaultSensor(1);
            this.f60623f = this.f60621d.getDefaultSensor(2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        C22878ar arVar = this.f60620a;
        if (arVar != null) {
            if (sensorEvent != null) {
                Sensor sensor = sensorEvent.sensor;
                if (sensor != null && sensor.getType() == 1) {
                    System.arraycopy(sensorEvent.values, 0, this.f60624g, 0, this.f60624g.length);
                }
            }
            if (sensorEvent != null) {
                Sensor sensor2 = sensorEvent.sensor;
                if (sensor2 != null && sensor2.getType() == 2) {
                    System.arraycopy(sensorEvent.values, 0, this.f60625h, 0, this.f60625h.length);
                }
            }
            if (SensorManager.getRotationMatrix(this.f60626i, null, this.f60624g, this.f60625h)) {
                float[] fArr = new float[3];
                SensorManager.getOrientation(this.f60626i, fArr);
                this.f60627j = (float) Math.toDegrees((double) fArr[0]);
                this.f60627j = (this.f60627j + 360.0f) % 360.0f;
                if (Math.abs(this.f60627j - this.f60628k) > 0.5f) {
                    arVar.mo59846a(this.f60627j);
                }
            }
        }
    }

    public /* synthetic */ C22900bj(Context context, C7571f fVar) {
        this(context);
    }
}
