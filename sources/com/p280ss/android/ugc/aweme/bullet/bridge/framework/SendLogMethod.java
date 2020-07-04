package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6906g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod */
public final class SendLogMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23597a f62263c = new C23597a(null);

    /* renamed from: d */
    private final String f62264d = "sendLog";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod$a */
    public static final class C23597a {
        private C23597a() {
        }

        public /* synthetic */ C23597a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62264d;
    }

    public SendLogMethod(C10403b bVar) {
        Access access;
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
        if (C6399b.m19944t()) {
            access = Access.PUBLIC;
        } else {
            access = Access.PROTECT;
        }
        mo25139a(access);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        m77474b(jSONObject, aVar);
    }

    /* renamed from: b */
    private final void m77474b(JSONObject jSONObject, C23565a aVar) throws Exception {
        long j;
        if (jSONObject == null) {
            aVar.mo61493a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        String optString2 = jSONObject.optString("labelName");
        String optString3 = jSONObject.optString("value");
        String optString4 = jSONObject.optString("extValue");
        JSONObject optJSONObject = jSONObject.optJSONObject("extJson");
        long j2 = 0;
        if (!TextUtils.isEmpty(optString3)) {
            j = Long.parseLong(optString3);
        } else {
            j = 0;
        }
        if (!TextUtils.isEmpty(optString4)) {
            j2 = Long.parseLong(optString4);
        }
        long j3 = j2;
        if (this.f28552b != null) {
            if (TextUtils.equals("click", optString2)) {
                C24976t.m82084a(optString, optString3, j3, optJSONObject);
                optJSONObject.put("has_v3", 1);
            }
            C6906g.m21513a(this.f28552b, optString, optString2, j, j3, optJSONObject);
            aVar.mo61494a((Object) new C6711m());
            return;
        }
        aVar.mo61493a(0, "");
    }
}
