package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12831n;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12851l;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.s */
public abstract class C21342s extends C12851l {

    /* renamed from: a */
    private C21336m f57326a;

    /* renamed from: a */
    public abstract void mo57360a(int i, String str);

    /* renamed from: a */
    public void mo57361a(String str) {
    }

    public C21342s(C21336m mVar) {
        this.f57326a = mVar;
    }

    public void onError(C12710e<C12831n> eVar, int i) {
        if (i == 1202 || i != 1011) {
            mo57360a(i, eVar.f33703c);
        } else {
            mo57361a(((C12831n) eVar.f33709g).f33980d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12831n> eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f57326a.mo57354a(str, eVar.f33703c, ((C12831n) eVar.f33709g).f33970r, new C21343t(this.f57326a, (C12831n) eVar.f33709g, this));
            return;
        }
        onError(eVar, eVar.f33702b);
    }
}
