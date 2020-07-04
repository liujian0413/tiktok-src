package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p276a.C6593c;
import com.twitter.sdk.android.core.internal.p1846b.C46864e;

/* renamed from: com.twitter.sdk.android.core.t */
public class C46972t extends C46938j<TwitterAuthToken> {
    @C6593c(mo15949a = "user_name")

    /* renamed from: c */
    public final String f120526c;

    /* renamed from: com.twitter.sdk.android.core.t$a */
    static class C46973a implements C46864e<C46972t> {

        /* renamed from: a */
        private final C6600e f120527a = new C6600e();

        C46973a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String mo117910a(C46972t tVar) {
            if (!(tVar == null || tVar.f120356a == null)) {
                try {
                    return this.f120527a.mo15979b((Object) tVar);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return "";
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C46972t mo117909a(String str) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    return (C46972t) this.f120527a.mo15974a(str, C46972t.class);
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final long mo118127a() {
        return this.f120357b;
    }

    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        if (this.f120526c != null) {
            i = this.f120526c.hashCode();
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
        C46972t tVar = (C46972t) obj;
        if (this.f120526c != null) {
            return this.f120526c.equals(tVar.f120526c);
        }
        if (tVar.f120526c == null) {
            return true;
        }
        return false;
    }

    public C46972t(TwitterAuthToken twitterAuthToken, long j, String str) {
        super(twitterAuthToken, j);
        this.f120526c = str;
    }
}
