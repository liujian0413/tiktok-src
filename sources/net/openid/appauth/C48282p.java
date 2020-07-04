package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: net.openid.appauth.p */
public final class C48282p {

    /* renamed from: a */
    public static final Set<String> f123312a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope"})));

    /* renamed from: b */
    public final C48269i f123313b;

    /* renamed from: c */
    public final String f123314c;

    /* renamed from: d */
    public final String f123315d;

    /* renamed from: e */
    public final Uri f123316e;

    /* renamed from: f */
    public final String f123317f;

    /* renamed from: g */
    public final String f123318g;

    /* renamed from: h */
    public final String f123319h;

    /* renamed from: i */
    public final String f123320i;

    /* renamed from: j */
    public final Map<String, String> f123321j;

    /* renamed from: net.openid.appauth.p$a */
    public static final class C48284a {

        /* renamed from: a */
        private C48269i f123322a;

        /* renamed from: b */
        private String f123323b;

        /* renamed from: c */
        private String f123324c;

        /* renamed from: d */
        private Uri f123325d;

        /* renamed from: e */
        private String f123326e;

        /* renamed from: f */
        private String f123327f;

        /* renamed from: g */
        private String f123328g;

        /* renamed from: h */
        private String f123329h;

        /* renamed from: i */
        private Map<String, String> f123330i = new LinkedHashMap();

        /* renamed from: b */
        private String m149800b() {
            if (this.f123324c != null) {
                return this.f123324c;
            }
            if (this.f123327f != null) {
                return "authorization_code";
            }
            if (this.f123328g != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        /* renamed from: a */
        public final C48282p mo120661a() {
            String b = m149800b();
            if ("authorization_code".equals(b)) {
                C48280n.m149789a(this.f123327f, (Object) "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(b)) {
                C48280n.m149789a(this.f123328g, (Object) "refresh token must be specified for grant_type = refresh_token");
            }
            if (!b.equals("authorization_code") || this.f123325d != null) {
                C48282p pVar = new C48282p(this.f123322a, this.f123323b, b, this.f123325d, this.f123326e, this.f123327f, this.f123328g, this.f123329h, Collections.unmodifiableMap(this.f123330i));
                return pVar;
            }
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }

        /* renamed from: a */
        private C48284a m149797a(Iterable<String> iterable) {
            this.f123326e = C48253c.m149682a(iterable);
            return this;
        }

        /* renamed from: c */
        public final C48284a mo120663c(String str) {
            C48280n.m149793b(str, "authorization code must not be empty");
            this.f123327f = str;
            return this;
        }

        /* renamed from: e */
        public final C48284a mo120665e(String str) {
            if (str != null) {
                C48271k.m149763a(str);
            }
            this.f123329h = str;
            return this;
        }

        /* renamed from: a */
        private C48284a m149798a(C48269i iVar) {
            this.f123322a = (C48269i) C48280n.m149788a(iVar);
            return this;
        }

        /* renamed from: f */
        private C48284a m149801f(String str) {
            this.f123323b = C48280n.m149790a(str, (Object) "clientId cannot be null or empty");
            return this;
        }

        /* renamed from: d */
        public final C48284a mo120664d(String str) {
            if (str != null) {
                C48280n.m149790a(str, (Object) "refresh token cannot be empty if defined");
            }
            this.f123328g = str;
            return this;
        }

        /* renamed from: a */
        private C48284a m149799a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            m149797a((Iterable<String>) Arrays.asList(strArr));
            return this;
        }

        /* renamed from: a */
        public final C48284a mo120658a(Uri uri) {
            if (uri != null) {
                C48280n.m149789a(uri.getScheme(), (Object) "redirectUri must have a scheme");
            }
            this.f123325d = uri;
            return this;
        }

        /* renamed from: b */
        public final C48284a mo120662b(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f123326e = null;
            } else {
                m149799a(str.split(" +"));
            }
            return this;
        }

        /* renamed from: a */
        public final C48284a mo120659a(String str) {
            this.f123324c = C48280n.m149790a(str, (Object) "grantType cannot be null or empty");
            return this;
        }

        /* renamed from: a */
        public final C48284a mo120660a(Map<String, String> map) {
            this.f123330i = C48241a.m149664a(map, C48282p.f123312a);
            return this;
        }

        public C48284a(C48269i iVar, String str) {
            m149798a(iVar);
            m149801f(str);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo120657a() {
        HashMap hashMap = new HashMap();
        hashMap.put("grant_type", this.f123315d);
        m149795a(hashMap, "redirect_uri", this.f123316e);
        m149795a(hashMap, "code", this.f123317f);
        m149795a(hashMap, "refresh_token", this.f123319h);
        m149795a(hashMap, "code_verifier", this.f123320i);
        m149795a(hashMap, "scope", this.f123318g);
        for (Entry entry : this.f123321j.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    /* renamed from: a */
    private static void m149795a(Map<String, String> map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    private C48282p(C48269i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map<String, String> map) {
        this.f123313b = iVar;
        this.f123314c = str;
        this.f123315d = str2;
        this.f123316e = uri;
        this.f123318g = str3;
        this.f123317f = str4;
        this.f123319h = str5;
        this.f123320i = str6;
        this.f123321j = map;
    }
}
