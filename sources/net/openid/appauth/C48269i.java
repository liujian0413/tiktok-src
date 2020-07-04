package net.openid.appauth;

import android.net.Uri;
import net.openid.appauth.AuthorizationServiceDiscovery.MissingArgumentException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.i */
public final class C48269i {

    /* renamed from: a */
    public final Uri f123301a;

    /* renamed from: b */
    public final Uri f123302b;

    /* renamed from: c */
    public final Uri f123303c;

    /* renamed from: d */
    public final AuthorizationServiceDiscovery f123304d;

    /* renamed from: a */
    public final JSONObject mo120654a() {
        JSONObject jSONObject = new JSONObject();
        C48272l.m149772a(jSONObject, "authorizationEndpoint", this.f123301a.toString());
        C48272l.m149772a(jSONObject, "tokenEndpoint", this.f123302b.toString());
        if (this.f123303c != null) {
            C48272l.m149772a(jSONObject, "registrationEndpoint", this.f123303c.toString());
        }
        if (this.f123304d != null) {
            C48272l.m149773a(jSONObject, "discoveryDoc", this.f123304d.f123218J);
        }
        return jSONObject;
    }

    private C48269i(AuthorizationServiceDiscovery authorizationServiceDiscovery) {
        C48280n.m149789a(authorizationServiceDiscovery, (Object) "docJson cannot be null");
        this.f123304d = authorizationServiceDiscovery;
        this.f123301a = authorizationServiceDiscovery.mo120607a();
        this.f123302b = authorizationServiceDiscovery.mo120608b();
        this.f123303c = authorizationServiceDiscovery.mo120609c();
    }

    /* renamed from: a */
    public static C48269i m149758a(JSONObject jSONObject) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json object cannot be null");
        if (jSONObject.has("discoveryDoc")) {
            try {
                return new C48269i(new AuthorizationServiceDiscovery(jSONObject.optJSONObject("discoveryDoc")));
            } catch (MissingArgumentException e) {
                StringBuilder sb = new StringBuilder("Missing required field in discovery doc: ");
                sb.append(e.getMissingField());
                throw new JSONException(sb.toString());
            }
        } else {
            C48280n.m149791a(jSONObject.has("authorizationEndpoint"), (Object) "missing authorizationEndpoint");
            C48280n.m149791a(jSONObject.has("tokenEndpoint"), (Object) "missing tokenEndpoint");
            return new C48269i(C48272l.m149776c(jSONObject, "authorizationEndpoint"), C48272l.m149776c(jSONObject, "tokenEndpoint"), C48272l.m149777d(jSONObject, "registrationEndpoint"));
        }
    }

    public C48269i(Uri uri, Uri uri2) {
        this(uri, uri2, null);
    }

    private C48269i(Uri uri, Uri uri2, Uri uri3) {
        this.f123301a = (Uri) C48280n.m149788a(uri);
        this.f123302b = (Uri) C48280n.m149788a(uri2);
        this.f123303c = uri3;
        this.f123304d = null;
    }
}
