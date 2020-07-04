package com.p280ss.android.ugc.aweme.services;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.C21664ax;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22176d;
import com.p280ss.android.ugc.aweme.account.p941d.C21167b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p978m.p979a.C22182a;
import com.p280ss.android.ugc.aweme.account.p978m.p979a.C22193b;
import com.p280ss.android.ugc.aweme.account.p978m.p979a.C22196c;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.services.RnAndH5Service */
public final class RnAndH5Service implements C21664ax {
    public final void notifyFromRnAndH5(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (TextUtils.equals("find_account_back", jSONObject.getString("eventName"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    C22176d.m73607a(new C21167b(jSONObject2.getString("platform"), true, new JSONObject(jSONObject2.getString("user_info"))));
                    C21170a.m71337a(4);
                    return;
                }
                if (TextUtils.equals("rebindPhone_certify_success", jSONObject.getString("eventName"))) {
                    C21170a.m71337a(8);
                }
            } catch (Exception unused) {
                C7163a.m22363a();
            }
        }
    }

    public final Map<String, C11093e> getJavaMethods(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextWrf");
        C7573i.m23587b(aVar, "iesJsBridge");
        return C7507ae.m23401c((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("sendVerifyCode", new C22193b(weakReference, aVar)), new Pair("validateVerifyCode", new C22196c(weakReference, aVar)), new Pair("localPhoneNo", new C22182a(weakReference, aVar))});
    }
}
