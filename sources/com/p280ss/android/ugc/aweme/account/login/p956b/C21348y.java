package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.y */
public abstract class C21348y extends C21335l {

    /* renamed from: a */
    private C21336m f57338a;

    /* renamed from: b */
    public abstract void mo57366b(C12710e<C12836s> eVar);

    /* renamed from: c */
    public void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
        mo57366b(eVar);
    }

    public void onSuccess(C12710e<C12836s> eVar) {
        super.onSuccess(eVar);
    }

    public C21348y(C21336m mVar) {
        this.f57338a = mVar;
    }

    public void onError(C12710e<C12836s> eVar, int i) {
        super.onError(eVar, i);
        mo57366b(eVar);
    }

    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo57366b(eVar);
            return;
        }
        this.f57338a.mo57354a(str, eVar.f33703c, ((C12836s) eVar.f33709g).f33970r, new C21349z(this.f57338a, this, (C12836s) eVar.f33709g));
    }
}
