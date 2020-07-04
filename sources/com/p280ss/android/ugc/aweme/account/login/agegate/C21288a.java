package com.p280ss.android.ugc.aweme.account.login.agegate;

import com.bytedance.lobby.auth.AuthResult;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b.C21298a;

/* renamed from: com.ss.android.ugc.aweme.account.login.agegate.a */
public final class C21288a implements C21298a {

    /* renamed from: a */
    private AuthResult f57199a;

    /* renamed from: b */
    private C21289a f57200b;

    /* renamed from: com.ss.android.ugc.aweme.account.login.agegate.a$a */
    public interface C21289a {
        /* renamed from: a */
        void mo57279a(int i, AuthResult authResult);
    }

    /* renamed from: a */
    public final void mo57275a() {
        m71649a(1);
    }

    /* renamed from: b */
    public final void mo57277b() {
        m71649a(0);
    }

    /* renamed from: c */
    public final void mo57278c() {
        m71649a(1);
    }

    /* renamed from: a */
    private void m71649a(int i) {
        if (this.f57200b != null) {
            this.f57200b.mo57279a(i, this.f57199a);
        }
    }

    /* renamed from: a */
    public final void mo57276a(Exception exc) {
        m71649a(-1);
    }

    public C21288a(AuthResult authResult, C21289a aVar) {
        this.f57199a = authResult;
        this.f57200b = aVar;
    }
}
