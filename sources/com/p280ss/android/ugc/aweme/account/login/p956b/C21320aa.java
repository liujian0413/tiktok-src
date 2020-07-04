package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p664b.C12878t.C12879a;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12856q;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.aa */
public abstract class C21320aa extends C12856q {

    /* renamed from: a */
    private C21336m f57286a;

    /* renamed from: b */
    private String f57287b;

    /* renamed from: c */
    private int f57288c;

    /* renamed from: a */
    public abstract void mo57342a(C12710e<C12879a> eVar);

    /* renamed from: b */
    public abstract void mo57343b(C12710e<C12879a> eVar);

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void onResponse(C12710e<C12879a> eVar) {
        if (eVar.f33701a) {
            mo57342a(eVar);
        } else if (!((C12879a) eVar.f33709g).mo31362d() || TextUtils.isEmpty(((C12879a) eVar.f33709g).f33962j)) {
            mo57343b(eVar);
        } else {
            this.f57286a.mo57354a(((C12879a) eVar.f33709g).f33962j, ((C12879a) eVar.f33709g).f33961i, this.f57288c, new C21321ab(this.f57286a, this.f57287b, this));
        }
    }

    public C21320aa(C21336m mVar, String str, int i) {
        this.f57286a = mVar;
        this.f57287b = str;
        this.f57288c = i;
    }
}
