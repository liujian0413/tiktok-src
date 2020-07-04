package net.openid.appauth;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.q */
public final class C48285q {

    /* renamed from: a */
    public static final Set<String> f123331a = new HashSet(Arrays.asList(new String[]{"token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"}));

    /* renamed from: b */
    public final C48282p f123332b;

    /* renamed from: c */
    public final String f123333c;

    /* renamed from: d */
    public final String f123334d;

    /* renamed from: e */
    public final Long f123335e;

    /* renamed from: f */
    public final String f123336f;

    /* renamed from: g */
    public final String f123337g;

    /* renamed from: h */
    public final String f123338h;

    /* renamed from: i */
    public final Map<String, String> f123339i;

    /* renamed from: net.openid.appauth.q$a */
    public static final class C48286a {

        /* renamed from: a */
        private C48282p f123340a;

        /* renamed from: b */
        private String f123341b;

        /* renamed from: c */
        private String f123342c;

        /* renamed from: d */
        private Long f123343d;

        /* renamed from: e */
        private String f123344e;

        /* renamed from: f */
        private String f123345f;

        /* renamed from: g */
        private String f123346g;

        /* renamed from: h */
        private Map<String, String> f123347h = Collections.emptyMap();

        /* renamed from: a */
        public final C48285q mo120667a() {
            C48285q qVar = new C48285q(this.f123340a, this.f123341b, this.f123342c, this.f123343d, this.f123344e, this.f123345f, this.f123346g, this.f123347h);
            return qVar;
        }

        /* renamed from: b */
        private C48286a m149817b(Long l) {
            this.f123343d = l;
            return this;
        }

        /* renamed from: a */
        private C48286a m149810a(Iterable<String> iterable) {
            this.f123346g = C48253c.m149682a(iterable);
            return this;
        }

        public C48286a(C48282p pVar) {
            m149815a(pVar);
        }

        /* renamed from: a */
        private C48286a m149811a(Long l) {
            return m149812a(l, C48281o.f123311a);
        }

        /* renamed from: b */
        private C48286a m149818b(String str) {
            this.f123342c = C48280n.m149793b(str, "access token cannot be empty if specified");
            return this;
        }

        /* renamed from: c */
        private C48286a m149819c(String str) {
            this.f123344e = C48280n.m149793b(str, "id token must not be empty if defined");
            return this;
        }

        /* renamed from: d */
        private C48286a m149820d(String str) {
            this.f123345f = C48280n.m149793b(str, "refresh token must not be empty if defined");
            return this;
        }

        /* renamed from: e */
        private C48286a m149821e(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f123346g = null;
            } else {
                m149816a(str.split(" +"));
            }
            return this;
        }

        /* renamed from: a */
        private C48286a m149813a(String str) {
            this.f123341b = C48280n.m149793b(str, "token type must not be empty if defined");
            return this;
        }

        /* renamed from: a */
        private C48286a m149814a(Map<String, String> map) {
            this.f123347h = C48241a.m149664a(map, C48285q.f123331a);
            return this;
        }

        /* renamed from: a */
        private C48286a m149815a(C48282p pVar) {
            this.f123340a = (C48282p) C48280n.m149789a(pVar, (Object) "request cannot be null");
            return this;
        }

        /* renamed from: a */
        private C48286a m149816a(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            m149810a((Iterable<String>) Arrays.asList(strArr));
            return this;
        }

        /* renamed from: a */
        public final C48286a mo120666a(JSONObject jSONObject) throws JSONException {
            m149813a(C48272l.m149767a(jSONObject, "token_type"));
            m149818b(C48272l.m149774b(jSONObject, "access_token"));
            m149817b(C48272l.m149778e(jSONObject, "expires_at"));
            if (jSONObject.has("expires_in")) {
                m149811a(Long.valueOf(jSONObject.getLong("expires_in")));
            }
            m149820d(C48272l.m149774b(jSONObject, "refresh_token"));
            m149819c(C48272l.m149774b(jSONObject, "id_token"));
            m149821e(C48272l.m149774b(jSONObject, "scope"));
            m149814a(C48241a.m149665a(jSONObject, C48285q.f123331a));
            return this;
        }

        /* renamed from: a */
        private C48286a m149812a(Long l, C48270j jVar) {
            if (l == null) {
                this.f123343d = null;
            } else {
                this.f123343d = Long.valueOf(jVar.mo120655a() + TimeUnit.SECONDS.toMillis(l.longValue()));
            }
            return this;
        }
    }

    C48285q(C48282p pVar, String str, String str2, Long l, String str3, String str4, String str5, Map<String, String> map) {
        this.f123332b = pVar;
        this.f123333c = str;
        this.f123334d = str2;
        this.f123335e = l;
        this.f123336f = str3;
        this.f123337g = str4;
        this.f123338h = str5;
        this.f123339i = map;
    }
}
