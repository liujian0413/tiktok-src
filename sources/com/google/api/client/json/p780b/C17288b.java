package com.google.api.client.json.p780b;

import com.google.api.client.json.C17285b;
import com.google.api.client.util.C17380v;
import com.google.api.client.util.C6580n;

/* renamed from: com.google.api.client.json.b.b */
public class C17288b {

    /* renamed from: a */
    private final C17289a f48157a;

    /* renamed from: b */
    private final C17290b f48158b;

    /* renamed from: com.google.api.client.json.b.b$a */
    public static class C17289a extends C17285b {
        @C6580n(mo15941a = "cty")
        public String contentType;
        @C6580n(mo15941a = "typ")
        public String type;

        /* renamed from: c */
        public C17289a clone() {
            return (C17289a) super.clone();
        }

        /* renamed from: d */
        public C17289a mo44713d(String str) {
            this.type = str;
            return this;
        }

        /* renamed from: b */
        public C17289a mo44448c(String str, Object obj) {
            return (C17289a) super.mo44448c(str, obj);
        }
    }

    /* renamed from: com.google.api.client.json.b.b$b */
    public static class C17290b extends C17285b {
        @C6580n(mo15941a = "aud")
        public Object audience;
        @C6580n(mo15941a = "exp")
        public Long expirationTimeSeconds;
        @C6580n(mo15941a = "iat")
        public Long issuedAtTimeSeconds;
        @C6580n(mo15941a = "iss")
        public String issuer;
        @C6580n(mo15941a = "jti")
        public String jwtId;
        @C6580n(mo15941a = "nbf")
        public Long notBeforeTimeSeconds;
        @C6580n(mo15941a = "sub")
        public String subject;
        @C6580n(mo15941a = "typ")
        public String type;

        /* access modifiers changed from: private */
        /* renamed from: c */
        public C17290b clone() {
            return (C17290b) super.clone();
        }

        /* renamed from: a */
        public final C17290b mo44715a(Long l) {
            this.expirationTimeSeconds = l;
            return this;
        }

        /* renamed from: b */
        public final C17290b mo44718b(Long l) {
            this.issuedAtTimeSeconds = l;
            return this;
        }

        /* renamed from: a */
        public final C17290b mo44716a(Object obj) {
            this.audience = obj;
            return this;
        }

        /* renamed from: a */
        public final C17290b mo44717a(String str) {
            this.issuer = str;
            return this;
        }

        /* renamed from: b */
        public final C17290b mo44719b(String str) {
            this.subject = str;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C17290b mo44448c(String str, Object obj) {
            return (C17290b) super.mo44448c(str, obj);
        }
    }

    public String toString() {
        return C17380v.m57842a(this).mo44870a("header", this.f48157a).mo44870a("payload", this.f48158b).toString();
    }
}
