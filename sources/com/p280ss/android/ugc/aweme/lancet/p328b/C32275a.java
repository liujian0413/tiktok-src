package com.p280ss.android.ugc.aweme.lancet.p328b;

import android.content.pm.ProviderInfo;

/* renamed from: com.ss.android.ugc.aweme.lancet.b.a */
public final class C32275a {
    /* renamed from: a */
    public static void m104797a(ProviderInfo providerInfo) {
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }
}
