package com.p280ss.android.ugc.aweme.p1216fe.method;

import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.live.p1359a.C32433b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DisableGestureClose */
public final class DisableGestureClose extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27884a f73459a = new C27884a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DisableGestureClose$a */
    public static final class C27884a {
        private C27884a() {
        }

        public /* synthetic */ C27884a(C7571f fVar) {
            this();
        }
    }

    public DisableGestureClose() {
        this(null, 1, null);
    }

    public DisableGestureClose(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        int i;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject != null) {
                i = optJSONObject.optInt("disable_gesture");
                C42961az.m136380a(new C32433b(i));
            }
        }
        i = 0;
        C42961az.m136380a(new C32433b(i));
    }

    private /* synthetic */ DisableGestureClose(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
