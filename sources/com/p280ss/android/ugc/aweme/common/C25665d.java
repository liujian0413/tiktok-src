package com.p280ss.android.ugc.aweme.common;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C25701l.C25702a;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.common.d */
public final class C25665d implements SensorEventListener {

    /* renamed from: g */
    public static float f67588g = C25656c.m84375a();

    /* renamed from: h */
    public static int f67589h = 3;

    /* renamed from: i */
    public static final C25666a f67590i = new C25666a(null);

    /* renamed from: a */
    public boolean f67591a = true;

    /* renamed from: b */
    public final SensorManager f67592b;

    /* renamed from: c */
    public final C25667b f67593c;

    /* renamed from: d */
    public C25701l f67594d;

    /* renamed from: e */
    public boolean f67595e;

    /* renamed from: f */
    public Context f67596f;

    /* renamed from: j */
    private Sensor f67597j;

    /* renamed from: k */
    private final Vibrator f67598k;

    /* renamed from: l */
    private long f67599l;

    /* renamed from: m */
    private long f67600m;

    /* renamed from: n */
    private final C25668c f67601n;

    /* renamed from: o */
    private float f67602o;

    /* renamed from: p */
    private float f67603p;

    /* renamed from: com.ss.android.ugc.aweme.common.d$a */
    public static final class C25666a {
        private C25666a() {
        }

        /* renamed from: a */
        public static float m84391a() {
            return C25665d.f67588g;
        }

        /* renamed from: b */
        public static int m84392b() {
            return C25665d.f67589h;
        }

        public /* synthetic */ C25666a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$b */
    public interface C25667b {
        /* renamed from: a */
        boolean mo66556a();

        /* renamed from: b */
        void mo66557b();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$c */
    public static final class C25668c {

        /* renamed from: a */
        private int f67604a;

        /* renamed from: b */
        private final float[] f67605b = new float[this.f67607d];

        /* renamed from: c */
        private final long[] f67606c = new long[this.f67607d];

        /* renamed from: d */
        private int f67607d = 20;

        /* renamed from: a */
        public final void mo66558a() {
            this.f67604a = 0;
            int i = this.f67607d;
            for (int i2 = 0; i2 < i; i2++) {
                this.f67606c[i2] = 0;
            }
        }

        /* renamed from: b */
        public final boolean mo66560b() {
            boolean z;
            int i = this.f67604a;
            int i2 = this.f67607d;
            int i3 = i;
            int i4 = 0;
            boolean z2 = true;
            for (int i5 = 0; i5 < i2; i5++) {
                i3--;
                if (i3 < 0) {
                    i3 = this.f67607d - 1;
                }
                if (this.f67606c[i3] <= 0) {
                    return false;
                }
                float f = this.f67605b[i3];
                if (Math.abs(f) >= C25666a.m84391a()) {
                    if (f > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i4 == 0 || z != z2) {
                        i4++;
                        z2 = z;
                    }
                    if (i4 >= C25666a.m84392b()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public C25668c(int i) {
        }

        /* renamed from: a */
        public final void mo66559a(float f, long j) {
            this.f67605b[this.f67604a] = f;
            this.f67606c[this.f67604a] = j;
            this.f67604a = (this.f67604a + 1) % this.f67607d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$d */
    static final class C25669d implements C25702a {

        /* renamed from: a */
        final /* synthetic */ C25665d f67608a;

        C25669d(C25665d dVar) {
            this.f67608a = dVar;
        }

        /* renamed from: a */
        public final void mo66561a() {
            C25667b bVar = this.f67608a.f67593c;
            if (bVar != null && bVar.mo66556a()) {
                this.f67608a.mo66553c();
            }
            C25665d.m84386a("shake");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.d$e */
    static final class C25670e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25665d f67609a;

        C25670e(C25665d dVar) {
            this.f67609a = dVar;
        }

        public final void run() {
            SensorManager sensorManager = this.f67609a.f67592b;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f67609a);
            }
            C25701l lVar = this.f67609a.f67594d;
            if (lVar != null) {
                lVar.mo66595b();
            }
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: b */
    public final void mo66552b() {
        if (this.f67597j != null) {
            C6726a.m20844b(new C25670e(this));
        }
    }

    /* renamed from: c */
    public final void mo66553c() {
        Vibrator vibrator = this.f67598k;
        if (vibrator != null) {
            vibrator.vibrate(500);
        }
    }

    /* renamed from: d */
    private final void m84387d() {
        if (this.f67594d == null && C25704m.m84461a()) {
            this.f67594d = new C25701l(this.f67596f, new C25669d(this));
        }
    }

    /* renamed from: a */
    public final void mo66551a() {
        if (this.f67597j != null) {
            SensorManager sensorManager = this.f67592b;
            if (sensorManager != null) {
                sensorManager.registerListener(this, this.f67597j, 2);
            }
            m84387d();
            C25701l lVar = this.f67594d;
            if (lVar != null) {
                lVar.mo66594a();
            }
        }
    }

    /* renamed from: a */
    public static void m84386a(String str) {
        C6907h.m21524a("triger_dou", (Map) new C22984d().mo59973a("enter_from", str).f60753a);
    }

    /* renamed from: a */
    private final void m84385a(SensorEvent sensorEvent) {
        float f = this.f67603p;
        float f2 = sensorEvent.values[0];
        float f3 = sensorEvent.values[1];
        float f4 = sensorEvent.values[2];
        Sensor sensor = sensorEvent.sensor;
        C7573i.m23582a((Object) sensor, "event.sensor");
        if (sensor.getType() == 4) {
            this.f67603p = f3;
            this.f67602o = (this.f67602o * 0.9f) + (this.f67603p - f);
            this.f67601n.mo66559a(this.f67602o, this.f67599l);
            return;
        }
        if ((Math.abs(f4) > 5.0f && Math.abs(f3) < 5.0f) || (Math.abs(f3) > 5.0f && Math.abs(f4) < 5.0f)) {
            this.f67603p = f2;
            this.f67602o = (this.f67602o * 0.9f) + (this.f67603p - f);
            this.f67601n.mo66559a(this.f67602o, this.f67599l);
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        m84387d();
        if (this.f67594d != null) {
            C25701l lVar = this.f67594d;
            if (lVar != null && !lVar.f67640f) {
                C25701l lVar2 = this.f67594d;
                if (lVar2 != null) {
                    lVar2.mo66594a();
                }
            }
        }
        C25701l lVar3 = this.f67594d;
        if (lVar3 != null) {
            lVar3.f67636a = this.f67591a;
        }
        if (sensorEvent != null && this.f67591a && System.currentTimeMillis() - this.f67599l > 50) {
            this.f67599l = System.currentTimeMillis();
            m84385a(sensorEvent);
            if (this.f67599l - this.f67600m >= 2000) {
                if (Math.abs(this.f67602o) > f67588g / 2.0f && (this.f67600m == 0 || this.f67595e)) {
                    C25667b bVar = this.f67593c;
                    if (bVar != null) {
                        bVar.mo66557b();
                    }
                    this.f67595e = false;
                    this.f67600m = 1;
                }
                if (Math.abs(this.f67602o) > f67588g && this.f67601n.mo66560b()) {
                    this.f67601n.mo66558a();
                    this.f67600m = this.f67599l;
                    C25667b bVar2 = this.f67593c;
                    if (bVar2 != null && bVar2.mo66556a()) {
                        mo66553c();
                    }
                    m84386a("dou");
                    this.f67595e = true;
                }
            }
        }
    }

    public C25665d(Context context, C25667b bVar) {
        C7573i.m23587b(context, "context");
        this.f67596f = context;
        this.f67593c = bVar;
        this.f67601n = new C25668c(20);
        Object systemService = this.f67596f.getSystemService("sensor");
        if (systemService != null) {
            this.f67592b = (SensorManager) systemService;
            if (C25656c.m84376a(this.f67596f)) {
                this.f67597j = this.f67592b.getDefaultSensor(4);
            } else {
                this.f67597j = this.f67592b.getDefaultSensor(1);
                f67588g = 3.0f;
                f67589h = 3;
            }
            Object systemService2 = this.f67596f.getSystemService("vibrator");
            if (systemService2 != null) {
                this.f67598k = (Vibrator) systemService2;
                m84387d();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
    }
}
