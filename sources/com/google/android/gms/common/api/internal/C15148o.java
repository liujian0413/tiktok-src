package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C17058g;

/* renamed from: com.google.android.gms.common.api.internal.o */
public final class C15148o {
    /* renamed from: a */
    public static void m44053a(Status status, C17058g<Void> gVar) {
        m44054a(status, null, gVar);
    }

    /* renamed from: a */
    private static <TResult> void m44054a(Status status, TResult tresult, C17058g<TResult> gVar) {
        if (status.mo38201c()) {
            gVar.mo44299a(null);
        } else {
            gVar.mo44298a((Exception) new ApiException(status));
        }
    }
}
