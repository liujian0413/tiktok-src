package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12834q;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12853n;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.u */
public abstract class C21344u extends C12853n {

    /* renamed from: a */
    private C21336m f57330a;

    /* renamed from: a */
    public abstract void mo57362a(int i, String str);

    /* renamed from: a */
    public void mo57363a(String str) {
    }

    public C21344u(C21336m mVar) {
        this.f57330a = mVar;
    }

    public void onError(C12710e<C12834q> eVar, int i) {
        if (i == 1202 || i != 1011) {
            mo57362a(i, eVar.f33703c);
        } else {
            mo57363a("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12834q> eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f57330a.mo57354a(str, eVar.f33703c, ((C12834q) eVar.f33709g).f33970r, new C21345v(this.f57330a, (C12834q) eVar.f33709g, this));
            return;
        }
        onError(eVar, eVar.f33702b);
    }
}
