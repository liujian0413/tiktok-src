package com.p1848vk.sdk.api;

import android.net.Uri;
import com.C1642a;
import com.p1848vk.sdk.C47217c;
import com.p1848vk.sdk.p1849a.C47107a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.c */
public final class C47121c extends C47217c {

    /* renamed from: a */
    public Exception f120920a;

    /* renamed from: b */
    public C47121c f120921b;

    /* renamed from: c */
    public VKRequest f120922c;

    /* renamed from: d */
    public int f120923d;

    /* renamed from: e */
    public String f120924e;

    /* renamed from: f */
    public String f120925f;

    /* renamed from: g */
    public ArrayList<Map<String, String>> f120926g;

    /* renamed from: h */
    public String f120927h;

    /* renamed from: i */
    public String f120928i;

    /* renamed from: j */
    public String f120929j;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKError (");
        switch (this.f120923d) {
            case -105:
                sb.append("HTTP failed");
                break;
            case -104:
                sb.append("JSON failed");
                break;
            case -103:
                sb.append("Request wasn't prepared");
                break;
            case -102:
                sb.append("Canceled");
                break;
            case -101:
                sb.append("API error");
                if (this.f120921b != null) {
                    sb.append(this.f120921b.toString());
                    break;
                }
                break;
            default:
                sb.append(C1642a.m8034a("code: %d; ", new Object[]{Integer.valueOf(this.f120923d)}));
                break;
        }
        m147350a(sb);
        sb.append(")");
        return sb.toString();
    }

    public C47121c(int i) {
        this.f120923d = i;
    }

    /* renamed from: a */
    public final void mo118414a(String str) {
        VKParameters vKParameters = new VKParameters();
        vKParameters.put("captcha_sid", this.f120927h);
        vKParameters.put("captcha_key", str);
        this.f120922c.mo118389a(vKParameters);
        this.f120922c.mo118398f();
    }

    public C47121c(Map<String, String> map) {
        this.f120923d = -101;
        this.f120925f = (String) map.get("error_reason");
        this.f120924e = Uri.decode((String) map.get("error_description"));
        if (map.containsKey("fail")) {
            this.f120925f = "Action failed";
        }
        if (map.containsKey("cancel")) {
            this.f120923d = -102;
            this.f120925f = "User canceled request";
        }
    }

    /* renamed from: a */
    private void m147350a(StringBuilder sb) {
        if (this.f120925f != null) {
            sb.append(C1642a.m8034a("; %s", new Object[]{this.f120925f}));
        }
        if (this.f120924e != null) {
            sb.append(C1642a.m8034a("; %s", new Object[]{this.f120924e}));
        }
    }

    public C47121c(JSONObject jSONObject) throws JSONException {
        C47121c cVar = new C47121c(jSONObject.getInt("error_code"));
        cVar.f120924e = jSONObject.getString("error_msg");
        cVar.f120926g = (ArrayList) C47107a.m147298a(jSONObject.getJSONArray("request_params"));
        if (cVar.f120923d == 14) {
            cVar.f120928i = jSONObject.getString("captcha_img");
            cVar.f120927h = jSONObject.getString("captcha_sid");
        }
        if (cVar.f120923d == 17) {
            cVar.f120929j = jSONObject.getString("redirect_uri");
        }
        this.f120923d = -101;
        this.f120921b = cVar;
    }
}
