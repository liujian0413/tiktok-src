package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.r */
public final class C43521r implements C11093e {

    /* renamed from: a */
    public static final C43522a f112683a = new C43522a(null);

    /* renamed from: b */
    private static final boolean f112684b = C7163a.m22363a();

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.r$a */
    public static final class C43522a {
        private C43522a() {
        }

        public /* synthetic */ C43522a(C7571f fVar) {
            this();
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str = "link_email_event";
        if (iVar != null) {
            jSONObject2 = iVar.f30171d;
        } else {
            jSONObject2 = null;
        }
        C42961az.m136380a(new C27994k(str, jSONObject2));
    }
}
