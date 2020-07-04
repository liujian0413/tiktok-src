package com.p280ss.android.ugc.aweme.account.login.authorize.p955a;

import com.bytedance.sdk.account.p645a.p646a.C12712g;
import com.p280ss.android.account.C18896d;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.a.b */
public final class C21306b extends C18896d {

    /* renamed from: a */
    private final WeakReference<C21305a> f57262a;

    public C21306b(C21305a aVar) {
        this.f57262a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo50255a(C12712g gVar) {
        if (this.f57262a.get() != null) {
            ((C21305a) this.f57262a.get()).mo57309a(gVar.f33702b, gVar.f33703c, gVar.f33713i, gVar.f33721q, gVar);
        }
    }

    /* renamed from: b */
    public final void mo50257b(C12712g gVar) {
        if (this.f57262a.get() != null) {
            ((C21305a) this.f57262a.get()).mo57310a(gVar.f33711g, gVar.f33711g.f34083f);
        }
    }

    /* renamed from: a */
    public final void mo50256a(C12712g gVar, String str, String str2, String str3) {
        if (this.f57262a.get() != null) {
            ((C21305a) this.f57262a.get()).mo57309a(gVar.f33702b, gVar.f33703c, str2, gVar.f33721q, gVar);
        }
    }
}
