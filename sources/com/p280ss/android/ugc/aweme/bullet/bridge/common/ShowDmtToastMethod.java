package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import android.content.Context;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod */
public final class ShowDmtToastMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23580a f62205c = new C23580a(null);

    /* renamed from: d */
    private final String f62206d = "showDmtToast";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod$a */
    public static final class C23580a {
        private C23580a() {
        }

        public /* synthetic */ C23580a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62206d;
    }

    public ShowDmtToastMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        if (!jSONObject.has("msg")) {
            aVar.mo61493a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("msg");
        C7573i.m23582a((Object) optString, "params.optString(\"msg\")");
        Context context = this.f28552b;
        if (context != null) {
            C10761a.m31387a(context, optString);
        }
    }
}
