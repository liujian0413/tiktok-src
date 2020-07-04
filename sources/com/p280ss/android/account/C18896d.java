package com.p280ss.android.account;

import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12712g;

/* renamed from: com.ss.android.account.d */
public abstract class C18896d extends C12706a<C12712g> {
    /* renamed from: a */
    public abstract void mo50255a(C12712g gVar);

    /* renamed from: a */
    public abstract void mo50256a(C12712g gVar, String str, String str2, String str3);

    /* renamed from: b */
    public abstract void mo50257b(C12712g gVar);

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void onResponse(C12712g gVar) {
        if (gVar.f33701a) {
            mo50257b(gVar);
        } else if (!gVar.mo31167a()) {
            mo50255a(gVar);
        } else if (gVar.f33714j != null) {
            mo50256a(gVar, gVar.f33712h, gVar.f33713i, gVar.f33714j);
        } else {
            mo50255a(gVar);
        }
    }
}
