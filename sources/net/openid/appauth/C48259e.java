package net.openid.appauth;

import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import net.openid.appauth.p1889c.C48257b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.e */
public final class C48259e {

    /* renamed from: a */
    public static final Set<String> f123243a = C48241a.m149666a("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "redirect_uri", "response_mode", "response_type", "scope", "state");

    /* renamed from: b */
    public final C48269i f123244b;

    /* renamed from: c */
    public final String f123245c;

    /* renamed from: d */
    public final String f123246d;

    /* renamed from: e */
    public final String f123247e;

    /* renamed from: f */
    public final String f123248f;

    /* renamed from: g */
    public final String f123249g;

    /* renamed from: h */
    public final Uri f123250h;

    /* renamed from: i */
    public final String f123251i;

    /* renamed from: j */
    public final String f123252j;

    /* renamed from: k */
    public final String f123253k;

    /* renamed from: l */
    public final String f123254l;

    /* renamed from: m */
    public final String f123255m;

    /* renamed from: n */
    public final String f123256n;

    /* renamed from: o */
    public final Map<String, String> f123257o;

    /* renamed from: net.openid.appauth.e$a */
    public static final class C48261a {

        /* renamed from: a */
        private C48269i f123258a;

        /* renamed from: b */
        private String f123259b;

        /* renamed from: c */
        private String f123260c;

        /* renamed from: d */
        private String f123261d;

        /* renamed from: e */
        private String f123262e;

        /* renamed from: f */
        private String f123263f;

        /* renamed from: g */
        private Uri f123264g;

        /* renamed from: h */
        private String f123265h;

        /* renamed from: i */
        private String f123266i;

        /* renamed from: j */
        private String f123267j;

        /* renamed from: k */
        private String f123268k;

        /* renamed from: l */
        private String f123269l;

        /* renamed from: m */
        private String f123270m;

        /* renamed from: n */
        private Map<String, String> f123271n = new HashMap();

        /* renamed from: a */
        public final C48259e mo120632a() {
            C48259e eVar = new C48259e(this.f123258a, this.f123259b, this.f123263f, this.f123264g, this.f123260c, this.f123261d, this.f123262e, this.f123265h, this.f123266i, this.f123267j, this.f123268k, this.f123269l, this.f123270m, Collections.unmodifiableMap(new HashMap(this.f123271n)));
            return eVar;
        }

        /* renamed from: a */
        public final C48261a mo120627a(Iterable<String> iterable) {
            this.f123265h = C48253c.m149682a(iterable);
            return this;
        }

        /* renamed from: e */
        public final C48261a mo120636e(String str) {
            C48280n.m149793b(str, "responseMode must not be empty");
            this.f123270m = str;
            return this;
        }

        /* renamed from: a */
        private C48261a m149708a(Uri uri) {
            this.f123264g = (Uri) C48280n.m149789a(uri, (Object) "redirect URI cannot be null or empty");
            return this;
        }

        /* renamed from: f */
        private C48261a m149710f(String str) {
            this.f123259b = C48280n.m149790a(str, (Object) "client ID cannot be null or empty");
            return this;
        }

        /* renamed from: g */
        private C48261a m149711g(String str) {
            this.f123263f = C48280n.m149790a(str, (Object) "expected response type cannot be null or empty");
            return this;
        }

        /* renamed from: b */
        public final C48261a mo120633b(String str) {
            this.f123261d = C48280n.m149793b(str, "login hint must be null or not empty");
            return this;
        }

        /* renamed from: c */
        public final C48261a mo120634c(String str) {
            this.f123262e = C48280n.m149793b(str, "prompt must be null or non-empty");
            return this;
        }

        /* renamed from: d */
        public final C48261a mo120635d(String str) {
            this.f123266i = C48280n.m149793b(str, "state cannot be empty if defined");
            return this;
        }

        /* renamed from: a */
        private C48261a m149709a(C48269i iVar) {
            this.f123258a = (C48269i) C48280n.m149789a(iVar, (Object) "configuration cannot be null");
            return this;
        }

        /* renamed from: h */
        private C48261a m149712h(String str) {
            if (str != null) {
                C48271k.m149763a(str);
                this.f123267j = str;
                this.f123268k = C48271k.m149765b(str);
                this.f123269l = C48271k.m149764b();
            } else {
                this.f123267j = null;
                this.f123268k = null;
                this.f123269l = null;
            }
            return this;
        }

        /* renamed from: a */
        public final C48261a mo120628a(String str) {
            this.f123260c = C48280n.m149793b(str, "display must be null or not empty");
            return this;
        }

        /* renamed from: a */
        public final C48261a mo120630a(Map<String, String> map) {
            this.f123271n = C48241a.m149664a(map, C48259e.f123243a);
            return this;
        }

        /* renamed from: a */
        public final C48261a mo120631a(String... strArr) {
            mo120627a((Iterable<String>) Arrays.asList(strArr));
            return this;
        }

        /* renamed from: a */
        public final C48261a mo120629a(String str, String str2, String str3) {
            boolean z;
            if (str != null) {
                C48271k.m149763a(str);
                C48280n.m149790a(str2, (Object) "code verifier challenge cannot be null or empty if verifier is set");
                C48280n.m149790a(str3, (Object) "code verifier challenge method cannot be null or empty if verifier is set");
            } else {
                boolean z2 = false;
                if (str2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                C48280n.m149791a(z, (Object) "code verifier challenge must be null if verifier is null");
                if (str3 == null) {
                    z2 = true;
                }
                C48280n.m149791a(z2, (Object) "code verifier challenge method must be null if verifier is null");
            }
            this.f123267j = str;
            this.f123268k = str2;
            this.f123269l = str3;
            return this;
        }

        public C48261a(C48269i iVar, String str, String str2, Uri uri) {
            m149709a(iVar);
            m149710f(str);
            m149711g(str2);
            m149708a(uri);
            mo120635d(C48259e.m149704d());
            m149712h(C48271k.m149761a());
        }
    }

    /* renamed from: c */
    public final String mo120626c() {
        return mo120625b().toString();
    }

    /* renamed from: d */
    public static String m149704d() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    public final JSONObject mo120625b() {
        JSONObject jSONObject = new JSONObject();
        C48272l.m149773a(jSONObject, "configuration", this.f123244b.mo120654a());
        C48272l.m149772a(jSONObject, "clientId", this.f123245c);
        C48272l.m149772a(jSONObject, "responseType", this.f123249g);
        C48272l.m149772a(jSONObject, "redirectUri", this.f123250h.toString());
        C48272l.m149775b(jSONObject, "display", this.f123246d);
        C48272l.m149775b(jSONObject, "login_hint", this.f123247e);
        C48272l.m149775b(jSONObject, "scope", this.f123251i);
        C48272l.m149775b(jSONObject, "prompt", this.f123248f);
        C48272l.m149775b(jSONObject, "state", this.f123252j);
        C48272l.m149775b(jSONObject, "codeVerifier", this.f123253k);
        C48272l.m149775b(jSONObject, "codeVerifierChallenge", this.f123254l);
        C48272l.m149775b(jSONObject, "codeVerifierChallengeMethod", this.f123255m);
        C48272l.m149775b(jSONObject, "responseMode", this.f123256n);
        C48272l.m149773a(jSONObject, "additionalParameters", C48272l.m149768a(this.f123257o));
        return jSONObject;
    }

    /* renamed from: a */
    public final Uri mo120624a() {
        Builder appendQueryParameter = this.f123244b.f123301a.buildUpon().appendQueryParameter("redirect_uri", this.f123250h.toString()).appendQueryParameter("client_id", this.f123245c).appendQueryParameter("response_type", this.f123249g);
        C48257b.m149699a(appendQueryParameter, "display", this.f123246d);
        C48257b.m149699a(appendQueryParameter, "login_hint", this.f123247e);
        C48257b.m149699a(appendQueryParameter, "prompt", this.f123248f);
        C48257b.m149699a(appendQueryParameter, "state", this.f123252j);
        C48257b.m149699a(appendQueryParameter, "scope", this.f123251i);
        C48257b.m149699a(appendQueryParameter, "response_mode", this.f123256n);
        if (this.f123253k != null) {
            appendQueryParameter.appendQueryParameter("code_challenge", this.f123254l).appendQueryParameter("code_challenge_method", this.f123255m);
        }
        for (Entry entry : this.f123257o.entrySet()) {
            appendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return appendQueryParameter.build();
    }

    /* renamed from: a */
    public static C48259e m149702a(String str) throws JSONException {
        C48280n.m149789a(str, (Object) "json string cannot be null");
        return m149703a(new JSONObject(str));
    }

    /* renamed from: a */
    public static C48259e m149703a(JSONObject jSONObject) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json cannot be null");
        C48261a a = new C48261a(C48269i.m149758a(jSONObject.getJSONObject("configuration")), C48272l.m149767a(jSONObject, "clientId"), C48272l.m149767a(jSONObject, "responseType"), C48272l.m149776c(jSONObject, "redirectUri")).mo120628a(C48272l.m149774b(jSONObject, "display")).mo120633b(C48272l.m149774b(jSONObject, "login_hint")).mo120634c(C48272l.m149774b(jSONObject, "prompt")).mo120635d(C48272l.m149774b(jSONObject, "state")).mo120629a(C48272l.m149774b(jSONObject, "codeVerifier"), C48272l.m149774b(jSONObject, "codeVerifierChallenge"), C48272l.m149774b(jSONObject, "codeVerifierChallengeMethod")).mo120636e(C48272l.m149774b(jSONObject, "responseMode")).mo120630a(C48272l.m149779f(jSONObject, "additionalParameters"));
        if (jSONObject.has("scope")) {
            a.mo120627a((Iterable<String>) C48253c.m149683a(C48272l.m149767a(jSONObject, "scope")));
        }
        return a.mo120632a();
    }

    private C48259e(C48269i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map<String, String> map) {
        this.f123244b = iVar;
        this.f123245c = str;
        this.f123249g = str2;
        this.f123250h = uri;
        this.f123257o = map;
        this.f123246d = str3;
        this.f123247e = str4;
        this.f123248f = str5;
        this.f123251i = str6;
        this.f123252j = str7;
        this.f123253k = str8;
        this.f123254l = str9;
        this.f123255m = str10;
        this.f123256n = str11;
    }
}
