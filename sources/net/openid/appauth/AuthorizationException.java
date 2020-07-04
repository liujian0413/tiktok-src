package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.support.p022v4.util.ArrayMap;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.Collections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class AuthorizationException extends Exception {
    public final int code;
    public final String error;
    public final String errorDescription;
    public final Uri errorUri;
    public final int type;

    /* renamed from: net.openid.appauth.AuthorizationException$a */
    public static final class C48238a {

        /* renamed from: a */
        public static final AuthorizationException f123149a = AuthorizationException.authEx(1000, "invalid_request");

        /* renamed from: b */
        public static final AuthorizationException f123150b = AuthorizationException.authEx(1001, "unauthorized_client");

        /* renamed from: c */
        public static final AuthorizationException f123151c = AuthorizationException.authEx(1002, "access_denied");

        /* renamed from: d */
        public static final AuthorizationException f123152d = AuthorizationException.authEx(1003, "unsupported_response_type");

        /* renamed from: e */
        public static final AuthorizationException f123153e = AuthorizationException.authEx(LiveRoomStruct.ROOM_LONGTIME_NO_NET, "invalid_scope");

        /* renamed from: f */
        public static final AuthorizationException f123154f = AuthorizationException.authEx(1005, "server_error");

        /* renamed from: g */
        public static final AuthorizationException f123155g = AuthorizationException.authEx(1006, "temporarily_unavailable");

        /* renamed from: h */
        public static final AuthorizationException f123156h = AuthorizationException.authEx(1007, null);

        /* renamed from: i */
        public static final AuthorizationException f123157i = AuthorizationException.authEx(1008, null);

        /* renamed from: j */
        public static final AuthorizationException f123158j = AuthorizationException.generalEx(9, "Response state param did not match request state");

        /* renamed from: k */
        private static final Map<String, AuthorizationException> f123159k = AuthorizationException.exceptionMapByString(f123149a, f123150b, f123151c, f123152d, f123153e, f123154f, f123155g, f123156h, f123157i);

        /* renamed from: a */
        public static AuthorizationException m149642a(String str) {
            AuthorizationException authorizationException = (AuthorizationException) f123159k.get(str);
            if (authorizationException != null) {
                return authorizationException;
            }
            return f123157i;
        }
    }

    /* renamed from: net.openid.appauth.AuthorizationException$b */
    public static final class C48239b {

        /* renamed from: a */
        public static final AuthorizationException f123160a = AuthorizationException.generalEx(0, "Invalid discovery document");

        /* renamed from: b */
        public static final AuthorizationException f123161b = AuthorizationException.generalEx(1, "User cancelled flow");

        /* renamed from: c */
        public static final AuthorizationException f123162c = AuthorizationException.generalEx(2, "Flow cancelled programmatically");

        /* renamed from: d */
        public static final AuthorizationException f123163d = AuthorizationException.generalEx(3, "Network error");

        /* renamed from: e */
        public static final AuthorizationException f123164e = AuthorizationException.generalEx(4, "Server error");

        /* renamed from: f */
        public static final AuthorizationException f123165f = AuthorizationException.generalEx(5, "JSON deserialization error");

        /* renamed from: g */
        public static final AuthorizationException f123166g = AuthorizationException.generalEx(6, "Token response construction error");

        /* renamed from: h */
        public static final AuthorizationException f123167h = AuthorizationException.generalEx(7, "Invalid registration response");
    }

    /* renamed from: net.openid.appauth.AuthorizationException$c */
    public static final class C48240c {

        /* renamed from: a */
        public static final AuthorizationException f123168a = AuthorizationException.tokenEx(AdError.SERVER_ERROR_CODE, "invalid_request");

        /* renamed from: b */
        public static final AuthorizationException f123169b = AuthorizationException.tokenEx(AdError.INTERNAL_ERROR_CODE, "invalid_client");

        /* renamed from: c */
        public static final AuthorizationException f123170c = AuthorizationException.tokenEx(AdError.CACHE_ERROR_CODE, "invalid_grant");

        /* renamed from: d */
        public static final AuthorizationException f123171d = AuthorizationException.tokenEx(AdError.INTERNAL_ERROR_2003, "unauthorized_client");

        /* renamed from: e */
        public static final AuthorizationException f123172e = AuthorizationException.tokenEx(AdError.INTERNAL_ERROR_2004, "unsupported_grant_type");

        /* renamed from: f */
        public static final AuthorizationException f123173f = AuthorizationException.tokenEx(2005, "invalid_scope");

        /* renamed from: g */
        public static final AuthorizationException f123174g = AuthorizationException.tokenEx(AdError.INTERNAL_ERROR_2006, null);

        /* renamed from: h */
        public static final AuthorizationException f123175h = AuthorizationException.tokenEx(2007, null);

        /* renamed from: i */
        private static final Map<String, AuthorizationException> f123176i = AuthorizationException.exceptionMapByString(f123168a, f123169b, f123170c, f123171d, f123172e, f123173f, f123174g, f123175h);

        /* renamed from: a */
        public static AuthorizationException m149643a(String str) {
            AuthorizationException authorizationException = (AuthorizationException) f123176i.get(str);
            if (authorizationException != null) {
                return authorizationException;
            }
            return f123175h;
        }
    }

    public final int hashCode() {
        return ((this.type + 31) * 31) + this.code;
    }

    public final Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", toJsonString());
        return intent;
    }

    public final String toJsonString() {
        return toJson().toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizationException: ");
        sb.append(toJsonString());
        return sb.toString();
    }

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        C48272l.m149769a(jSONObject, "type", this.type);
        C48272l.m149769a(jSONObject, "code", this.code);
        C48272l.m149775b(jSONObject, "error", this.error);
        C48272l.m149775b(jSONObject, "errorDescription", this.errorDescription);
        C48272l.m149770a(jSONObject, "errorUri", this.errorUri);
        return jSONObject;
    }

    public static AuthorizationException fromJson(String str) throws JSONException {
        C48280n.m149790a(str, (Object) "jsonStr cannot be null or empty");
        return fromJson(new JSONObject(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthorizationException)) {
            return false;
        }
        AuthorizationException authorizationException = (AuthorizationException) obj;
        if (this.type == authorizationException.type && this.code == authorizationException.code) {
            return true;
        }
        return false;
    }

    public static Map<String, AuthorizationException> exceptionMapByString(AuthorizationException... authorizationExceptionArr) {
        int i;
        if (authorizationExceptionArr != null) {
            i = authorizationExceptionArr.length;
        } else {
            i = 0;
        }
        ArrayMap arrayMap = new ArrayMap(i);
        if (authorizationExceptionArr != null) {
            for (AuthorizationException authorizationException : authorizationExceptionArr) {
                if (authorizationException.error != null) {
                    arrayMap.put(authorizationException.error, authorizationException);
                }
            }
        }
        return Collections.unmodifiableMap(arrayMap);
    }

    public static AuthorizationException fromIntent(Intent intent) {
        C48280n.m149788a(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return fromJson(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e);
        }
    }

    public static AuthorizationException fromJson(JSONObject jSONObject) throws JSONException {
        C48280n.m149789a(jSONObject, (Object) "json cannot be null");
        AuthorizationException authorizationException = new AuthorizationException(jSONObject.getInt("type"), jSONObject.getInt("code"), C48272l.m149774b(jSONObject, "error"), C48272l.m149774b(jSONObject, "errorDescription"), C48272l.m149777d(jSONObject, "errorUri"), null);
        return authorizationException;
    }

    public static AuthorizationException fromOAuthRedirect(Uri uri) {
        Uri uri2;
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        AuthorizationException a = C48238a.m149642a(queryParameter);
        int i = a.type;
        int i2 = a.code;
        if (queryParameter2 == null) {
            queryParameter2 = a.errorDescription;
        }
        String str = queryParameter2;
        if (queryParameter3 != null) {
            uri2 = Uri.parse(queryParameter3);
        } else {
            uri2 = a.errorUri;
        }
        AuthorizationException authorizationException = new AuthorizationException(i, i2, queryParameter, str, uri2, null);
        return authorizationException;
    }

    public static AuthorizationException authEx(int i, String str) {
        AuthorizationException authorizationException = new AuthorizationException(1, i, str, null, null, null);
        return authorizationException;
    }

    public static AuthorizationException generalEx(int i, String str) {
        AuthorizationException authorizationException = new AuthorizationException(0, i, null, str, null, null);
        return authorizationException;
    }

    public static AuthorizationException registrationEx(int i, String str) {
        AuthorizationException authorizationException = new AuthorizationException(4, i, str, null, null, null);
        return authorizationException;
    }

    public static AuthorizationException tokenEx(int i, String str) {
        AuthorizationException authorizationException = new AuthorizationException(2, i, str, null, null, null);
        return authorizationException;
    }

    public static AuthorizationException fromTemplate(AuthorizationException authorizationException, Throwable th) {
        AuthorizationException authorizationException2 = new AuthorizationException(authorizationException.type, authorizationException.code, authorizationException.error, authorizationException.errorDescription, authorizationException.errorUri, th);
        return authorizationException2;
    }

    public static AuthorizationException fromOAuthTemplate(AuthorizationException authorizationException, String str, String str2, Uri uri) {
        int i = authorizationException.type;
        int i2 = authorizationException.code;
        if (str == null) {
            str = authorizationException.error;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = authorizationException.errorDescription;
        }
        String str4 = str2;
        if (uri == null) {
            uri = authorizationException.errorUri;
        }
        AuthorizationException authorizationException2 = new AuthorizationException(i, i2, str3, str4, uri, null);
        return authorizationException2;
    }

    public AuthorizationException(int i, int i2, String str, String str2, Uri uri, Throwable th) {
        super(str2, th);
        this.type = i;
        this.code = i2;
        this.error = str;
        this.errorDescription = str2;
        this.errorUri = uri;
    }
}
