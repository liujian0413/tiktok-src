package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.internal.C15267r;

@C6505uv
public final class aib {

    /* renamed from: a */
    private final Context f40267a;

    /* renamed from: b */
    private final aik f40268b;

    /* renamed from: c */
    private final ViewGroup f40269c;

    /* renamed from: d */
    private ahv f40270d;

    public aib(Context context, ViewGroup viewGroup, ami ami) {
        this(context, viewGroup, ami, null);
    }

    private aib(Context context, ViewGroup viewGroup, aik aik, ahv ahv) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f40267a = context;
        this.f40269c = viewGroup;
        this.f40268b = aik;
        this.f40270d = null;
    }

    /* renamed from: a */
    public final void mo39437a(int i, int i2, int i3, int i4) {
        C15267r.m44393b("The underlay may only be modified from the UI thread.");
        if (this.f40270d != null) {
            this.f40270d.mo39411a(i, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo39438a(int i, int i2, int i3, int i4, int i5, boolean z, aij aij) {
        if (this.f40270d == null) {
            C15593cd.m50346a(this.f40268b.mo39471j().f44224a, this.f40268b.mo39465c(), "vpr2");
            ahv ahv = new ahv(this.f40267a, this.f40268b, i5, z, this.f40268b.mo39471j().f44224a, aij);
            this.f40270d = ahv;
            this.f40269c.addView(this.f40270d, 0, new LayoutParams(-1, -1));
            int i6 = i;
            int i7 = i2;
            this.f40270d.mo39411a(i, i2, i3, i4);
            this.f40268b.mo39462a(false);
        }
    }

    /* renamed from: a */
    public final ahv mo39436a() {
        C15267r.m44393b("getAdVideoUnderlay must be called from the UI thread.");
        return this.f40270d;
    }

    /* renamed from: b */
    public final void mo39439b() {
        C15267r.m44393b("onPause must be called from the UI thread.");
        if (this.f40270d != null) {
            this.f40270d.mo39422i();
        }
    }

    /* renamed from: c */
    public final void mo39440c() {
        C15267r.m44393b("onDestroy must be called from the UI thread.");
        if (this.f40270d != null) {
            this.f40270d.mo39427n();
            this.f40269c.removeView(this.f40270d);
            this.f40270d = null;
        }
    }
}
