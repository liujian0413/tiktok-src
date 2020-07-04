package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.C14941a;
import com.google.android.gms.auth.api.credentials.C14956a;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.C15017a.C15020c;
import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.internal.C15267r;

/* renamed from: com.google.android.gms.internal.auth-api.d */
public final class C16323d implements C14956a {
    /* renamed from: a */
    public final PendingIntent mo38058a(C15037d dVar, HintRequest hintRequest) {
        C15267r.m44385a(dVar, (Object) "client must not be null");
        C15267r.m44385a(hintRequest, (Object) "request must not be null");
        return C16324e.m53277a(dVar.mo38239b(), ((C16325f) dVar.mo38231a((C15020c<C>) C14941a.f38647a)).f45813a, hintRequest);
    }
}
