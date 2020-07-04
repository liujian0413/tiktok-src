package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class bia implements C15465a {

    /* renamed from: a */
    private final Executor f42084a;

    public bia(Handler handler) {
        this.f42084a = new bjb(this, handler);
    }

    /* renamed from: a */
    public final void mo39017a(bqk<?> bqk, bwf<?> bwf) {
        mo39018a(bqk, bwf, null);
    }

    /* renamed from: a */
    public final void mo39018a(bqk<?> bqk, bwf<?> bwf, Runnable runnable) {
        bqk.mo41155e();
        bqk.mo41150b("post-response");
        this.f42084a.execute(new bjy(bqk, bwf, runnable));
    }

    /* renamed from: a */
    public final void mo39019a(bqk<?> bqk, zzae zzae) {
        bqk.mo41150b("post-error");
        this.f42084a.execute(new bjy(bqk, bwf.m50202a(zzae), null));
    }
}
