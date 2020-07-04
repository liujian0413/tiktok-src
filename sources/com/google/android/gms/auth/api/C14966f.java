package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C14988f;
import com.google.android.gms.common.api.C15017a.C15018a;
import com.google.android.gms.common.api.C15017a.C15028f;
import com.google.android.gms.common.api.C15037d.C15039b;
import com.google.android.gms.common.api.C15037d.C15040c;
import com.google.android.gms.common.internal.C15244e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.f */
final class C14966f extends C15018a<C14988f, GoogleSignInOptions> {
    C14966f() {
    }

    /* renamed from: a */
    public final /* synthetic */ C15028f mo38026a(Context context, Looper looper, C15244e eVar, Object obj, C15039b bVar, C15040c cVar) {
        C14988f fVar = new C14988f(context, looper, eVar, (GoogleSignInOptions) obj, bVar, cVar);
        return fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ List mo38069a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.mo38083a();
    }
}
