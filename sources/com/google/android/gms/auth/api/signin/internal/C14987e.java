package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.signin.C14974b;
import com.google.android.gms.auth.api.signin.C14975c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15041e;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.api.signin.internal.e */
public final class C14987e implements C14974b {
    /* renamed from: a */
    public final Intent mo38097a(C15037d dVar) {
        return C14989g.m43501a(dVar.mo38239b(), m43490d(dVar));
    }

    /* renamed from: b */
    public final C15041e<Status> mo38099b(C15037d dVar) {
        return C14989g.m43503a(dVar, dVar.mo38239b(), false);
    }

    /* renamed from: c */
    public final C15041e<Status> mo38100c(C15037d dVar) {
        return C14989g.m43505b(dVar, dVar.mo38239b(), false);
    }

    /* renamed from: a */
    public final C14975c mo38098a(Intent intent) {
        return C14989g.m43502a(intent);
    }

    /* renamed from: d */
    private static GoogleSignInOptions m43490d(C15037d dVar) {
        return ((C14988f) dVar.mo38231a((C15020c<C>) C14941a.f38648b)).f38834a;
    }
}
