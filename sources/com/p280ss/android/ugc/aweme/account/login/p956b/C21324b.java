package com.p280ss.android.ugc.aweme.account.login.p956b;

import android.text.TextUtils;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.log.C21252c;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;

/* renamed from: com.ss.android.ugc.aweme.account.login.b.b */
public abstract class C21324b implements C21823a {

    /* renamed from: a */
    public C21336m f57296a;

    /* renamed from: b */
    private C12728d f57297b = C12798d.m37186a(C21671bd.m72532b());

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo57344b(String str, int i);

    /* renamed from: a */
    public final void mo57346a() {
        this.f57296a.mo57355c();
        C21252c.m71533b();
        this.f57297b.mo31177a(C21169e.f56936u, (C12852m) new C12852m() {
            public final /* bridge */ /* synthetic */ void onNeedCaptcha(C12707b bVar, String str) {
            }

            public final void onSuccess(C12710e<C12833p> eVar) {
                if (eVar != null && eVar.f33709g != null && !TextUtils.isEmpty(((C12833p) eVar.f33709g).f33986a)) {
                    C21252c.m71534b(((C12833p) eVar.f33709g).f33986a, String.valueOf(((C12833p) eVar.f33709g).f33970r));
                    C21324b.this.f57296a.mo57354a(((C12833p) eVar.f33709g).f33986a, null, ((C12833p) eVar.f33709g).f33970r, C21324b.this);
                }
            }

            public final void onError(C12710e<C12833p> eVar, int i) {
                C21252c.m71535c(String.valueOf(eVar.f33702b), eVar.f33703c);
            }
        });
    }

    public C21324b(C21336m mVar) {
        this.f57296a = mVar;
    }

    /* renamed from: a */
    public final void mo57347a(String str, int i) {
        C21558a.m72263a().mo57697a("", "", false, "send_voice_code", "", "注册图片验证码");
        C21252c.m71531a(str, String.valueOf(i));
        mo57344b(str, i);
        this.f57296a.mo57355c();
    }
}
