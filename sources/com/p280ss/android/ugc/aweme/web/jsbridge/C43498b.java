package com.p280ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.commercialize.p1119c.C24568i;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b */
public final class C43498b implements C11093e {

    /* renamed from: b */
    public static final C43499a f112642b = new C43499a(null);

    /* renamed from: a */
    public final DMTJsBridge f112643a;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.b$a */
    public static final class C43499a {
        private C43499a() {
        }

        public /* synthetic */ C43499a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo105419a() {
        DMTJsBridge dMTJsBridge = this.f112643a;
        if (dMTJsBridge != null) {
            C11093e eVar = this;
            dMTJsBridge.mo53855a("openPanel", eVar);
            dMTJsBridge.mo53855a("openLightLandingPage", eVar);
            dMTJsBridge.mo53855a("closeLightLandingPage", eVar);
        }
    }

    public C43498b(DMTJsBridge dMTJsBridge) {
        this.f112643a = dMTJsBridge;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) {
        if (iVar != null) {
            iVar.f30173f = false;
            String str = iVar.f30170c;
            C7573i.m23582a((Object) str, "msg.func");
            C42961az.m136380a(new C24568i(str, iVar.f30171d, iVar.f30169b, this.f112643a));
        }
    }
}
