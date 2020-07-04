package androidx.work.impl.p033a.p035b;

import android.content.Context;

/* renamed from: androidx.work.impl.a.b.g */
public final class C1487g {

    /* renamed from: e */
    private static C1487g f5701e;

    /* renamed from: a */
    public C1478a f5702a;

    /* renamed from: b */
    public C1479b f5703b;

    /* renamed from: c */
    public C1483e f5704c;

    /* renamed from: d */
    public C1486f f5705d;

    /* renamed from: a */
    public static synchronized C1487g m7418a(Context context) {
        C1487g gVar;
        synchronized (C1487g.class) {
            if (f5701e == null) {
                f5701e = new C1487g(context);
            }
            gVar = f5701e;
        }
        return gVar;
    }

    private C1487g(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f5702a = new C1478a(applicationContext);
        this.f5703b = new C1479b(applicationContext);
        this.f5704c = new C1483e(applicationContext);
        this.f5705d = new C1486f(applicationContext);
    }
}
