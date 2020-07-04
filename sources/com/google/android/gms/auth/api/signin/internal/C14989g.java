package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.C14975c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15041e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C15133d;
import com.google.android.gms.common.p747b.C15166a;

/* renamed from: com.google.android.gms.auth.api.signin.internal.g */
public final class C14989g {

    /* renamed from: a */
    private static C15166a f38835a = new C15166a("GoogleSignInCommon", new String[0]);

    /* renamed from: a */
    public static Intent m43501a(Context context, GoogleSignInOptions googleSignInOptions) {
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* renamed from: a */
    public static C15041e<Status> m43503a(C15037d dVar, Context context, boolean z) {
        m43504a(context);
        return dVar.mo38232a(new C14990h(dVar));
    }

    /* renamed from: b */
    public static C15041e<Status> m43505b(C15037d dVar, Context context, boolean z) {
        C14984b.m43475a(context).mo38121c();
        m43504a(context);
        return dVar.mo38232a(new C14992j(dVar));
    }

    /* renamed from: a */
    private static void m43504a(Context context) {
        C14995m.m43512a(context).mo38137a();
        for (C15037d d : C15037d.m43585a()) {
            d.mo38243d();
        }
        C15133d.m43964b();
    }

    /* renamed from: a */
    public static C14975c m43502a(Intent intent) {
        if (intent == null || (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f38867a;
        }
        return new C14975c(googleSignInAccount, status);
    }
}
