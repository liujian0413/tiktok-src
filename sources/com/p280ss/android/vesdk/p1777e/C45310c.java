package com.p280ss.android.vesdk.p1777e;

import android.view.Surface;
import com.p280ss.android.vesdk.C45247a;

/* renamed from: com.ss.android.vesdk.e.c */
public class C45310c implements C45311d {

    /* renamed from: a */
    private C45247a<C45311d> f116621a;

    /* renamed from: c */
    public int f116622c;

    /* renamed from: d */
    public int f116623d;

    /* renamed from: e */
    public Surface f116624e;

    /* renamed from: f */
    public boolean f116625f;

    /* renamed from: a */
    public final boolean mo108390a(C45311d dVar) {
        return this.f116621a.mo108184a(dVar);
    }

    /* renamed from: b */
    public final boolean mo108391b(C45311d dVar) {
        return this.f116621a.mo108186b(dVar);
    }

    /* renamed from: a */
    public final void mo108235a(Surface surface) {
        this.f116624e = surface;
        this.f116625f = false;
        for (C45311d a : this.f116621a.mo108185b()) {
            a.mo108235a(surface);
        }
    }

    /* renamed from: b */
    public final void mo108264b(Surface surface) {
        for (C45311d b : this.f116621a.mo108185b()) {
            b.mo108264b(surface);
        }
    }

    /* renamed from: a */
    public final void mo108236a(Surface surface, int i, int i2, int i3) {
        if (this.f116622c == i3 && this.f116623d == i3 && surface == this.f116624e) {
            this.f116625f = false;
        } else {
            this.f116625f = true;
            this.f116622c = i2;
            this.f116623d = i3;
        }
        for (C45311d a : this.f116621a.mo108185b()) {
            a.mo108236a(surface, i, i2, i3);
        }
    }
}
