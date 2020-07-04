package com.google.api.client.json.p780b;

import com.google.api.client.json.C17291c;
import com.google.api.client.json.p780b.C17288b.C17289a;
import com.google.api.client.json.p780b.C17288b.C17290b;
import com.google.api.client.util.C17347ab;
import com.google.api.client.util.C17357c;
import com.google.api.client.util.C17385x;
import com.google.api.client.util.C6580n;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.List;

/* renamed from: com.google.api.client.json.b.a */
public final class C17286a extends C17288b {

    /* renamed from: com.google.api.client.json.b.a$a */
    public static class C17287a extends C17289a {
        @C6580n(mo15941a = "alg")
        public String algorithm;
        @C6580n(mo15941a = "crit")
        public List<String> critical;
        @C6580n(mo15941a = "jwk")
        public String jwk;
        @C6580n(mo15941a = "jku")
        public String jwkUrl;
        @C6580n(mo15941a = "kid")
        public String keyId;
        @C6580n(mo15941a = "x5c")
        public List<String> x509Certificates;
        @C6580n(mo15941a = "x5t")
        public String x509Thumbprint;
        @C6580n(mo15941a = "x5u")
        public String x509Url;

        /* access modifiers changed from: private */
        /* renamed from: e */
        public C17287a clone() {
            return (C17287a) super.clone();
        }

        /* renamed from: a */
        public final C17287a mo44713d(String str) {
            super.mo44713d(str);
            return this;
        }

        /* renamed from: b */
        public final C17287a mo44709b(String str) {
            this.algorithm = str;
            return this;
        }

        /* renamed from: c */
        public final C17287a mo44711c(String str) {
            this.keyId = str;
            return this;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public C17287a mo44448c(String str, Object obj) {
            return (C17287a) super.mo44448c(str, obj);
        }
    }

    /* renamed from: a */
    public static String m57540a(PrivateKey privateKey, C17291c cVar, C17287a aVar, C17290b bVar) throws GeneralSecurityException, IOException {
        String valueOf = String.valueOf(String.valueOf(C17357c.m57794a(cVar.mo44722c(aVar))));
        String valueOf2 = String.valueOf(String.valueOf(C17357c.m57794a(cVar.mo44722c(bVar))));
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(valueOf2);
        String sb2 = sb.toString();
        byte[] a = C17385x.m57856a(C17385x.m57855a(), privateKey, C17347ab.m57771a(sb2));
        String valueOf3 = String.valueOf(String.valueOf(sb2));
        String valueOf4 = String.valueOf(String.valueOf(C17357c.m57794a(a)));
        StringBuilder sb3 = new StringBuilder(valueOf3.length() + 1 + valueOf4.length());
        sb3.append(valueOf3);
        sb3.append(ClassUtils.PACKAGE_SEPARATOR);
        sb3.append(valueOf4);
        return sb3.toString();
    }
}
