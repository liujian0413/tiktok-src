package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12827j;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12848i;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.util.C22345t;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.p */
public abstract class C21339p extends C12848i {

    /* renamed from: a */
    private C21336m f57321a;

    /* renamed from: a */
    public void mo57358a(C12710e<C12827j> eVar) {
    }

    public C21339p(C21336m mVar) {
        this.f57321a = mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void onNeedSecureCaptcha(C12710e<C12827j> eVar) {
        super.onNeedSecureCaptcha(eVar);
        mo57358a(eVar);
    }

    public void onSuccess(C12710e<C12827j> eVar) {
        C21671bd.m72526a(((C12827j) eVar.f33709g).mo31218b());
        C22345t.m73972e(true);
    }

    public void onError(C12710e<C12827j> eVar, int i) {
        mo57358a(eVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onNeedCaptcha(C12710e<C12827j> eVar, String str) {
        if (eVar == null || TextUtils.isEmpty(str)) {
            mo57358a(eVar);
            return;
        }
        String valueOf = String.valueOf(eVar.f33702b);
        String str2 = eVar.f33703c;
        ALogLoginPart aLogLoginPart = ALogLoginPart.LOGIN_BY_PASS;
        ALogLoginMethod aLogLoginMethod = ALogLoginMethod.PHONE_NUMBER_PASS;
        StringBuilder sb = new StringBuilder("on need captcha:");
        sb.append(str);
        AccountLoginAlogHelper.m71518a(valueOf, str2, aLogLoginPart, aLogLoginMethod, sb.toString());
        this.f57321a.mo57354a(str, eVar.f33703c, ((C12827j) eVar.f33709g).f33970r, new C21338o(this.f57321a, this, (C12827j) eVar.f33709g));
    }
}
