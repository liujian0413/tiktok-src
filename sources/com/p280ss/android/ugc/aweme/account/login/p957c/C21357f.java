package com.p280ss.android.ugc.aweme.account.login.p957c;

import android.content.Context;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12854o;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.mobilelib.view.CommonView;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21346w;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.f */
public final class C21357f extends C21354c {

    /* renamed from: b */
    private C12728d f57349b;

    public final void onCompleteCaptcha(String str, int i) {
    }

    public C21357f(Context context, CommonView commonView) {
        super(context, commonView);
        this.f57349b = C12798d.m37186a(context);
    }

    /* renamed from: a */
    public final void mo57435a(String str, String str2, C12855p pVar) {
        if (isValid()) {
            this.f57349b.mo31187a(str, (String) null, C21169e.f56919d, pVar);
        }
    }

    /* renamed from: b */
    public final void mo57437b(String str, String str2, C12855p pVar) {
        if (isValid()) {
            this.f57349b.mo31214b(str, (String) null, C21169e.f56919d, pVar);
        }
    }

    /* renamed from: a */
    public final void mo57443a(String str, String str2, String str3, String str4, C21346w wVar) {
        if (isValid()) {
            beforeHandleRequest();
            this.f57349b.mo31208a(str, str2, str3, str4, (C12854o) wVar);
        }
    }
}
