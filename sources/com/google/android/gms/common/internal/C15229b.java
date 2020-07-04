package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.internal.b */
public final class C15229b {
    /* renamed from: a */
    public static ApiException m44250a(Status status) {
        if (status.mo38200b()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
