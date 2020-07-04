package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

final class bih implements bka {

    /* renamed from: a */
    private final Uri f42129a;

    /* renamed from: b */
    private final bjp f42130b;

    /* renamed from: c */
    private final bid f42131c;

    /* renamed from: d */
    private final bjr f42132d;

    /* renamed from: e */
    private final int f42133e;

    /* renamed from: f */
    private final bij f42134f = new bij();

    /* renamed from: g */
    private volatile boolean f42135g;

    /* renamed from: h */
    private boolean f42136h;

    public bih(Uri uri, bjp bjp, bid bid, bjr bjr, int i, long j) {
        this.f42129a = (Uri) bke.m49057a(uri);
        this.f42130b = (bjp) bke.m49057a(bjp);
        this.f42131c = (bid) bke.m49057a(bid);
        this.f42132d = (bjr) bke.m49057a(bjr);
        this.f42133e = i;
        this.f42134f.f42138a = j;
        this.f42136h = true;
    }

    /* renamed from: a */
    public final void mo40754a() {
        this.f42135g = true;
    }

    /* renamed from: b */
    public final boolean mo40755b() {
        return this.f42135g;
    }

    /* renamed from: c */
    public final void mo40756c() throws IOException, InterruptedException {
        if (this.f42136h) {
            this.f42131c.mo40745a();
            this.f42136h = false;
        }
        int i = 0;
        while (i == 0 && !this.f42135g) {
            bib bib = null;
            try {
                long j = this.f42134f.f42138a;
                bjp bjp = this.f42130b;
                bjq bjq = new bjq(this.f42129a, j, -1, null);
                long a = bjp.mo39543a(bjq);
                if (a != -1) {
                    a += j;
                }
                bib bib2 = new bib(this.f42130b, j, a);
                while (i == 0) {
                    try {
                        if (this.f42135g) {
                            break;
                        }
                        this.f42132d.mo40798b(this.f42133e);
                        i = this.f42131c.mo40744a(bib2, this.f42134f);
                    } catch (Throwable th) {
                        th = th;
                        bib = bib2;
                        if (!(i == 1 || bib == null)) {
                            this.f42134f.f42138a = bib.mo40730a();
                        }
                        this.f42130b.mo39544a();
                        throw th;
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    this.f42134f.f42138a = bib2.mo40730a();
                }
                this.f42130b.mo39544a();
            } catch (Throwable th2) {
                th = th2;
                this.f42134f.f42138a = bib.mo40730a();
                this.f42130b.mo39544a();
                throw th;
            }
        }
    }
}
