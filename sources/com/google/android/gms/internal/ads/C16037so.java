package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.C15267r;
import java.util.concurrent.atomic.AtomicBoolean;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.so */
public abstract class C16037so implements adi<Void>, anq {

    /* renamed from: a */
    protected final Context f44967a;

    /* renamed from: b */
    protected final ami f44968b;

    /* renamed from: c */
    protected zzaxi f44969c;

    /* renamed from: d */
    private final C16043su f44970d;

    /* renamed from: e */
    private final abk f44971e;

    /* renamed from: f */
    private Runnable f44972f;

    /* renamed from: g */
    private final Object f44973g = new Object();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AtomicBoolean f44974h = new AtomicBoolean(true);

    protected C16037so(Context context, abk abk, ami ami, C16043su suVar) {
        this.f44967a = context;
        this.f44971e = abk;
        this.f44969c = this.f44971e.f39888b;
        this.f44968b = ami;
        this.f44970d = suVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41966a();

    /* renamed from: a */
    public final void mo37832a(boolean z) {
        acd.m45777b("WebView finished loading.");
        int i = 0;
        if (this.f44974h.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo41967a(i);
            acl.f40003a.removeCallbacks(this.f44972f);
        }
    }

    /* renamed from: b */
    public void mo39127b() {
        if (this.f44974h.getAndSet(false)) {
            this.f44968b.stopLoading();
            acv.m45591a(this.f44968b);
            mo41967a(-1);
            acl.f40003a.removeCallbacks(this.f44972f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41967a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.f44969c = new zzaxi(i2, this.f44969c.f45633j);
        }
        this.f44968b.mo39749q();
        C16043su suVar = this.f44970d;
        zzaxe zzaxe = this.f44971e.f39887a;
        abj abj = r1;
        C16043su suVar2 = suVar;
        abj abj2 = new abj(zzaxe.f45573c, this.f44968b, this.f44969c.f45626c, i, this.f44969c.f45628e, this.f44969c.f45632i, this.f44969c.f45634k, this.f44969c.f45633j, zzaxe.f45579i, this.f44969c.f45630g, null, null, null, null, null, this.f44969c.f45631h, this.f44971e.f39890d, this.f44969c.f45629f, this.f44971e.f39892f, this.f44969c.f45636m, this.f44969c.f45637n, this.f44971e.f39894h, null, this.f44969c.f45597A, this.f44969c.f45598B, this.f44969c.f45599C, this.f44969c.f45600D, this.f44969c.f45601E, null, this.f44969c.f45604H, this.f44969c.f45608L, this.f44971e.f39895i, this.f44971e.f39888b.f45611O, this.f44971e.f39896j, this.f44971e.f39888b.f45613Q, this.f44969c.f45614R, this.f44971e.f39888b.f45615S, this.f44971e.f39888b.f45616T, this.f44971e.f39888b.f45618V, this.f44971e.f39888b.f45619W);
        suVar2.mo37611b(abj);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo39128c() {
        C15267r.m44393b("Webview render task needs to be called on UI thread.");
        this.f44972f = new C16038sp(this);
        acl.f40003a.postDelayed(this.f44972f, ((Long) bym.m50299d().mo41272a(C15585bw.f43848bp)).longValue());
        mo41966a();
        return null;
    }
}
