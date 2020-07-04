package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.crossplatform.C25881h;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27867b;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod */
public final class GetAppInfoMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23591a f62249c = new C23591a(null);

    /* renamed from: d */
    private final String f62250d = "getAppInfo";

    /* renamed from: e */
    private Access f62251e = Access.PUBLIC;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod$a */
    public static final class C23591a {
        private C23591a() {
        }

        public /* synthetic */ C23591a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62251e;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62250d;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62251e = access;
    }

    public GetAppInfoMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : C27867b.m91292b().entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject2.put("code", C29956a.f78750c);
        jSONObject2.put("app_skin", C25881h.m85148a());
        aVar.mo61495a(jSONObject2);
    }
}
