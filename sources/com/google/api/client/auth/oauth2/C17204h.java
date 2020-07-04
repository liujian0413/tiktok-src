package com.google.api.client.auth.oauth2;

import com.google.api.client.json.C17285b;
import com.google.api.client.util.C6580n;

/* renamed from: com.google.api.client.auth.oauth2.h */
public class C17204h extends C17285b {
    @C6580n(mo15941a = "access_token")
    public String accessToken;
    @C6580n(mo15941a = "expires_in")
    public Long expiresInSeconds;
    @C6580n(mo15941a = "refresh_token")
    public String refreshToken;
    @C6580n
    public String scope;
    @C6580n(mo15941a = "token_type")
    public String tokenType;

    /* renamed from: c */
    public C17204h clone() {
        return (C17204h) super.clone();
    }

    /* renamed from: b */
    public C17204h mo44448c(String str, Object obj) {
        return (C17204h) super.mo44448c(str, obj);
    }
}
