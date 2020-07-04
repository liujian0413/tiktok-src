package com.p280ss.android.sdk.webview.p901b;

import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.c */
public final class C20131c implements C11093e {

    /* renamed from: a */
    private Context f54507a;

    public C20131c(Context context) {
        this.f54507a = context;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        String str;
        if (iVar.f30171d != null) {
            str = iVar.f30171d.optString(C38347c.f99553h);
        } else {
            str = null;
        }
        Context context = this.f54507a;
        int i = 0;
        if (context != null && !C6319n.m19593a(str)) {
            C9700a.m28636a(context, "", str);
            i = 1;
        }
        jSONObject.put("code", i);
    }
}
