package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod */
public final class MonitorLogMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23592a f62252c = new C23592a(null);

    /* renamed from: d */
    private final String f62253d = "monitorLog";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod$a */
    public static final class C23592a {
        private C23592a() {
        }

        public /* synthetic */ C23592a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62253d;
    }

    public MonitorLogMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        if (jSONObject.length() == 0) {
            aVar.mo61493a(0, "params is empty");
            return;
        }
        String optString = jSONObject.optString("log_type");
        CharSequence charSequence = optString;
        if (TextUtils.isEmpty(charSequence)) {
            aVar.mo61493a(0, "log_type is empty");
            return;
        }
        String optString2 = jSONObject.optString("service");
        if (!TextUtils.equals(charSequence, "service_monitor") || !TextUtils.isEmpty(optString2)) {
            JSONObject jSONObject2 = new JSONObject();
            m77461a(jSONObject, jSONObject2, "status");
            m77461a(jSONObject, jSONObject2, "value");
            C6877n.m21407a(optString, optString2, jSONObject2);
            aVar.mo61494a((Object) null);
            return;
        }
        StringBuilder sb = new StringBuilder("service is required while log_type=");
        sb.append(optString);
        aVar.mo61493a(0, sb.toString());
    }

    /* renamed from: a */
    private static void m77461a(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        try {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                jSONObject2.put(str, opt);
            }
        } catch (JSONException e) {
            if (C7163a.m22363a()) {
                C10761a.m31410e(C6399b.m19921a(), e.getMessage()).mo25750a();
            }
        }
    }
}
