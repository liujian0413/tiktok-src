package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.C14941a.C14942a;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.C15270b;

/* renamed from: com.google.android.gms.internal.auth-api.e */
public final class C16324e {
    /* renamed from: a */
    public static PendingIntent m53277a(Context context, C14942a aVar, HintRequest hintRequest) {
        C15267r.m44385a(context, (Object) "context must not be null");
        C15267r.m44385a(hintRequest, (Object) "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
        C15270b.m44470a(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, AdError.SERVER_ERROR_CODE, putExtra, 134217728);
    }
}
