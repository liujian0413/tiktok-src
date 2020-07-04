package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C15231d.C15232a;

final class bvt implements C15232a {

    /* renamed from: a */
    private final /* synthetic */ bvq f43725a;

    bvt(bvq bvq) {
        this.f43725a = bvq;
    }

    /* renamed from: a */
    public final void mo38571a(Bundle bundle) {
        synchronized (this.f43725a.f43719b) {
            try {
                if (this.f43725a.f43720c != null) {
                    this.f43725a.f43722e = this.f43725a.f43720c.mo39918q();
                }
            } catch (DeadObjectException e) {
                acd.m45778b("Unable to obtain a cache service instance.", e);
                this.f43725a.m50172c();
            }
            this.f43725a.f43719b.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo38570a(int i) {
        synchronized (this.f43725a.f43719b) {
            this.f43725a.f43722e = null;
            this.f43725a.f43719b.notifyAll();
        }
    }
}
