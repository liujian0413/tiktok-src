package com.twitter.sdk.android.core.internal.oauth;

import com.google.gson.p276a.C6593c;

public class GuestAuthToken extends OAuth2Token {
    @C6593c(mo15949a = "guest_token")

    /* renamed from: b */
    public final String f120207b;

    /* renamed from: a */
    public final boolean mo117981a() {
        if (System.currentTimeMillis() >= this.f120108a + 10800000) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.f120207b != null) {
            i = this.f120207b.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        GuestAuthToken guestAuthToken = (GuestAuthToken) obj;
        if (this.f120207b == null ? guestAuthToken.f120207b == null : this.f120207b.equals(guestAuthToken.f120207b)) {
            return true;
        }
        return false;
    }

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.f120207b = str3;
    }
}
