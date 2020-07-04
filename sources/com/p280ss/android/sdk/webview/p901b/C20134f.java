package com.p280ss.android.sdk.webview.p901b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.common.util.C6776h;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.f */
public final class C20134f implements C11093e {

    /* renamed from: a */
    private Context f54512a;

    public C20134f(Context context) {
        this.f54512a = context;
    }

    /* renamed from: a */
    private boolean m66368a(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        Intent intent = null;
        if (jSONObject != null) {
            str = jSONObject.optString("pkg_name");
        } else {
            str = null;
        }
        if (jSONObject != null) {
            str2 = jSONObject.optString("pkg_class");
        } else {
            str2 = null;
        }
        Context context = this.f54512a;
        if (context == null || C6319n.m19593a(str)) {
            return false;
        }
        boolean equals = str.equals(context.getPackageName());
        if (!C6319n.m19593a(str2)) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, str2));
            intent2.addFlags(268435456);
            if (C6776h.m20944a(context, intent2)) {
                intent = intent2;
            }
        }
        if (intent == null && equals) {
            return true;
        }
        if (intent == null) {
            intent = C6776h.m20941a(context, str);
        }
        if (intent != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (m66368a(iVar.f30171d)) {
            jSONObject.put("code", 1);
        } else {
            jSONObject.put("code", 0);
        }
    }
}
