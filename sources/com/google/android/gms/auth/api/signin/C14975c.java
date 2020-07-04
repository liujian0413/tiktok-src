package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C14975c implements C15044g {

    /* renamed from: a */
    public GoogleSignInAccount f38812a;

    /* renamed from: b */
    private Status f38813b;

    public C14975c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f38812a = googleSignInAccount;
        this.f38813b = status;
    }

    /* renamed from: a */
    public final Status mo38101a() {
        return this.f38813b;
    }

    /* renamed from: b */
    public final boolean mo38102b() {
        return this.f38813b.mo38201c();
    }
}
