package com.google.api.client.auth.oauth2;

import com.google.api.client.http.C17256g;
import com.google.api.client.http.C17260k;
import com.google.api.client.http.C17268q;
import com.google.api.client.http.C17272u;
import com.google.api.client.json.C17291c;
import com.google.api.client.util.C17384w;
import com.google.api.client.util.C6580n;

/* renamed from: com.google.api.client.auth.oauth2.e */
public final class C17199e extends C17201g {
    @C6580n(mo15941a = "refresh_token")
    public String refreshToken;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C17199e mo44472b(C17256g gVar) {
        return (C17199e) super.mo44472b(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C17199e mo44477d(String str) {
        return (C17199e) super.mo44477d(str);
    }

    /* renamed from: b */
    private C17199e m57081b(String str) {
        this.refreshToken = (String) C17384w.m57847a(str);
        return this;
    }

    /* renamed from: a */
    public final C17199e mo44473b(C17260k kVar) {
        return (C17199e) super.mo44473b(kVar);
    }

    /* renamed from: a */
    public final C17199e mo44474b(C17268q qVar) {
        return (C17199e) super.mo44474b(qVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C17199e mo44448c(String str, Object obj) {
        return (C17199e) super.mo44448c(str, obj);
    }

    public C17199e(C17272u uVar, C17291c cVar, C17256g gVar, String str) {
        super(uVar, cVar, gVar, "refresh_token");
        m57081b(str);
    }
}
