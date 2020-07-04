package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12841b;
import com.p280ss.android.ugc.aweme.account.C21169e;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.f */
public abstract class C21329f extends C12841b {

    /* renamed from: a */
    private C21336m f57303a;

    /* renamed from: a */
    public abstract void mo57351a(C12710e<C12819b> eVar);

    public abstract void onSuccess(C12710e<C12819b> eVar);

    public C21329f(C21336m mVar) {
        this.f57303a = mVar;
    }

    public void onError(C12710e<C12819b> eVar, int i) {
        mo57351a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12819b> eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f57303a.mo57354a(str, eVar.f33703c, C21169e.f56924i, new C21330g(this.f57303a, this, (C12819b) eVar.f33709g));
            return;
        }
        mo57351a(eVar);
    }
}
