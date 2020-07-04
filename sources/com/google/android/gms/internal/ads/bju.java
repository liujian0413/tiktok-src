package com.google.android.gms.internal.ads;

import android.content.Context;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.io.IOException;

public final class bju implements bkc {

    /* renamed from: a */
    private final bkc f42352a;

    /* renamed from: b */
    private final bkc f42353b;

    /* renamed from: c */
    private final bkc f42354c;

    /* renamed from: d */
    private bkc f42355d;

    public bju(Context context, String str) {
        this(context, null, str, false);
    }

    private bju(Context context, bkb bkb, String str, boolean z) {
        bjs bjs = new bjs(str, null, null, 8000, 8000, false);
        this(context, null, bjs);
    }

    private bju(Context context, bkb bkb, bkc bkc) {
        this.f42352a = (bkc) bke.m49057a(bkc);
        this.f42353b = new bjv(null);
        this.f42354c = new bjn(context, null);
    }

    /* renamed from: a */
    public final long mo39543a(bjq bjq) throws IOException {
        bke.m49060b(this.f42355d == null);
        String scheme = bjq.f42325a.getScheme();
        if (WebKitApi.SCHEME_HTTP.equals(scheme) || WebKitApi.SCHEME_HTTPS.equals(scheme)) {
            this.f42355d = this.f42352a;
        } else if ("file".equals(scheme)) {
            if (bjq.f42325a.getPath().startsWith("/android_asset/")) {
                this.f42355d = this.f42354c;
            } else {
                this.f42355d = this.f42353b;
            }
        } else if ("asset".equals(scheme)) {
            this.f42355d = this.f42354c;
        } else {
            throw new zzjt(scheme);
        }
        return this.f42355d.mo39543a(bjq);
    }

    /* renamed from: a */
    public final int mo39542a(byte[] bArr, int i, int i2) throws IOException {
        return this.f42355d.mo39542a(bArr, i, i2);
    }

    /* renamed from: a */
    public final void mo39544a() throws IOException {
        if (this.f42355d != null) {
            try {
                this.f42355d.mo39544a();
            } finally {
                this.f42355d = null;
            }
        }
    }
}
