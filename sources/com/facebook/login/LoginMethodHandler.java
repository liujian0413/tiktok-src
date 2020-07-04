package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import com.facebook.appevents.C13187j;
import com.facebook.internal.C13967z;
import com.facebook.login.LoginClient.Request;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: a */
    Map<String, String> f37239a;

    /* renamed from: b */
    protected LoginClient f37240b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract String mo33721a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33722a(JSONObject jSONObject) throws JSONException {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33723a(int i, int i2, Intent intent) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo33724a(Request request);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33762b() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo33815d() {
        return false;
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f37240b = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.f37239a = C13967z.m41233a(parcel);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33812a(LoginClient loginClient) {
        if (this.f37240b == null) {
            this.f37240b = loginClient;
            return;
        }
        throw new FacebookException("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33811a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo33721a());
            mo33722a(jSONObject);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    private static String m41612c(String str) throws FacebookException {
        if (str == null || str.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo33814b(String str) {
        String str2 = this.f37240b.f37196g.f37203d;
        C13187j jVar = new C13187j(this.f37240b.mo33770a(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        jVar.mo32367a("fb_dialogs_web_login_dialog_complete", (Double) null, bundle);
    }

    public void writeToParcel(Parcel parcel, int i) {
        C13967z.m41238a(parcel, this.f37239a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33813a(String str, Object obj) {
        String str2;
        if (this.f37239a == null) {
            this.f37239a = new HashMap();
        }
        Map<String, String> map = this.f37239a;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = obj.toString();
        }
        map.put(str, str2);
    }

    /* renamed from: a */
    static AccessToken m41610a(Bundle bundle, AccessTokenSource accessTokenSource, String str) {
        Bundle bundle2 = bundle;
        Date a = C13967z.m41230a(bundle2, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList stringArrayList = bundle2.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle2.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a2 = C13967z.m41230a(bundle2, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (C13967z.m41249a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, bundle2.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, accessTokenSource, a, new Date(), a2);
        return accessToken;
    }

    /* renamed from: a */
    public static AccessToken m41611a(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) throws FacebookException {
        Collection<String> collection2;
        Collection collection3;
        Collection collection4;
        Bundle bundle2 = bundle;
        Date a = C13967z.m41230a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a2 = C13967z.m41230a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        if (!C13967z.m41249a(string2)) {
            collection2 = new ArrayList<>(Arrays.asList(string2.split(",")));
        } else {
            collection2 = collection;
        }
        String string3 = bundle.getString("denied_scopes");
        if (!C13967z.m41249a(string3)) {
            collection3 = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            collection3 = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (!C13967z.m41249a(string4)) {
            collection4 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            collection4 = null;
        }
        if (C13967z.m41249a(string)) {
            return null;
        }
        AccessToken accessToken = new AccessToken(string, str, m41612c(bundle.getString("signed_request")), collection2, collection3, collection4, accessTokenSource, a, new Date(), a2);
        return accessToken;
    }
}
