package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: com.google.android.gms.auth.api.signin.internal.m */
public final class C14995m {

    /* renamed from: a */
    private static C14995m f38838a;

    /* renamed from: b */
    private C14984b f38839b;

    /* renamed from: c */
    private GoogleSignInAccount f38840c = this.f38839b.mo38118a();

    /* renamed from: d */
    private GoogleSignInOptions f38841d = this.f38839b.mo38120b();

    private C14995m(Context context) {
        this.f38839b = C14984b.m43475a(context);
    }

    /* renamed from: a */
    public static synchronized C14995m m43512a(Context context) {
        C14995m b;
        synchronized (C14995m.class) {
            b = m43513b(context.getApplicationContext());
        }
        return b;
    }

    /* renamed from: b */
    private static synchronized C14995m m43513b(Context context) {
        C14995m mVar;
        synchronized (C14995m.class) {
            if (f38838a == null) {
                f38838a = new C14995m(context);
            }
            mVar = f38838a;
        }
        return mVar;
    }

    /* renamed from: a */
    public final synchronized void mo38137a() {
        this.f38839b.mo38123e();
        this.f38840c = null;
        this.f38841d = null;
    }

    /* renamed from: a */
    public final synchronized void mo38138a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f38839b.mo38119a(googleSignInAccount, googleSignInOptions);
        this.f38840c = googleSignInAccount;
        this.f38841d = googleSignInOptions;
    }
}
