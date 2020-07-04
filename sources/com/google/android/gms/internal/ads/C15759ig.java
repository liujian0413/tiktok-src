package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ig */
public final class C15759ig implements C15742hq<Object> {

    /* renamed from: a */
    private final Object f44511a = new Object();

    /* renamed from: b */
    private final Map<String, C15760ih> f44512b = new HashMap();

    /* renamed from: a */
    public final void mo41652a(String str, C15760ih ihVar) {
        synchronized (this.f44511a) {
            this.f44512b.put(str, ihVar);
        }
    }

    /* renamed from: a */
    public final void mo37744a(Object obj, Map<String, String> map) {
        String str;
        String str2 = (String) map.get("id");
        String str3 = (String) map.get("fail");
        String str4 = (String) map.get("fail_reason");
        String str5 = (String) map.get("fail_stack");
        String str6 = (String) map.get("result");
        if (TextUtils.isEmpty(str5)) {
            str4 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str5)) {
            str = "";
        } else {
            String str7 = "\n";
            String valueOf = String.valueOf(str5);
            str = valueOf.length() != 0 ? str7.concat(valueOf) : new String(str7);
        }
        synchronized (this.f44511a) {
            C15760ih ihVar = (C15760ih) this.f44512b.remove(str2);
            if (ihVar == null) {
                String str8 = "Received result for unexpected method invocation: ";
                String valueOf2 = String.valueOf(str2);
                acd.m45783e(valueOf2.length() != 0 ? str8.concat(valueOf2) : new String(str8));
            } else if (!TextUtils.isEmpty(str3)) {
                String valueOf3 = String.valueOf(str4);
                String valueOf4 = String.valueOf(str);
                ihVar.mo41653a(valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3));
            } else if (str6 == null) {
                ihVar.mo41654a((JSONObject) null);
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(str6);
                    if (acd.m45439a()) {
                        String str9 = "Result GMSG: ";
                        String valueOf5 = String.valueOf(jSONObject.toString(2));
                        acd.m45438a(valueOf5.length() != 0 ? str9.concat(valueOf5) : new String(str9));
                    }
                    ihVar.mo41654a(jSONObject);
                } catch (JSONException e) {
                    ihVar.mo41653a(e.getMessage());
                }
            }
        }
    }
}
