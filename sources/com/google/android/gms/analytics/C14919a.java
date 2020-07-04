package com.google.android.gms.analytics;

import com.google.android.gms.internal.measurement.C16433bz;
import com.google.android.gms.internal.measurement.C16697t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.analytics.a */
public final class C14919a extends C14924c {

    /* renamed from: g */
    private static List<Runnable> f38585g = new ArrayList();

    /* renamed from: a */
    public boolean f38586a;

    /* renamed from: b */
    public volatile boolean f38587b;

    /* renamed from: h */
    private boolean f38588h;

    /* renamed from: i */
    private Set<Object> f38589i = new HashSet();

    /* renamed from: a */
    public final void mo37974a() {
        C16433bz f = this.f38593c.mo43221f();
        f.mo42571d();
        if (f.mo42572e()) {
            this.f38586a = f.mo42573f();
        }
        f.mo42571d();
        this.f38588h = true;
    }

    /* renamed from: b */
    public final boolean mo37975b() {
        return this.f38588h;
    }

    public C14919a(C16697t tVar) {
        super(tVar);
    }

    /* renamed from: c */
    public static void m43333c() {
        synchronized (C14919a.class) {
            if (f38585g != null) {
                for (Runnable run : f38585g) {
                    run.run();
                }
                f38585g = null;
            }
        }
    }
}
