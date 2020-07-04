package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod */
public final class MiniAppPreloadMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27897a f73496a = new C27897a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.MiniAppPreloadMethod$a */
    public static final class C27897a {
        private C27897a() {
        }

        public /* synthetic */ C27897a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            if (!jSONObject.has("mini_app_url")) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                C7167b b = C7167b.m22380b();
                C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
                b.mo18647a().preloadMiniApp(jSONObject.optString("mini_app_url"));
            }
        }
    }
}
