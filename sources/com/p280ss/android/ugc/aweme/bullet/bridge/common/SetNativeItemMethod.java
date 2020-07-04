package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod */
public final class SetNativeItemMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23579a f62203c = new C23579a(null);

    /* renamed from: d */
    private final String f62204d = "setNativeItem";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod$a */
    public static final class C23579a {
        private C23579a() {
        }

        public /* synthetic */ C23579a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62204d;
    }

    public SetNativeItemMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        try {
            if (C27870d.m91297a().mo71349a(jSONObject.getString("key"), (Object) jSONObject.getString("value"))) {
                aVar.mo61494a((Object) null);
            } else {
                aVar.mo61493a(-1, "");
            }
        } catch (Exception unused) {
            aVar.mo61493a(-1, "");
        }
    }
}
