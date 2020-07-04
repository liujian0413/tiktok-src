package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.crossplatform.C25881h;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27867b;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.AppInfoMethod */
public final class AppInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27877a f73451a = new C27877a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.AppInfoMethod$a */
    public static final class C27877a {
        private C27877a() {
        }

        public /* synthetic */ C27877a(C7571f fVar) {
            this();
        }
    }

    public AppInfoMethod() {
        this(null, 1, null);
    }

    public AppInfoMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : C27867b.m91292b().entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject2.put("code", C29956a.f78750c);
        jSONObject2.put("app_skin", C25881h.m85148a());
        aVar.mo71365a(jSONObject2);
    }

    private /* synthetic */ AppInfoMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
