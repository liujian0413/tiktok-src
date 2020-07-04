package com.appsflyer;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.q */
final class C1896q extends OneLinkHttpTask {

    /* renamed from: ॱ */
    private static List<String> f6852 = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});

    /* renamed from: ˋ */
    private String f6853;

    /* renamed from: ˎ */
    public C1897e f6854;

    /* renamed from: com.appsflyer.q$e */
    interface C1897e {
        /* renamed from: ˋ */
        void mo7424(String str);

        /* renamed from: ॱ */
        void mo7425(Map<String, String> map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo7457() {
        this.f6854.mo7424("Can't get one link data");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final boolean mo7507() {
        if (TextUtils.isEmpty(this.f6759) || TextUtils.isEmpty(this.f6853)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final String mo7458() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append("/");
        sb.append(this.f6759);
        sb.append("?id=");
        sb.append(this.f6853);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˏ */
    public final void mo7459(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final void mo7456(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.optString(str2));
            }
            this.f6854.mo7425(hashMap);
        } catch (JSONException e) {
            this.f6854.mo7424("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    C1896q(Uri uri, AppsFlyerLib appsFlyerLib) {
        super(appsFlyerLib);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : f6852) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            String[] split = uri.getPath().split("/");
            if (z && split.length == 3) {
                this.f6759 = split[1];
                this.f6853 = split[2];
            }
        }
    }
}
