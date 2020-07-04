package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Intent;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p280ss.android.ugc.aweme.framework.p1274c.C29956a;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30377c;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePopMethod */
public final class RoutePopMethod extends BaseCommonJavaMethod {

    /* renamed from: b */
    public static final C27922a f73571b = new C27922a(null);

    /* renamed from: a */
    public final C11087a f73572a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePopMethod$a */
    public static final class C27922a {
        private C27922a() {
        }

        public /* synthetic */ C27922a(C7571f fVar) {
            this();
        }
    }

    public RoutePopMethod() {
        this(null, 1, null);
    }

    public RoutePopMethod(C11087a aVar) {
        super(aVar);
        this.f73572a = aVar;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        AbsActivityContainer a = mo71356a();
        if (a != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                C30377c.m99262a(jSONObject2, jSONObject);
            }
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            a.mo67083a(50000, intent);
            a.mo67095l();
            aVar.mo71364a(new JSONObject(), C29956a.f78750c, "pop succeed");
            return;
        }
        aVar.mo71362a(C29956a.f78751d, "params not valid");
    }

    private /* synthetic */ RoutePopMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
