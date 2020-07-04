package com.snapchat.kit.sdk.core.networking;

import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C18647a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import okhttp3.Interceptor.Chain;
import okhttp3.Request.Builder;

/* renamed from: com.snapchat.kit.sdk.core.networking.c */
public final class C18686c extends C18688e {

    /* renamed from: a */
    private final Fingerprint f50479a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Builder mo49179a(Chain chain) {
        Builder a = super.mo49179a(chain);
        String a2 = this.f50479a.mo49182a();
        if (a2 != null) {
            a.header("X-Snap-SDK-Client-Auth-Token", a2);
        }
        return a;
    }

    C18686c(OAuth2Manager oAuth2Manager, C18647a aVar, String str, Fingerprint fingerprint) {
        super(oAuth2Manager, aVar, str);
        this.f50479a = fingerprint;
    }
}
