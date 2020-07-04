package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

final class bpo implements brp {

    /* renamed from: a */
    private final Uri f43161a;

    /* renamed from: b */
    private final bre f43162b;

    /* renamed from: c */
    private final bpp f43163c;

    /* renamed from: d */
    private final brt f43164d;

    /* renamed from: e */
    private final bnj f43165e = new bnj();

    /* renamed from: f */
    private volatile boolean f43166f;

    /* renamed from: g */
    private boolean f43167g = true;

    /* renamed from: h */
    private long f43168h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f43169i = -1;

    /* renamed from: j */
    private final /* synthetic */ bpj f43170j;

    public bpo(bpj bpj, Uri uri, bre bre, bpp bpp, brt brt) {
        this.f43170j = bpj;
        this.f43161a = (Uri) brr.m49869a(uri);
        this.f43162b = (bre) brr.m49869a(bre);
        this.f43163c = (bpp) brr.m49869a(bpp);
        this.f43164d = brt;
    }

    /* renamed from: a */
    public final void mo41106a(long j, long j2) {
        this.f43165e.f42733a = j;
        this.f43168h = j2;
        this.f43167g = true;
    }

    /* renamed from: a */
    public final void mo41105a() {
        this.f43166f = true;
    }

    /* renamed from: b */
    public final boolean mo41107b() {
        return this.f43166f;
    }

    /* renamed from: c */
    public final void mo41108c() throws IOException, InterruptedException {
        bnc bnc;
        int i = 0;
        while (i == 0 && !this.f43166f) {
            try {
                long j = this.f43165e.f42733a;
                bre bre = this.f43162b;
                brg brg = new brg(this.f43161a, j, -1, this.f43170j.f43136h);
                this.f43169i = bre.mo39589a(brg);
                if (this.f43169i != -1) {
                    this.f43169i += j;
                }
                bnc = new bnc(this.f43162b, j, this.f43169i);
                try {
                    bnd a = this.f43163c.mo41109a(bnc, this.f43162b.mo39590a());
                    if (this.f43167g) {
                        a.mo41014a(j, this.f43168h);
                        this.f43167g = false;
                    }
                    while (i == 0 && !this.f43166f) {
                        this.f43164d.mo41212c();
                        int a2 = a.mo41013a((bne) bnc, this.f43165e);
                        try {
                            if (bnc.mo41007b() > this.f43170j.f43137i + j) {
                                j = bnc.mo41007b();
                                this.f43164d.mo41211b();
                                this.f43170j.f43143o.post(this.f43170j.f43142n);
                            }
                            i = a2;
                        } catch (Throwable th) {
                            th = th;
                            i = a2;
                            if (!(i == 1 || bnc == null)) {
                                this.f43165e.f42733a = bnc.mo41007b();
                            }
                            bsf.m49939a(this.f43162b);
                            throw th;
                        }
                    }
                    if (i == 1) {
                        i = 0;
                    } else {
                        this.f43165e.f42733a = bnc.mo41007b();
                    }
                    bsf.m49939a(this.f43162b);
                } catch (Throwable th2) {
                    th = th2;
                    this.f43165e.f42733a = bnc.mo41007b();
                    bsf.m49939a(this.f43162b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bnc = null;
                this.f43165e.f42733a = bnc.mo41007b();
                bsf.m49939a(this.f43162b);
                throw th;
            }
        }
    }
}
