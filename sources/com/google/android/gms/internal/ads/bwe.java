package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.C15231d.C15232a;

final class bwe implements C15232a {

    /* renamed from: a */
    final /* synthetic */ bwc f44042a;

    /* renamed from: b */
    private final /* synthetic */ zzwr f44043b;

    /* renamed from: c */
    private final /* synthetic */ agu f44044c;

    bwe(bwc bwc, zzwr zzwr, agu agu) {
        this.f44042a = bwc;
        this.f44043b = zzwr;
        this.f44044c = agu;
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
    }

    /* renamed from: a */
    public final void mo38571a(Bundle bundle) {
        synchronized (this.f44042a.f44040d) {
            if (!this.f44042a.f44038b) {
                this.f44042a.f44038b = true;
                bvw d = this.f44042a.f44037a;
                if (d != null) {
                    this.f44044c.mo39308a(new bwh(this.f44044c, acj.m45508a((Runnable) new bwg(this, d, this.f44043b, this.f44044c))), ago.f40190b);
                }
            }
        }
    }
}
