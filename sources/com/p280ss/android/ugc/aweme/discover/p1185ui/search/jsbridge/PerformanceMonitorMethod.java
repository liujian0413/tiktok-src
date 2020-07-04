package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.PerformanceMonitorMethod */
public final class PerformanceMonitorMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27071a f71426a = new C27071a(null);

    /* renamed from: b */
    private WeakReference<Context> f71427b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.PerformanceMonitorMethod$a */
    public static final class C27071a {
        private C27071a() {
        }

        public /* synthetic */ C27071a(C7571f fVar) {
            this();
        }
    }

    public PerformanceMonitorMethod(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f71427b = weakReference;
    }

    public PerformanceMonitorMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "jsBridge");
        super(aVar);
        this.f71427b = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("pageName");
                String string2 = jSONObject.getString("logType");
                String string3 = jSONObject.getString("feFlag");
                String string4 = jSONObject.getString("timestamp");
                C7573i.m23582a((Object) string4, "params.getString(\"timestamp\")");
                long parseLong = Long.parseLong(string4);
                if (TextUtils.equals(string2, "pageLoadTime")) {
                    C27064b.m88842c().put(string, Long.valueOf(parseLong));
                } else if (TextUtils.equals(string2, "renderTime")) {
                    C7573i.m23582a((Object) string, "pageName");
                    C7573i.m23582a((Object) string3, "feFlag");
                    C27064b.m88837a(string, parseLong, string3);
                }
            } catch (Exception e) {
                C27064b.m88836a(e, "PerformanceMonitorMethod");
                aVar.mo71362a(0, e.getMessage());
                return;
            }
        }
        aVar.mo71363a((Object) new JSONArray());
    }
}
