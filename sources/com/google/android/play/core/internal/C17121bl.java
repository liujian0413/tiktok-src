package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.play.core.internal.bl */
final class C17121bl extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ IBinder f47833b;

    /* renamed from: c */
    private final /* synthetic */ C17118bi f47834c;

    C17121bl(C17118bi biVar, IBinder iBinder) {
        this.f47834c = biVar;
        this.f47833b = iBinder;
    }

    /* renamed from: a */
    public final void mo44331a() {
        this.f47834c.f47831a.f47815a = (IInterface) this.f47834c.f47831a.f47822i.mo44328a(this.f47833b);
        this.f47834c.f47831a.m56742d();
        this.f47834c.f47831a.f47820g = false;
        for (Runnable run : this.f47834c.f47831a.f47819f) {
            run.run();
        }
        this.f47834c.f47831a.f47819f.clear();
    }
}
