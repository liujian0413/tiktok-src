package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.jq */
final class C15796jq {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final List<C15823kq> f44531a = new ArrayList();

    C15796jq() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41680a(C15824kr krVar) {
        Handler handler = acl.f40003a;
        for (C15823kq kpVar : this.f44531a) {
            handler.post(new C15822kp(this, kpVar, krVar));
        }
        this.f44531a.clear();
    }
}
