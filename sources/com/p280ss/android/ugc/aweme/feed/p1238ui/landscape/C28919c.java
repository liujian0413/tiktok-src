package com.p280ss.android.ugc.aweme.feed.p1238ui.landscape;

import android.content.ContentResolver;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c */
public final class C28919c {

    /* renamed from: h */
    public static final C28920a f76232h = new C28920a(null);

    /* renamed from: a */
    public SensorManager f76233a;

    /* renamed from: b */
    public boolean f76234b;

    /* renamed from: c */
    public C28922c f76235c;

    /* renamed from: d */
    public int f76236d = -1;

    /* renamed from: e */
    public Sensor f76237e;

    /* renamed from: f */
    public boolean f76238f;

    /* renamed from: g */
    public final Context f76239g;

    /* renamed from: i */
    private int f76240i;

    /* renamed from: j */
    private boolean f76241j;

    /* renamed from: k */
    private Sensor f76242k;

    /* renamed from: l */
    private final Handler f76243l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private final C28921b f76244m;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$a */
    public static final class C28920a {
        private C28920a() {
        }

        public /* synthetic */ C28920a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$b */
    public interface C28921b {
        /* renamed from: a */
        C28130ac mo73465a();

        /* renamed from: b */
        Aweme mo73466b();

        /* renamed from: c */
        String mo73467c();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$c */
    public final class C28922c implements SensorEventListener {
        public final void onAccuracyChanged(Sensor sensor, int i) {
            C7573i.m23587b(sensor, "arg0");
        }

        public C28922c() {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            ContentResolver contentResolver;
            C7573i.m23587b(sensorEvent, "event");
            C28919c.this.f76238f = true;
            try {
                Context context = C28919c.this.f76239g;
                if (context != null) {
                    contentResolver = context.getContentResolver();
                } else {
                    contentResolver = null;
                }
                int i = System.getInt(contentResolver, "accelerometer_rotation");
                if (i == 0) {
                    if (C28919c.this.f76236d == 1) {
                        C28919c.this.f76234b = false;
                        C28919c.this.mo74211a(0);
                        C28919c.this.f76236d = i;
                    }
                    return;
                }
                C28919c.this.f76236d = i;
                float[] fArr = sensorEvent.values;
                int i2 = -1;
                float f = -fArr[0];
                float f2 = -fArr[1];
                float f3 = -fArr[2];
                if (((f * f) + (f2 * f2)) * 4.0f >= f3 * f3) {
                    int round = 90 - Math.round(((float) Math.atan2((double) (-f2), (double) f)) * 57.29578f);
                    while (round >= 360) {
                        round -= 360;
                    }
                    i2 = round;
                    while (i2 < 0) {
                        i2 += 360;
                    }
                }
                if (62 <= i2 && 134 >= i2) {
                    C28919c.this.mo74211a(2);
                    C28919c.this.f76234b = true;
                } else if (136 <= i2 && 224 >= i2) {
                    C28919c.this.mo74211a(3);
                    C28919c.this.f76234b = false;
                } else if (226 <= i2 && 298 >= i2) {
                    C28919c.this.mo74211a(1);
                    C28919c.this.f76234b = true;
                } else {
                    if ((300 <= i2 && 345 >= i2) || (1 <= i2 && 45 >= i2)) {
                        C28919c.this.mo74211a(0);
                        C28919c.this.f76234b = false;
                    }
                }
            } catch (SettingNotFoundException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.landscape.c$d */
    static final class C28923d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28919c f76246a;

        C28923d(C28919c cVar) {
            this.f76246a = cVar;
        }

        public final void run() {
            if (!this.f76246a.f76238f) {
                SensorManager sensorManager = this.f76246a.f76233a;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this.f76246a.f76235c);
                }
                if (this.f76246a.f76237e != null) {
                    SensorManager sensorManager2 = this.f76246a.f76233a;
                    if (sensorManager2 != null) {
                        sensorManager2.registerListener(this.f76246a.f76235c, this.f76246a.f76237e, 3);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo74212b() {
        if (this.f76241j) {
            this.f76241j = false;
            SensorManager sensorManager = this.f76233a;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f76235c);
            }
        }
    }

    /* renamed from: a */
    public final void mo74210a() {
        if (this.f76235c != null) {
            if (!(this.f76237e == null && this.f76242k == null) && !this.f76241j) {
                this.f76241j = true;
                this.f76238f = false;
                if (this.f76242k != null) {
                    SensorManager sensorManager = this.f76233a;
                    if (sensorManager != null) {
                        sensorManager.registerListener(this.f76235c, this.f76242k, 3);
                    }
                }
                this.f76243l.postDelayed(new C28923d(this), 1000);
            }
        }
    }

    /* renamed from: a */
    public final void mo74211a(int i) {
        C28130ac acVar;
        Aweme aweme;
        C28921b bVar = this.f76244m;
        String str = null;
        if (bVar != null) {
            acVar = bVar.mo73465a();
        } else {
            acVar = null;
        }
        if (C28478a.m93590e(acVar)) {
            C28921b bVar2 = this.f76244m;
            if (bVar2 != null) {
                aweme = bVar2.mo73466b();
            } else {
                aweme = null;
            }
            C28921b bVar3 = this.f76244m;
            if (bVar3 != null) {
                str = bVar3.mo73467c();
            }
            C42961az.m136380a(new C28918b(aweme, str, i));
            this.f76240i = i;
        }
    }

    public C28919c(Context context, C28921b bVar) {
        Sensor sensor;
        this.f76239g = context;
        this.f76244m = bVar;
        Context context2 = this.f76239g;
        if (context2 != null) {
            Object systemService = context2.getSystemService("sensor");
            if (systemService != null) {
                if (systemService != null) {
                    this.f76233a = (SensorManager) systemService;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
                }
            }
        }
        SensorManager sensorManager = this.f76233a;
        Sensor sensor2 = null;
        if (sensorManager != null) {
            sensor = sensorManager.getDefaultSensor(9);
        } else {
            sensor = null;
        }
        this.f76237e = sensor;
        SensorManager sensorManager2 = this.f76233a;
        if (sensorManager2 != null) {
            sensor2 = sensorManager2.getDefaultSensor(1);
        }
        this.f76242k = sensor2;
        this.f76235c = new C28922c();
    }
}
