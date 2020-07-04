package com.p280ss.android.ugc.aweme.account.p946i;

import com.p280ss.android.ugc.aweme.account.p946i.C21215c.C21216a;

/* renamed from: com.ss.android.ugc.aweme.account.i.g */
public final class C21222g extends C21215c {

    /* renamed from: b */
    private String f57019b;

    /* renamed from: c */
    private String f57020c;

    /* renamed from: d */
    private String f57021d;

    /* renamed from: e */
    private String f57022e;

    public C21222g() {
        super("sign_in_response");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo57136a() {
        mo57140a("is_success", this.f57019b, C21216a.f57013a);
        mo57140a("platform", this.f57020c, C21216a.f57013a);
        mo57140a("error_code", this.f57021d, C21216a.f57013a);
        mo57140a("url_path", this.f57022e, C21216a.f57013a);
    }

    /* renamed from: a */
    public final C21222g mo57148a(String str) {
        this.f57019b = str;
        return this;
    }

    /* renamed from: b */
    public final C21222g mo57149b(String str) {
        this.f57020c = str;
        return this;
    }

    /* renamed from: c */
    public final C21222g mo57150c(String str) {
        this.f57021d = str;
        return this;
    }

    /* renamed from: d */
    public final C21222g mo57151d(String str) {
        this.f57022e = str;
        return this;
    }
}
