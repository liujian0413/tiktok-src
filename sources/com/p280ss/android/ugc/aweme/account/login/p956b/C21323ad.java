package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.ad */
public abstract class C21323ad extends C21335l {

    /* renamed from: a */
    private C21336m f57295a;

    /* renamed from: a */
    public abstract void mo57345a(C12710e<C12836s> eVar);

    public void onSuccess(C12710e<C12836s> eVar) {
        super.onSuccess(eVar);
    }

    public C21323ad(C21336m mVar) {
        this.f57295a = mVar;
    }

    public void onError(C12710e<C12836s> eVar, int i) {
        super.onError(eVar, i);
        mo57345a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo57345a(eVar);
            return;
        }
        this.f57295a.mo57354a(str, eVar.f33703c, ((C12836s) eVar.f33709g).f33970r, new C21322ac(this.f57295a, this, (C12836s) eVar.f33709g));
    }
}
