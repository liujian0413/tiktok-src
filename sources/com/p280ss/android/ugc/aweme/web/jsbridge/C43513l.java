package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import com.p280ss.android.ugc.aweme.base.C23365o;
import com.p280ss.android.ugc.aweme.legacy.download.C32335d;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.l */
public final class C43513l extends C20133e {
    public final void open(JSONObject jSONObject) {
    }

    public C43513l(WeakReference<Context> weakReference) {
        super(weakReference);
    }

    /* renamed from: a */
    private void m137990a(final String str, final String str2) {
        final Activity g = C6405d.m19984g();
        if (g != null) {
            C23365o.m74364a(g, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                /* renamed from: a */
                public final void mo53549a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        C32335d.m104900a(str, str2, g, true, null);
                    }
                }
            });
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        super.call(iVar, jSONObject);
        JSONObject jSONObject2 = iVar.f30171d;
        m137990a(jSONObject2.optString("download_url"), jSONObject2.optString("app_name"));
    }
}
