package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.C14989g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15229b;
import com.google.android.gms.tasks.C17057f;
import com.google.android.gms.tasks.C17061i;

/* renamed from: com.google.android.gms.auth.api.signin.a */
public final class C14973a {
    /* renamed from: a */
    public static C17057f<GoogleSignInAccount> m43458a(Intent intent) {
        C14975c a = C14989g.m43502a(intent);
        if (a == null) {
            return C17061i.m56596a((Exception) C15229b.m44250a(Status.f38869c));
        }
        if (!a.mo38101a().mo38201c() || a.f38812a == null) {
            return C17061i.m56596a((Exception) C15229b.m44250a(a.mo38101a()));
        }
        return C17061i.m56597a(a.f38812a);
    }
}
