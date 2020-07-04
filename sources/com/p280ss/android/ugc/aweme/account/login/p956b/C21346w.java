package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12835r;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12854o;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.w */
public abstract class C21346w extends C12854o {

    /* renamed from: a */
    private C21336m f57334a;

    /* renamed from: a */
    public abstract void mo57364a(C12710e<C12835r> eVar);

    public abstract void onSuccess(C12710e<C12835r> eVar);

    public C21346w(C21336m mVar) {
        this.f57334a = mVar;
    }

    public void onError(C12710e<C12835r> eVar, int i) {
        mo57364a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12835r> eVar, String str) {
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo57364a(eVar);
            return;
        }
        this.f57334a.mo57354a(str, eVar.f33703c, ((C12835r) eVar.f33709g).f33970r, new C21347x(this.f57334a, this, (C12835r) eVar.f33709g));
    }
}
