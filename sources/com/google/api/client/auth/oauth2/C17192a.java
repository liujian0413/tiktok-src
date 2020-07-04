package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17268q;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C6580n;

/* renamed from: com.google.api.client.auth.oauth2.a */
public class C17192a extends C17201g {
    @C6580n
    public String code;
    @C6580n(mo15941a = "redirect_uri")
    public String redirectUri;

    /* renamed from: c */
    public C17192a mo44476c(String str) {
        this.redirectUri = str;
        return this;
    }

    /* renamed from: a */
    public C17192a mo44472b(C17256g gVar) {
        return (C17192a) super.mo44472b(gVar);
    }

    /* renamed from: a */
    public C17192a mo44473b(C17260k kVar) {
        return (C17192a) super.mo44473b(kVar);
    }

    /* renamed from: b */
    public C17192a mo44471b(String str) {
        this.code = (String) C17384w.m57847a(str);
        return this;
    }

    /* renamed from: a */
    public C17192a mo44474b(C17268q qVar) {
        return (C17192a) super.mo44474b(qVar);
    }

    /* renamed from: a */
    public C17192a mo44477d(String str) {
        return (C17192a) super.mo44477d(str);
    }

    /* renamed from: a */
    public C17192a mo44448c(String str, Object obj) {
        return (C17192a) super.mo44448c(str, obj);
    }

    public C17192a(C17272u uVar, C17291c cVar, C17256g gVar, String str) {
        super(uVar, cVar, gVar, "authorization_code");
        mo44471b(str);
    }
}
