package com.p280ss.android.ugc.aweme.crossplatform.prefetch;

import com.bytedance.ies.web.jsbridge2.CallContext;
import com.bytedance.ies.web.p583b.C11113f;
import com.bytedance.ies.web.p583b.C11114g;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.prefetch.RnPrefetchMethod */
public final class RnPrefetchMethod extends BaseCommonJavaMethod implements C11114g {

    /* renamed from: a */
    private C27876a f68690a;

    /* renamed from: b */
    private C11113f f68691b;

    public RnPrefetchMethod(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public final void mo27097a(C11113f fVar) {
        C7573i.m23587b(fVar, "bridge");
        this.f68691b = fVar;
    }

    /* renamed from: a */
    public final void mo27099a(JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "result");
        C27876a aVar = this.f68690a;
        if (aVar != null) {
            aVar.mo71365a(jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo27098a(Throwable th) {
        C7573i.m23587b(th, "throwable");
        C27876a aVar = this.f68690a;
        if (aVar != null) {
            aVar.mo71362a(-1, "");
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        this.f68690a = aVar;
        if (jSONObject != null) {
            C11113f fVar = this.f68691b;
            if (fVar != null) {
                fVar.mo27096a(jSONObject, new CallContext());
            }
        }
    }
}
