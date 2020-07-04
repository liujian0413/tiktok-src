package com.p280ss.android.ugc.aweme.account.login.p952a;

import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21336m;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;

/* renamed from: com.ss.android.ugc.aweme.account.login.a.f */
public abstract class C21275f extends C21348y {
    /* renamed from: a */
    public abstract void mo57263a();

    /* renamed from: a */
    public abstract void mo57264a(int i);

    /* renamed from: a */
    public void mo57265a(int i, String str) {
    }

    /* renamed from: a */
    public abstract void mo57266a(C12710e<C12836s> eVar);

    /* renamed from: a */
    public abstract void mo57267a(String str, String str2);

    /* renamed from: b */
    public void mo57268b(int i) {
    }

    public void onSuccess(C12710e<C12836s> eVar) {
    }

    public C21275f(C21336m mVar) {
        super(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void onResponse(C12710e<C12836s> eVar) {
        if (eVar.f33701a) {
            mo57263a();
        } else if (needShowPicCaptcha(eVar)) {
            mo57267a(getCaptchaInfo(eVar), eVar.f33703c);
        } else if (eVar.f33702b == 1003 || eVar.f33702b == 1202) {
            mo57264a(eVar.f33702b);
        } else if (eVar.f33702b == 1001) {
            mo57265a(eVar.f33702b, eVar.f33703c);
        } else if (eVar.f33702b == 1105) {
            mo57268b(eVar.f33702b);
        } else {
            mo57266a(eVar);
        }
    }
}
