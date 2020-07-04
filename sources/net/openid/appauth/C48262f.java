package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.C48282p.C48284a;
import net.openid.appauth.p1889c.C48257b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.f */
public final class C48262f {

    /* renamed from: a */
    public static final Set<String> f123272a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"token_type", "state", "code", "access_token", "expires_in", "id_token", "scope"})));

    /* renamed from: b */
    public final C48259e f123273b;

    /* renamed from: c */
    public final String f123274c;

    /* renamed from: d */
    public final String f123275d;

    /* renamed from: e */
    public final String f123276e;

    /* renamed from: f */
    public final String f123277f;

    /* renamed from: g */
    public final Long f123278g;

    /* renamed from: h */
    public final String f123279h;

    /* renamed from: i */
    public final String f123280i;

    /* renamed from: j */
    public final Map<String, String> f123281j;

    /* renamed from: net.openid.appauth.f$a */
    public static final class C48264a {

        /* renamed from: a */
        private C48259e f123282a;

        /* renamed from: b */
        private String f123283b;

        /* renamed from: c */
        private String f123284c;

        /* renamed from: d */
        private String f123285d;

        /* renamed from: e */
        private String f123286e;

        /* renamed from: f */
        private Long f123287f;

        /* renamed from: g */
        private String f123288g;

        /* renamed from: h */
        private String f123289h;

        /* renamed from: i */
        private Map<String, String> f123290i = new LinkedHashMap();

        /* renamed from: a */
        public final C48262f mo120643a() {
            C48262f fVar = new C48262f(this.f123282a, this.f123283b, this.f123284c, this.f123285d, this.f123286e, this.f123287f, this.f123288g, this.f123289h, Collections.unmodifiableMap(this.f123290i));
            return fVar;
        }

        /* renamed from: a */
        public final C48264a mo120640a(Long l) {
            this.f123287f = l;
            return this;
        }

        /* renamed from: a */
        private C48264a m149732a(Iterable<String> iterable) {
            this.f123289h = C48253c.m149682a(iterable);
            return this;
        }

        /* renamed from: b */
        public final C48264a mo120644b(String str) {
            C48280n.m149793b(str, "tokenType must not be empty");
            this.f123284c = str;
            return this;
        }

        /* renamed from: c */
        public final C48264a mo120645c(String str) {
            C48280n.m149793b(str, "authorizationCode must not be empty");
            this.f123285d = str;
            return this;
        }

        /* renamed from: d */
        public final C48264a mo120646d(String str) {
            C48280n.m149793b(str, "accessToken must not be empty");
            this.f123286e = str;
            return this;
        }

        /* renamed from: e */
        public final C48264a mo120647e(String str) {
            C48280n.m149793b(str, "idToken cannot be empty");
            this.f123288g = str;
            return this;
        }

        /* renamed from: a */
        private C48264a m149734a(String... strArr) {
            if (strArr == null) {
                this.f123289h = null;
            } else {
                m149732a((Iterable<String>) Arrays.asList(strArr));
            }
            return this;
        }

        public C48264a(C48259e eVar) {
            this.f123282a = (C48259e) C48280n.m149789a(eVar, (Object) "authorization request cannot be null");
        }

        /* renamed from: f */
        public final C48264a mo120648f(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f123289h = null;
            } else {
                m149734a(str.split(" +"));
            }
            return this;
        }

        /* renamed from: a */
        public final C48264a mo120639a(Uri uri) {
            return m149731a(uri, (C48270j) C48281o.f123311a);
        }

        /* renamed from: a */
        public final C48264a mo120641a(String str) {
            C48280n.m149793b(str, "state must not be empty");
            this.f123283b = str;
            return this;
        }

        /* renamed from: a */
        public final C48264a mo120642a(Map<String, String> map) {
            this.f123290i = C48241a.m149664a(map, C48262f.f123272a);
            return this;
        }

        /* renamed from: a */
        private C48264a m149733a(Long l, C48270j jVar) {
            if (l == null) {
                this.f123287f = null;
            } else {
                this.f123287f = Long.valueOf(jVar.mo120655a() + TimeUnit.SECONDS.toMillis(l.longValue()));
            }
            return this;
        }

        /* renamed from: a */
        private C48264a m149731a(Uri uri, C48270j jVar) {
            mo120641a(uri.getQueryParameter("state"));
            mo120644b(uri.getQueryParameter("token_type"));
            mo120645c(uri.getQueryParameter("code"));
            mo120646d(uri.getQueryParameter("access_token"));
            m149733a(C48257b.m149696a(uri, "expires_in"), jVar);
            mo120647e(uri.getQueryParameter("id_token"));
            mo120648f(uri.getQueryParameter("scope"));
            mo120642a(C48241a.m149663a(uri, C48262f.f123272a));
            return this;
        }
    }

    /* renamed from: d */
    private String m149728d() {
        return m149727c().toString();
    }

    /* renamed from: b */
    public final Intent mo120638b() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", m149728d());
        return intent;
    }

    /* renamed from: a */
    public final C48282p mo120637a() {
        return m149726a(Collections.emptyMap());
    }

    /* renamed from: c */
    private JSONObject m149727c() {
        JSONObject jSONObject = new JSONObject();
        C48272l.m149773a(jSONObject, "request", this.f123273b.mo120625b());
        C48272l.m149775b(jSONObject, "state", this.f123274c);
        C48272l.m149775b(jSONObject, "token_type", this.f123275d);
        C48272l.m149775b(jSONObject, "code", this.f123276e);
        C48272l.m149775b(jSONObject, "access_token", this.f123277f);
        C48272l.m149771a(jSONObject, "expires_at", this.f123278g);
        C48272l.m149775b(jSONObject, "id_token", this.f123279h);
        C48272l.m149775b(jSONObject, "scope", this.f123280i);
        C48272l.m149773a(jSONObject, "additional_parameters", C48272l.m149768a(this.f123281j));
        return jSONObject;
    }

    /* renamed from: a */
    private static C48262f m149724a(String str) throws JSONException {
        return m149725a(new JSONObject(str));
    }

    /* renamed from: a */
    public static C48262f m149723a(Intent intent) {
        C48280n.m149789a(intent, (Object) "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return m149724a(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e);
        }
    }

    /* renamed from: a */
    private static C48262f m149725a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("request")) {
            return new C48264a(C48259e.m149703a(jSONObject.getJSONObject("request"))).mo120644b(C48272l.m149774b(jSONObject, "token_type")).mo120646d(C48272l.m149774b(jSONObject, "access_token")).mo120645c(C48272l.m149774b(jSONObject, "code")).mo120647e(C48272l.m149774b(jSONObject, "id_token")).mo120648f(C48272l.m149774b(jSONObject, "scope")).mo120641a(C48272l.m149774b(jSONObject, "state")).mo120640a(C48272l.m149778e(jSONObject, "expires_at")).mo120642a(C48272l.m149779f(jSONObject, "additional_parameters")).mo120643a();
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    /* renamed from: a */
    private C48282p m149726a(Map<String, String> map) {
        C48280n.m149789a(map, (Object) "additionalExchangeParameters cannot be null");
        if (this.f123276e != null) {
            return new C48284a(this.f123273b.f123244b, this.f123273b.f123245c).mo120659a("authorization_code").mo120658a(this.f123273b.f123250h).mo120665e(this.f123273b.f123253k).mo120663c(this.f123276e).mo120660a(map).mo120661a();
        }
        throw new IllegalStateException("authorizationCode not available for exchange request");
    }

    private C48262f(C48259e eVar, String str, String str2, String str3, String str4, Long l, String str5, String str6, Map<String, String> map) {
        this.f123273b = eVar;
        this.f123274c = str;
        this.f123275d = str2;
        this.f123276e = str3;
        this.f123277f = str4;
        this.f123278g = l;
        this.f123279h = str5;
        this.f123280i = str6;
        this.f123281j = map;
    }
}
