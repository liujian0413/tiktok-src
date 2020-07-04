package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod */
public final class BroadcastMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23570a f62177c = new C23570a(null);

    /* renamed from: d */
    private final String f62178d = "broadcast";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod$a */
    public static final class C23570a {
        private C23570a() {
        }

        public /* synthetic */ C23570a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62178d;
    }

    public BroadcastMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    private void m77390a(JSONObject jSONObject) throws JSONException {
        C7573i.m23587b(jSONObject, "params");
        mo61490a("notification", jSONObject);
        com.p280ss.android.ugc.aweme.p1216fe.method.BroadcastMethod.m91341a(jSONObject);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        try {
            m77390a(jSONObject);
            aVar.mo61494a((Object) "");
        } catch (JSONException unused) {
            aVar.mo61493a(-1, "");
        }
    }
}
