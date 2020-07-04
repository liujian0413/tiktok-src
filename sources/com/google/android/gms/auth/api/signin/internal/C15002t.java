package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.C15172d;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15037d.C15038a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public final class C15002t extends C14997o {

    /* renamed from: a */
    private final Context f38842a;

    public C15002t(Context context) {
        this.f38842a = context;
    }

    /* renamed from: a */
    public final void mo38139a() {
        m43527c();
        C14984b a = C14984b.m43475a(this.f38842a);
        GoogleSignInAccount a2 = a.mo38118a();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f38788f;
        if (a2 != null) {
            googleSignInOptions = a.mo38120b();
        }
        C15037d a3 = new C15038a(this.f38842a).mo38253a(C14941a.f38651e, googleSignInOptions).mo38256a();
        try {
            if (a3.mo38245f().mo38154b()) {
                if (a2 != null) {
                    C14941a.f38654h.mo38100c(a3);
                } else {
                    a3.mo38248i();
                }
            }
        } finally {
            a3.mo38246g();
        }
    }

    /* renamed from: b */
    public final void mo38140b() {
        m43527c();
        C14995m.m43512a(this.f38842a).mo38137a();
    }

    /* renamed from: c */
    private final void m43527c() {
        if (!C15172d.m44173c(this.f38842a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }
}
