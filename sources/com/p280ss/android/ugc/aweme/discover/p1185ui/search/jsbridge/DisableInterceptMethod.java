package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27063a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.favorites.viewholder.C27834b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.DisableInterceptMethod */
public final class DisableInterceptMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f71425a;

    public DisableInterceptMethod(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f71425a = weakReference;
    }

    public DisableInterceptMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "jsBridge");
        super(aVar);
        this.f71425a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        boolean z;
        if (jSONObject != null) {
            try {
                boolean z2 = jSONObject.getBoolean("isInterceptTouchEvent");
                C27063a.m88824a(z2);
                C27834b.m91251a(z2);
                JSONObject jSONObject2 = new JSONObject();
                String str = "result";
                if (C27063a.m88826b() == z2) {
                    z = true;
                } else {
                    z = false;
                }
                jSONObject2.put(str, z);
                aVar.mo71363a((Object) jSONObject2);
            } catch (Exception e) {
                C27064b.m88836a(e, "DisableInterceptMethod");
                aVar.mo71362a(0, e.getMessage());
            }
        }
    }
}
