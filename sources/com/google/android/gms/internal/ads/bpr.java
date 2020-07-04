package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

public final class bpr implements bpv, bpw {

    /* renamed from: a */
    private final Uri f43176a;

    /* renamed from: b */
    private final brf f43177b;

    /* renamed from: c */
    private final bng f43178c;

    /* renamed from: d */
    private final int f43179d = -1;

    /* renamed from: e */
    private final Handler f43180e;

    /* renamed from: f */
    private final bps f43181f;

    /* renamed from: g */
    private final blo f43182g;

    /* renamed from: h */
    private final int f43183h;

    /* renamed from: i */
    private bpw f43184i;

    /* renamed from: j */
    private blm f43185j;

    /* renamed from: k */
    private boolean f43186k;

    public bpr(Uri uri, brf brf, bng bng, int i, Handler handler, bps bps, String str, int i2) {
        this.f43176a = uri;
        this.f43177b = brf;
        this.f43178c = bng;
        this.f43180e = handler;
        this.f43181f = bps;
        this.f43183h = i2;
        this.f43182g = new blo();
    }

    /* renamed from: a */
    public final void mo41116a(bks bks, boolean z, bpw bpw) {
        this.f43184i = bpw;
        this.f43185j = new bqi(-9223372036854775807L, false);
        bpw.mo40874a(this.f43185j, null);
    }

    /* renamed from: a */
    public final bpt mo41114a(int i, brc brc) {
        brr.m49871a(i == 0);
        bpj bpj = new bpj(this.f43176a, this.f43177b.mo39631a(), this.f43178c.mo39632a(), this.f43179d, this.f43180e, this.f43181f, this, brc, null, this.f43183h);
        return bpj;
    }

    /* renamed from: a */
    public final void mo41117a(bpt bpt) {
        ((bpj) bpt).mo41097b();
    }

    /* renamed from: a */
    public final void mo41115a() {
        this.f43184i = null;
    }

    /* renamed from: a */
    public final void mo40874a(blm blm, Object obj) {
        boolean z = false;
        if (blm.mo40904a(0, this.f43182g, false).f42509c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f43186k || z) {
            this.f43185j = blm;
            this.f43186k = z;
            this.f43184i.mo40874a(this.f43185j, null);
        }
    }
}
