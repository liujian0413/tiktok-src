package net.openid.appauth;

import java.util.Collections;
import java.util.Map;

/* renamed from: net.openid.appauth.m */
public final class C48279m implements ClientAuthentication {

    /* renamed from: a */
    public static final C48279m f123310a = new C48279m();

    private C48279m() {
    }

    /* renamed from: a */
    public final Map<String, String> mo120611a(String str) {
        return Collections.singletonMap("client_id", str);
    }
}
