package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p022v4.app.FragmentActivity;
import com.facebook.AccessTokenSource;
import com.facebook.C13499h;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.internal.C13876aa;
import com.facebook.internal.C13967z;
import com.facebook.login.LoginClient.Request;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Creator<CustomTabLoginMethodHandler> CREATOR = new Creator() {
        /* renamed from: a */
        private static CustomTabLoginMethodHandler[] m41482a(int i) {
            return new CustomTabLoginMethodHandler[i];
        }

        /* renamed from: a */
        private static CustomTabLoginMethodHandler m41481a(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m41481a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m41482a(i);
        }
    };

    /* renamed from: c */
    private static final String[] f37148c = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: d */
    private String f37149d;

    /* renamed from: e */
    private String f37150e;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo33721a() {
        return "custom_tab";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo33725c() {
        return "chrome_custom_tab";
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s_ */
    public final AccessTokenSource mo33727s_() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    /* renamed from: e */
    private boolean m41473e() {
        if (m41474f() == null || !C13876aa.m40987c(C13499h.m39721g())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private String m41474f() {
        if (this.f37149d != null) {
            return this.f37149d;
        }
        FragmentActivity a = this.f37240b.mo33770a();
        List<ResolveInfo> queryIntentServices = a.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null) {
            HashSet hashSet = new HashSet(Arrays.asList(f37148c));
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    this.f37149d = serviceInfo.packageName;
                    return this.f37149d;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33722a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f37150e);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f37150e = parcel.readString();
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f37150e = C13967z.m41218a(20);
    }

    /* renamed from: a */
    private boolean m41472a(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f37150e);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33724a(Request request) {
        if (!m41473e()) {
            return false;
        }
        Bundle a = mo33817a(mo33819b(request), request);
        Intent intent = new Intent(this.f37240b.mo33770a(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f34637a, a);
        intent.putExtra(CustomTabMainActivity.f34638b, m41474f());
        this.f37240b.f37192c.startActivityForResult(intent, 1);
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37150e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m41471a(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00b3
            java.lang.String r0 = com.facebook.CustomTabMainActivity.m38239a()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00b3
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C13967z.m41265d(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C13967z.m41265d(r7)
            r0.putAll(r7)
            boolean r7 = r6.m41472a(r0)
            r1 = 0
            if (r7 != 0) goto L_0x0035
            com.facebook.FacebookException r7 = new com.facebook.FacebookException
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>(r0)
            super.mo33818a(r8, r1, r7)
            return
        L_0x0035:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x0043
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x0043:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0051
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0051:
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C13967z.m41249a(r3)
            r5 = -1
            if (r4 != 0) goto L_0x006b
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r3 = -1
        L_0x006c:
            boolean r4 = com.facebook.internal.C13967z.m41249a(r7)
            if (r4 == 0) goto L_0x007e
            boolean r4 = com.facebook.internal.C13967z.m41249a(r2)
            if (r4 == 0) goto L_0x007e
            if (r3 != r5) goto L_0x007e
            super.mo33818a(r8, r0, r1)
            return
        L_0x007e:
            if (r7 == 0) goto L_0x0099
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0099
        L_0x0090:
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo33818a(r8, r1, r7)
            return
        L_0x0099:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00a6
            com.facebook.FacebookOperationCanceledException r7 = new com.facebook.FacebookOperationCanceledException
            r7.<init>()
            super.mo33818a(r8, r1, r7)
            return
        L_0x00a6:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.FacebookServiceException r7 = new com.facebook.FacebookServiceException
            r7.<init>(r0, r2)
            super.mo33818a(r8, r1, r7)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m41471a(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33723a(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo33723a(i, i2, intent);
        }
        Request request = this.f37240b.f37196g;
        if (i2 == -1) {
            m41471a(intent.getStringExtra(CustomTabMainActivity.f34639c), request);
            return true;
        }
        super.mo33818a(request, null, new FacebookOperationCanceledException());
        return false;
    }
}
