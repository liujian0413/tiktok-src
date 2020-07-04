package com.p280ss.android.ugc.aweme.profile.edit;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* renamed from: com.ss.android.ugc.aweme.profile.edit.j */
final /* synthetic */ class C35762j implements Runnable {

    /* renamed from: a */
    private final C35759g f93745a;

    /* renamed from: b */
    private final GoogleSignInAccount f93746b;

    C35762j(C35759g gVar, GoogleSignInAccount googleSignInAccount) {
        this.f93745a = gVar;
        this.f93746b = googleSignInAccount;
    }

    public final void run() {
        this.f93745a.mo90630a(this.f93746b);
    }
}
