package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14772ad;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.tc */
public final class C16052tc extends abz {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16043su f45002a;

    /* renamed from: b */
    private final zzaxi f45003b;

    /* renamed from: c */
    private final abk f45004c;

    /* renamed from: d */
    private final C16055tf f45005d;

    /* renamed from: e */
    private final Object f45006e;

    /* renamed from: f */
    private Future<abj> f45007f;

    public C16052tc(Context context, C14772ad adVar, abk abk, bdt bdt, C16043su suVar, C15600ck ckVar) {
        C16055tf tfVar = new C16055tf(context, adVar, new aea(context), bdt, abk, ckVar);
        this(abk, suVar, tfVar);
    }

    private C16052tc(abk abk, C16043su suVar, C16055tf tfVar) {
        this.f45006e = new Object();
        this.f45004c = abk;
        this.f45003b = abk.f39888b;
        this.f45002a = suVar;
        this.f45005d = tfVar;
    }

    /* renamed from: a */
    public final void mo37835a() {
        int i;
        abj abj = null;
        try {
            synchronized (this.f45006e) {
                this.f45007f = acj.m45509a((Callable<T>) this.f45005d);
            }
            abj = (abj) this.f45007f.get(60000, TimeUnit.MILLISECONDS);
            i = -2;
        } catch (TimeoutException unused) {
            acd.m45783e("Timed out waiting for native ad.");
            this.f45007f.cancel(true);
            i = 2;
        } catch (InterruptedException | CancellationException | ExecutionException unused2) {
            i = 0;
        }
        acl.f40003a.post(new C16053td(this, abj != null ? abj : new abj(this.f45004c.f39887a.f45573c, null, null, i, null, null, this.f45003b.f45634k, this.f45003b.f45633j, this.f45004c.f39887a.f45579i, false, null, null, null, null, null, this.f45003b.f45631h, this.f45004c.f39890d, this.f45003b.f45629f, this.f45004c.f39892f, this.f45003b.f45636m, this.f45003b.f45637n, this.f45004c.f39894h, null, null, null, null, this.f45004c.f39888b.f45600D, this.f45004c.f39888b.f45601E, null, null, this.f45003b.f45608L, this.f45004c.f39895i, this.f45004c.f39888b.f45611O, false, this.f45004c.f39888b.f45613Q, null, this.f45004c.f39888b.f45615S, this.f45004c.f39888b.f45616T, this.f45004c.f39888b.f45618V, this.f45004c.f39888b.f45619W)));
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
        synchronized (this.f45006e) {
            if (this.f45007f != null) {
                this.f45007f.cancel(true);
            }
        }
    }
}
