package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class AuthorizationServiceDiscovery {

    /* renamed from: A */
    static final C48278f f123182A = m149657b("service_documentation");

    /* renamed from: B */
    static final C48277e f123183B = m149658c("claims_locales_supported");

    /* renamed from: C */
    static final C48277e f123184C = m149658c("ui_locales_supported");

    /* renamed from: D */
    static final C48273a f123185D = m149654a("claims_parameter_supported", false);

    /* renamed from: E */
    static final C48273a f123186E = m149654a("request_parameter_supported", false);

    /* renamed from: F */
    static final C48273a f123187F = m149654a("request_uri_parameter_supported", true);

    /* renamed from: G */
    static final C48273a f123188G = m149654a("require_request_uri_registration", false);

    /* renamed from: H */
    static final C48278f f123189H = m149657b("op_policy_uri");

    /* renamed from: I */
    static final C48278f f123190I = m149657b("op_tos_uri");

    /* renamed from: K */
    private static final List<String> f123191K = Arrays.asList(new String[]{f123192a.f123306a, f123193b.f123306a, f123196e.f123306a, f123199h.f123308a, f123203l.f123308a, f123204m.f123308a});

    /* renamed from: a */
    static final C48276d f123192a = m149655a("issuer");

    /* renamed from: b */
    static final C48278f f123193b = m149657b("authorization_endpoint");

    /* renamed from: c */
    static final C48278f f123194c = m149657b("token_endpoint");

    /* renamed from: d */
    static final C48278f f123195d = m149657b("userinfo_endpoint");

    /* renamed from: e */
    static final C48278f f123196e = m149657b("jwks_uri");

    /* renamed from: f */
    static final C48278f f123197f = m149657b("registration_endpoint");

    /* renamed from: g */
    static final C48277e f123198g = m149658c("scopes_supported");

    /* renamed from: h */
    static final C48277e f123199h = m149658c("response_types_supported");

    /* renamed from: i */
    static final C48277e f123200i = m149658c("response_modes_supported");

    /* renamed from: j */
    static final C48277e f123201j = m149656a("grant_types_supported", Arrays.asList(new String[]{"authorization_code", "implicit"}));

    /* renamed from: k */
    static final C48277e f123202k = m149658c("acr_values_supported");

    /* renamed from: l */
    static final C48277e f123203l = m149658c("subject_types_supported");

    /* renamed from: m */
    static final C48277e f123204m = m149658c("id_token_signing_alg_values_supported");

    /* renamed from: n */
    static final C48277e f123205n = m149658c("id_token_encryption_enc_values_supported");

    /* renamed from: o */
    static final C48277e f123206o = m149658c("id_token_encryption_enc_values_supported");

    /* renamed from: p */
    static final C48277e f123207p = m149658c("userinfo_signing_alg_values_supported");

    /* renamed from: q */
    static final C48277e f123208q = m149658c("userinfo_encryption_alg_values_supported");

    /* renamed from: r */
    static final C48277e f123209r = m149658c("userinfo_encryption_enc_values_supported");

    /* renamed from: s */
    static final C48277e f123210s = m149658c("request_object_signing_alg_values_supported");

    /* renamed from: t */
    static final C48277e f123211t = m149658c("request_object_encryption_alg_values_supported");

    /* renamed from: u */
    static final C48277e f123212u = m149658c("request_object_encryption_enc_values_supported");

    /* renamed from: v */
    static final C48277e f123213v = m149656a("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));

    /* renamed from: w */
    static final C48277e f123214w = m149658c("token_endpoint_auth_signing_alg_values_supported");

    /* renamed from: x */
    static final C48277e f123215x = m149658c("display_values_supported");

    /* renamed from: y */
    static final C48277e f123216y = m149656a("claim_types_supported", Collections.singletonList("normal"));

    /* renamed from: z */
    static final C48277e f123217z = m149658c("claims_supported");

    /* renamed from: J */
    public final JSONObject f123218J;

    public static class MissingArgumentException extends Exception {
        private String mMissingField;

        public String getMissingField() {
            return this.mMissingField;
        }

        public MissingArgumentException(String str) {
            StringBuilder sb = new StringBuilder("Missing mandatory configuration field: ");
            sb.append(str);
            super(sb.toString());
            this.mMissingField = str;
        }
    }

    /* renamed from: b */
    public final Uri mo120608b() {
        return (Uri) m149653a((C48274b<T>) f123194c);
    }

    /* renamed from: c */
    public final Uri mo120609c() {
        return (Uri) m149653a((C48274b<T>) f123197f);
    }

    /* renamed from: a */
    public final Uri mo120607a() {
        return (Uri) m149653a((C48274b<T>) f123193b);
    }

    /* renamed from: a */
    private <T> T m149653a(C48274b<T> bVar) {
        return C48272l.m149766a(this.f123218J, bVar);
    }

    /* renamed from: b */
    private static C48278f m149657b(String str) {
        return new C48278f(str);
    }

    /* renamed from: c */
    private static C48277e m149658c(String str) {
        return new C48277e(str);
    }

    /* renamed from: a */
    private static C48276d m149655a(String str) {
        return new C48276d(str);
    }

    public AuthorizationServiceDiscovery(JSONObject jSONObject) throws JSONException, MissingArgumentException {
        this.f123218J = (JSONObject) C48280n.m149788a(jSONObject);
        for (String str : f123191K) {
            if (this.f123218J.has(str)) {
                if (this.f123218J.get(str) == null) {
                }
            }
            throw new MissingArgumentException(str);
        }
    }

    /* renamed from: a */
    private static C48273a m149654a(String str, boolean z) {
        return new C48273a(str, z);
    }

    /* renamed from: a */
    private static C48277e m149656a(String str, List<String> list) {
        return new C48277e(str, list);
    }
}
