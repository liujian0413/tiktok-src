package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowDmtToastMethod */
public final class ShowDmtToastMethod extends BaseCommonJavaMethod {
    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject == null) {
            aVar.mo71362a(0, "no params found");
            return;
        }
        String optString = jSONObject.optString("msg");
        C7573i.m23582a((Object) optString, "params.optString(\"msg\")");
        WeakReference weakReference = this.f73443f;
        if (weakReference != null) {
            Context context = (Context) weakReference.get();
            if (context != null) {
                C10761a.m31387a(context, optString).mo25750a();
            }
        }
    }
}
