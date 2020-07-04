package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12818a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12840a;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.c */
public abstract class C21326c extends C12840a {

    /* renamed from: a */
    private C21336m f57299a;

    /* renamed from: a */
    public abstract void mo57348a(C12710e<C12818a> eVar);

    public abstract void onSuccess(C12710e<C12818a> eVar);

    public C21326c(C21336m mVar) {
        this.f57299a = mVar;
    }

    public void onError(C12710e<C12818a> eVar, int i) {
        mo57348a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12818a> eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f57299a.mo57354a(str, eVar.f33703c, ((C12818a) eVar.f33709g).f33970r, new C21327d(this.f57299a, this, (C12818a) eVar.f33709g));
            return;
        }
        mo57348a(eVar);
    }
}
