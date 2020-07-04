package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Application;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetMicroAppInfoMethod */
public final class GetMicroAppInfoMethod extends BaseCommonJavaMethod {
    public GetMicroAppInfoMethod(C11087a aVar) {
        C7573i.m23587b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        String str;
        try {
            C7167b b = C7167b.m22380b();
            C7573i.m23582a((Object) b, "MiniAppServiceProxy.inst()");
            IMiniAppService a = b.mo18647a();
            JSONObject jSONObject2 = new JSONObject();
            String str2 = "js_sdk_version";
            if (a != null) {
                Context a2 = C6399b.m19921a();
                if (a2 != null) {
                    str = a.getJsSdkVersion((Application) a2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
                }
            } else {
                str = null;
            }
            jSONObject2.put(str2, str);
            aVar.mo71365a(jSONObject2);
        } catch (Exception unused) {
            aVar.mo71362a(-1, "");
        }
    }
}
