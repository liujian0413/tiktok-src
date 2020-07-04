package com.google.android.gms.internal.ads;

import android.os.Handler;

public final class blu {

    /* renamed from: a */
    private final Handler f42533a = null;

    /* renamed from: b */
    private final blt f42534b = null;

    public blu(Handler handler, blt blt) {
    }

    /* renamed from: a */
    public final void mo40927a(bmv bmv) {
        if (this.f42534b != null) {
            this.f42533a.post(new blw(this, bmv));
        }
    }

    /* renamed from: a */
    public final void mo40929a(String str, long j, long j2) {
        if (this.f42534b != null) {
            Handler handler = this.f42533a;
            blx blx = new blx(this, str, j, j2);
            handler.post(blx);
        }
    }

    /* renamed from: a */
    public final void mo40928a(zzlg zzlg) {
        if (this.f42534b != null) {
            this.f42533a.post(new bly(this, zzlg));
        }
    }

    /* renamed from: a */
    public final void mo40926a(int i, long j, long j2) {
        if (this.f42534b != null) {
            Handler handler = this.f42533a;
            blz blz = new blz(this, i, j, j2);
            handler.post(blz);
        }
    }

    /* renamed from: b */
    public final void mo40930b(bmv bmv) {
        if (this.f42534b != null) {
            this.f42533a.post(new bma(this, bmv));
        }
    }

    /* renamed from: a */
    public final void mo40925a(int i) {
        if (this.f42534b != null) {
            this.f42533a.post(new bmb(this, i));
        }
    }
}
