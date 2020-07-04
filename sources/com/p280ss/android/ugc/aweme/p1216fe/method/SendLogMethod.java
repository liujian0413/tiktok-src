package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogMethod */
public final class SendLogMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27926a f73583a = new C27926a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogMethod$a */
    public static final class C27926a {
        private C27926a() {
        }

        public /* synthetic */ C27926a(C7571f fVar) {
            this();
        }
    }

    public SendLogMethod() {
        this(null, 1, null);
    }

    public SendLogMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        m91468b(jSONObject, aVar);
    }

    /* renamed from: b */
    private final void m91468b(JSONObject jSONObject, C27876a aVar) throws Exception {
        long j;
        if (jSONObject != null) {
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
            if (this.f73443f != null) {
                if (TextUtils.equals("click", optString2)) {
                    C24976t.m82084a(optString, optString3, j3, optJSONObject);
                    optJSONObject.put("has_v3", 1);
                }
                C6906g.m21513a((Context) this.f73443f.get(), optString, optString2, j, j3, optJSONObject);
                if (aVar != null) {
                    aVar.mo71363a((Object) new C6711m());
                }
            } else if (aVar != null) {
                aVar.mo71362a(0, "");
            }
        } else if (aVar != null) {
            aVar.mo71362a(0, "");
        }
    }

    private /* synthetic */ SendLogMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
