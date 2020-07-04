package com.p280ss.android.ugc.aweme.account.p946i;

import com.p280ss.android.ugc.aweme.account.login.C21592t;
import com.p280ss.android.ugc.aweme.account.p946i.C21215c.C21216a;

/* renamed from: com.ss.android.ugc.aweme.account.i.a */
public final class C21213a extends C21215c {

    /* renamed from: b */
    private String f57005b;

    /* renamed from: c */
    private String f57006c;

    /* renamed from: d */
    private String f57007d;

    public C21213a() {
        super("age_gate_response");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57136a() {
        mo57140a("is_success", this.f57005b, C21216a.f57013a);
        mo57140a("platform", this.f57006c, C21216a.f57013a);
        mo57140a("error_code", this.f57007d, C21216a.f57013a);
        mo57140a("enter_from", C21592t.f57970b, C21216a.f57013a);
        mo57140a("enter_method", C21592t.f57969a, C21216a.f57013a);
    }

    /* renamed from: a */
    public final C21213a mo57135a(String str) {
        this.f57005b = str;
        return this;
    }

    /* renamed from: b */
    public final C21213a mo57137b(String str) {
        this.f57006c = str;
        return this;
    }

    /* renamed from: c */
    public final C21213a mo57138c(String str) {
        this.f57007d = str;
        return this;
    }
}
