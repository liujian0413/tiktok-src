package com.snapchat.kit.sdk;

import android.text.TextUtils;
import android.util.Base64;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.b */
final class C18643b {

    /* renamed from: a */
    private static String f50373a = "AuthRequestFactory";

    /* renamed from: b */
    private static int f50374b = 32;

    /* renamed from: c */
    private static int f50375c = 32;

    /* renamed from: a */
    private static String m61148a(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: a */
    private static String m61149a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("US-ASCII"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    static AuthorizationRequest m61147a(String str, String str2, List<String> list) {
        String a = m61148a(f50375c);
        String a2 = m61149a(a);
        return new AuthorizationRequest().withResponseType("code").withClientId(str).withScope(TextUtils.join(" ", list)).withRedirectUri(str2).withCodeChallengeMethod("S256").withCodeVerifier(a).withCodeChallenge(a2).withState(m61148a(f50374b));
    }
}
