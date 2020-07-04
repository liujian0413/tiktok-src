package com.p280ss.android.sdk.webview.p901b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.C22912d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.b */
public final class C20130b implements C11093e {

    /* renamed from: a */
    private WeakReference<Context> f54506a;

    public C20130b(WeakReference<Context> weakReference) {
        this.f54506a = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        m66366a(iVar.f30171d, jSONObject);
    }

    /* renamed from: a */
    private boolean m66366a(JSONObject jSONObject, JSONObject jSONObject2) throws Exception {
        Context context;
        int i = -1;
        if (jSONObject == null) {
            jSONObject2.put("installed", -1);
            return true;
        }
        String optString = jSONObject.optString("pkg_name");
        String optString2 = jSONObject.optString(C22912d.f60642b);
        if (this.f54506a != null) {
            context = (Context) this.f54506a.get();
        } else {
            context = null;
        }
        if (context != null) {
            if (!TextUtils.isEmpty(optString)) {
                if (C6776h.m20948b(context, optString)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i != 1 && !TextUtils.isEmpty(optString2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString2));
                if (C6776h.m20944a(context, intent)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
        }
        jSONObject2.put("installed", i);
        return true;
    }
}
