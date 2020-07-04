package com.p280ss.android.ugc.aweme.account.login.p957c;

import android.content.Context;
import android.os.Message;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12848i;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.p280ss.android.mobilelib.view.CommonView;
import com.p280ss.android.ugc.aweme.account.C21169e;

/* renamed from: com.ss.android.ugc.aweme.account.login.c.e */
public final class C21356e extends C21354c {

    /* renamed from: b */
    private C12728d f57348b;

    public final void onCompleteCaptcha(String str, int i) {
    }

    public final void handleMsg(Message message) {
        super.handleMsg(message);
    }

    public C21356e(Context context, CommonView commonView) {
        super(context, commonView);
        this.f57348b = C12798d.m37186a(context);
    }

    /* renamed from: a */
    public final void mo57435a(String str, String str2, C12855p pVar) {
        this.f57348b.mo31187a(str, (String) null, C21169e.f56936u, pVar);
    }

    /* renamed from: b */
    public final void mo57437b(String str, String str2, C12855p pVar) {
        this.f57348b.mo31214b(str, (String) null, C21169e.f56936u, pVar);
    }

    /* renamed from: a */
    public final void mo57442a(String str, String str2, String str3, C12848i iVar) {
        if (isValid()) {
            beforeHandleRequest();
            this.f57348b.mo31199a(str, str2, (String) null, iVar);
        }
    }
}
