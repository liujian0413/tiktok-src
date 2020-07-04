package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12842c;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.h */
public abstract class C21331h extends C12842c {

    /* renamed from: a */
    private C21336m f57308a;

    /* renamed from: a */
    public abstract void mo57352a(C12710e<C12820c> eVar);

    public abstract void onSuccess(C12710e<C12820c> eVar);

    public C21331h(C21336m mVar) {
        this.f57308a = mVar;
    }

    public void onError(C12710e<C12820c> eVar, int i) {
        mo57352a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12820c> eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f57308a.mo57354a(str, eVar.f33703c, ((C12820c) eVar.f33709g).f33970r, new C21332i(this.f57308a, this, (C12820c) eVar.f33709g));
            return;
        }
        mo57352a(eVar);
    }
}
