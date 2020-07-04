package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public final class abx {

    /* renamed from: a */
    public final String f39955a;

    /* renamed from: b */
    private final Object f39956b;

    /* renamed from: c */
    private int f39957c;

    /* renamed from: d */
    private int f39958d;

    /* renamed from: e */
    private final aby f39959e;

    public abx(String str) {
        this(C14793ay.m42898d().f39922b, str);
    }

    private abx(aby aby, String str) {
        this.f39956b = new Object();
        this.f39959e = aby;
        this.f39955a = str;
    }

    /* renamed from: a */
    public final void mo39115a(int i, int i2) {
        synchronized (this.f39956b) {
            this.f39957c = i;
            this.f39958d = i2;
            this.f39959e.mo39122a(this);
        }
    }

    /* renamed from: a */
    public final Bundle mo39114a() {
        Bundle bundle;
        synchronized (this.f39956b) {
            bundle = new Bundle();
            bundle.putInt("pmnli", this.f39957c);
            bundle.putInt("pmnll", this.f39958d);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        abx abx = (abx) obj;
        if (this.f39955a != null) {
            return this.f39955a.equals(abx.f39955a);
        }
        return abx.f39955a == null;
    }

    public final int hashCode() {
        if (this.f39955a != null) {
            return this.f39955a.hashCode();
        }
        return 0;
    }
}
