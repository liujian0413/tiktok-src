package com.p280ss.android.ugc.aweme.p1216fe.method.commerce;

import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoBindMethod */
public final class JumpToTaobaoBindMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27961a f73663a = new C27961a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.commerce.JumpToTaobaoBindMethod$a */
    public static final class C27961a {
        private C27961a() {
        }

        public /* synthetic */ C27961a(C7571f fVar) {
            this();
        }
    }

    public JumpToTaobaoBindMethod() {
        this(null, 1, null);
    }

    public JumpToTaobaoBindMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        int i;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("taobaoUrl")) {
            try {
                ICommerceService a = C24436a.m80356a();
                String optString = jSONObject.optString("taobaoUrl");
                C7573i.m23582a((Object) optString, "params.optString(KEY_TAOBAO_URL)");
                a.goBindTaobao(optString, C6405d.m19984g());
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            i = C29956a.f78750c;
        } else {
            i = C29956a.f78751d;
        }
        aVar.mo71364a(null, i, "");
    }

    private /* synthetic */ JumpToTaobaoBindMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
