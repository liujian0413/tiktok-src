package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15231d.C15233b;

final class bvu implements C15233b {

    /* renamed from: a */
    private final /* synthetic */ bvq f43726a;

    bvu(bvq bvq) {
        this.f43726a = bvq;
    }

    /* renamed from: a */
    public final void mo38572a(ConnectionResult connectionResult) {
        synchronized (this.f43726a.f43719b) {
            this.f43726a.f43722e = null;
            if (this.f43726a.f43720c != null) {
                this.f43726a.f43720c = null;
            }
            this.f43726a.f43719b.notifyAll();
        }
    }
}
