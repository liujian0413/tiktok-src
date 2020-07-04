package com.p280ss.android.ugc.aweme.bullet;

import com.bytedance.ies.bullet.core.monitor.C10425c;
import com.p280ss.android.ugc.aweme.app.C23016o.C23017a;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.c */
public final class C23602c implements C10425c {

    /* renamed from: a */
    public static final C23602c f62274a = new C23602c();

    private C23602c() {
    }

    /* renamed from: a */
    public final void mo25212a(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        C7573i.m23587b(str, "logType");
        C7573i.m23587b(str2, "service");
        C7573i.m23587b(jSONObject, "category");
        C7573i.m23587b(jSONObject2, "metrics");
        C7573i.m23587b(jSONObject3, "value");
        jSONObject.put("sdk_type", "bullet");
        C23017a.m75671a(str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4);
    }
}
