package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import com.bytedance.ies.bullet.core.kit.bridge.IBridge.Access;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27867b;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod */
public final class AppInfoMethod extends BaseBridge {

    /* renamed from: c */
    public static final C23588a f62241c = new C23588a(null);

    /* renamed from: d */
    private final String f62242d = "appInfo";

    /* renamed from: e */
    private Access f62243e = Access.PUBLIC;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod$a */
    public static final class C23588a {
        private C23588a() {
        }

        public /* synthetic */ C23588a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: b */
    public final Access mo25126b() {
        return this.f62243e;
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62242d;
    }

    /* renamed from: a */
    public final void mo25139a(Access access) {
        C7573i.m23587b(access, "<set-?>");
        this.f62243e = access;
    }

    public AppInfoMethod(C10403b bVar) {
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
        aVar.mo61495a(jSONObject2);
    }
}
