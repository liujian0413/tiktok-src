package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;

public final class bsv {

    /* renamed from: a */
    private final Handler f43476a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final bsu f43477b;

    public bsv(Handler handler, bsu bsu) {
        this.f43476a = bsu != null ? (Handler) brr.m49869a(handler) : null;
        this.f43477b = bsu;
    }

    /* renamed from: a */
    public final void mo41264a(bmv bmv) {
        if (this.f43477b != null) {
            this.f43476a.post(new bsw(this, bmv));
        }
    }

    /* renamed from: a */
    public final void mo41266a(String str, long j, long j2) {
        if (this.f43477b != null) {
            Handler handler = this.f43476a;
            bsx bsx = new bsx(this, str, j, j2);
            handler.post(bsx);
        }
    }

    /* renamed from: a */
    public final void mo41265a(zzlg zzlg) {
        if (this.f43477b != null) {
            this.f43476a.post(new bsy(this, zzlg));
        }
    }

    /* renamed from: a */
    public final void mo41262a(int i, long j) {
        if (this.f43477b != null) {
            this.f43476a.post(new bsz(this, i, j));
        }
    }

    /* renamed from: a */
    public final void mo41261a(int i, int i2, int i3, float f) {
        if (this.f43477b != null) {
            Handler handler = this.f43476a;
            bta bta = new bta(this, i, i2, i3, f);
            handler.post(bta);
        }
    }

    /* renamed from: a */
    public final void mo41263a(Surface surface) {
        if (this.f43477b != null) {
            this.f43476a.post(new btb(this, surface));
        }
    }

    /* renamed from: b */
    public final void mo41267b(bmv bmv) {
        if (this.f43477b != null) {
            this.f43476a.post(new btc(this, bmv));
        }
    }
}
