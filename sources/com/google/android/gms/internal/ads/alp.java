package com.google.android.gms.internal.ads;

import android.net.Uri;

@C6505uv
public final class alp extends alt {

    /* renamed from: e */
    private final String f40602e;

    public alp(aik aik, String str) {
        super(aik);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final bho mo39672c(String str) {
        bjp bju = new bju(this.f40536a, this.f40537b);
        big big = new big(Uri.parse(str), ((Boolean) bym.m50299d().mo41272a(C15585bw.f43898cm)).booleanValue() ? new ajn(this.f40536a, bju, new alq(this)) : bju, "video/webm".equals(this.f40602e) ? new bjh() : new biv(), 2, ((Integer) bym.m50299d().mo41272a(C15585bw.f44029s)).intValue());
        return big;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39671a(boolean z, long j) {
        aik aik = (aik) this.f40538c.get();
        if (aik != null) {
            ago.f40189a.execute(new alr(aik, z, j));
        }
    }
}
