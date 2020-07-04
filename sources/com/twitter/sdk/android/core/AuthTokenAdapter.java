package com.twitter.sdk.android.core;

import com.google.gson.C6600e;
import com.google.gson.C6610i;
import com.google.gson.C6708j;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.google.gson.C6713p;
import com.google.gson.C6714q;
import com.google.gson.JsonParseException;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AuthTokenAdapter implements C6708j<C46820a>, C6714q<C46820a> {

    /* renamed from: a */
    static final Map<String, Class<? extends C46820a>> f120102a;

    /* renamed from: b */
    private final C6600e f120103b = new C6600e();

    static {
        HashMap hashMap = new HashMap();
        f120102a = hashMap;
        hashMap.put("oauth1a", TwitterAuthToken.class);
        f120102a.put("oauth2", OAuth2Token.class);
        f120102a.put("guest", GuestAuthToken.class);
    }

    /* renamed from: a */
    private static String m146462a(Class<? extends C46820a> cls) {
        for (Entry entry : f120102a.entrySet()) {
            if (((Class) entry.getValue()).equals(cls)) {
                return (String) entry.getKey();
            }
        }
        return "";
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C6709k mo10404a(C46820a aVar, Type type, C6713p pVar) {
        C6711m mVar = new C6711m();
        mVar.mo16147a("auth_type", m146462a(aVar.getClass()));
        mVar.mo16144a("auth_token", this.f120103b.mo15963a((Object) aVar));
        return mVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C46820a mo10405a(C6709k kVar, Type type, C6610i iVar) throws JsonParseException {
        C6711m m = kVar.mo16136m();
        String c = m.mo16150c("auth_type").mo15998c();
        return (C46820a) this.f120103b.mo15970a(m.mo16149b("auth_token"), (Class) f120102a.get(c));
    }
}
