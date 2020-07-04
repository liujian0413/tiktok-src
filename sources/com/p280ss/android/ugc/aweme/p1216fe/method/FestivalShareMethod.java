package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.FestivalShareMethod */
public final class FestivalShareMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27887a f73469a = new C27887a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.FestivalShareMethod$a */
    public static final class C27887a {
        private C27887a() {
        }

        public /* synthetic */ C27887a(C7571f fVar) {
            this();
        }
    }

    public FestivalShareMethod() {
        this(null, 1, null);
    }

    public FestivalShareMethod(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        if (this.f73443f.get() != null) {
            if (jSONObject != null) {
                str = jSONObject.optString("item_id");
            } else {
                str = null;
            }
            if (str != null) {
                IBridgeService iBridgeService = (IBridgeService) ServiceManager.get().getService(IBridgeService.class);
                Object obj = this.f73443f.get();
                if (obj == null) {
                    C7573i.m23580a();
                }
                iBridgeService.festivalShareFromH5((Context) obj, str, aVar);
            }
        }
    }

    private /* synthetic */ FestivalShareMethod(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
