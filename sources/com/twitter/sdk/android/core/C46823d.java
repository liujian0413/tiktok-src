package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.p1846b.C46864e;

/* renamed from: com.twitter.sdk.android.core.d */
public class C46823d extends C46938j<GuestAuthToken> {

    /* renamed from: com.twitter.sdk.android.core.d$a */
    public static class C46824a implements C46864e<C46823d> {

        /* renamed from: a */
        private final C6600e f120110a = new C6607f().mo15986a(GuestAuthToken.class, new AuthTokenAdapter()).mo15992f();

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo117910a(C46823d dVar) {
            if (!(dVar == null || dVar.f120356a == null)) {
                try {
                    return this.f120110a.mo15979b((Object) dVar);
                } catch (Exception e) {
                    new StringBuilder("Failed to serialize session ").append(e.getMessage());
                }
            }
            return "";
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C46823d mo117909a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (C46823d) this.f120110a.mo15974a(str, C46823d.class);
                } catch (Exception e) {
                    new StringBuilder("Failed to deserialize session ").append(e.getMessage());
                }
            }
            return null;
        }
    }

    public C46823d(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0);
    }
}
