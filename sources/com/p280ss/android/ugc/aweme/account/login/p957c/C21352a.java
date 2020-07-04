package com.p280ss.android.ugc.aweme.account.login.p957c;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12849j;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.mobilelib.view.InputCodePasswordView;
import com.p280ss.android.ugc.aweme.account.C21169e;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.a */
public final class C21352a extends C21354c {

    /* renamed from: b */
    private C12728d f57345b;

    public final void onCompleteCaptcha(String str, int i) {
    }

    public C21352a(Context context, InputCodePasswordView inputCodePasswordView) {
        super(context, inputCodePasswordView);
        this.f57345b = C12798d.m37186a(context);
    }

    /* renamed from: a */
    public final void mo57435a(String str, String str2, C12855p pVar) {
        if (isValid()) {
            this.f57345b.mo31187a(str, (String) null, C21169e.f56936u, pVar);
        }
    }

    /* renamed from: b */
    public final void mo57437b(String str, String str2, C12855p pVar) {
        if (isValid()) {
            this.f57345b.mo31214b(str, (String) null, C21169e.f56936u, pVar);
        }
    }

    /* renamed from: a */
    public final void mo57436a(String str, String str2, String str3, C12849j jVar) {
        if (isValid()) {
            this.f57345b.mo31200a(str, str2, str3, jVar);
        }
    }
}
