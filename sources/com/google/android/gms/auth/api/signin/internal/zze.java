package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.support.p022v4.content.AsyncTaskLoader;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.internal.C15144k;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class zze extends AsyncTaskLoader<Void> implements C15144k {

    /* renamed from: f */
    private Semaphore f38843f = new Semaphore(0);

    /* renamed from: g */
    private Set<C15037d> f38844g;

    public zze(Context context, Set<C15037d> set) {
        super(context);
        this.f38844g = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Void mo2782d() {
        int i = 0;
        for (C15037d a : this.f38844g) {
            if (a.mo38238a((C15144k) this)) {
                i++;
            }
        }
        try {
            this.f38843f.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* renamed from: i */
    public final void mo2792i() {
        this.f38843f.drainPermits();
        mo2825n();
    }

    /* renamed from: h */
    public final void mo38146h() {
        this.f38843f.release();
    }
}
