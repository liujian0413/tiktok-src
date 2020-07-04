package com.google.android.gms.ads.internal.overlay;

import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abz;
import com.google.android.gms.internal.ads.acl;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.overlay.j */
final class C14843j extends abz {

    /* renamed from: a */
    final /* synthetic */ C14836c f38453a;

    private C14843j(C14836c cVar) {
        this.f38453a = cVar;
    }

    /* renamed from: u_ */
    public final void mo37836u_() {
    }

    /* renamed from: a */
    public final void mo37835a() {
        Bitmap a = C14793ay.m42910p().mo39260a(Integer.valueOf(this.f38453a.f38426b.f38422o.f38500e));
        if (a != null) {
            acl.f40003a.post(new C14844k(this, C14793ay.m42896b().mo39192a(this.f38453a.f38425a, a, this.f38453a.f38426b.f38422o.f38498c, this.f38453a.f38426b.f38422o.f38499d)));
        }
    }
}
