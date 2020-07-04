package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12832o;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12849j;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.util.C22345t;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.q */
public abstract class C21340q extends C12849j {

    /* renamed from: a */
    protected C21336m f57322a;

    /* renamed from: a */
    public void mo57260a(C12710e<C12832o> eVar) {
    }

    public C21340q(C21336m mVar) {
        this.f57322a = mVar;
    }

    public void onSuccess(C12710e<C12832o> eVar) {
        if (eVar.f33709g != null && ((C12832o) eVar.f33709g).f33985d != null) {
            C21671bd.m72526a(((C12832o) eVar.f33709g).mo31218b());
            C22345t.m73972e(true);
        }
    }

    public void onError(C12710e<C12832o> eVar, int i) {
        mo57260a(eVar);
    }

    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12832o> eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            mo57260a(eVar);
            return;
        }
        String valueOf = String.valueOf(eVar.f33702b);
        String str2 = eVar.f33703c;
        StringBuilder sb = new StringBuilder("on need captcha:");
        sb.append(str);
        AccountLoginAlogHelper.m71518a(valueOf, str2, null, null, sb.toString());
        this.f57322a.mo57354a(str, eVar.f33703c, ((C12832o) eVar.f33709g).f33970r, new C21341r(this.f57322a, this, (C12832o) eVar.f33709g));
    }
}
