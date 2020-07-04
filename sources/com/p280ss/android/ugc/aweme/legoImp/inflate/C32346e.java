package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.framwork.core.monitor.C6379c;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.e */
public final class C32346e {
    /* renamed from: a */
    private static void m104914a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C6379c.m19826a(str, jSONObject);
    }

    /* renamed from: a */
    public static View m104913a(String str, View view, Context context, int i) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("type=");
        sb2.append(view.getClass().getName());
        sb2.append("\n");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("id=");
        sb3.append(view.getId());
        sb3.append("\n");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append("childCount=");
        sb4.append(((ViewGroup) view).getChildCount());
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append("isX2COpen=");
        sb5.append(C32348g.m104915a());
        sb.append(sb5.toString());
        C6921a.m21555a(sb.toString());
        m104914a("x2c_error", "", C6869c.m21381a().mo16887a("x2c_error", sb.toString()).mo16888b());
        if (i != 0) {
            return LayoutInflater.from(context).inflate(i, null);
        }
        return null;
    }
}
