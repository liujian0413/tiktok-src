package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.commercialize.EasterEggPageParams;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25222ad;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.ShowEasterEggMethod */
public final class ShowEasterEggMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f71428a;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.ShowEasterEggMethod$a */
    public static final class C27072a extends C6597a<EasterEggInfo> {
        C27072a() {
        }
    }

    public ShowEasterEggMethod(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f71428a = weakReference;
    }

    /* renamed from: a */
    private static EasterEggInfo m88860a(String str) {
        C7573i.m23587b(str, "result");
        EasterEggInfo easterEggInfo = (EasterEggInfo) C10944e.m32113a().mo15975a(str, new C27072a().type);
        C7573i.m23582a((Object) easterEggInfo, "list");
        return easterEggInfo;
    }

    public ShowEasterEggMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "jsBridge");
        super(aVar);
        this.f71428a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        Context context;
        if (jSONObject != null) {
            try {
                EasterEggPageParams easterEggPageParams = new EasterEggPageParams();
                String string = jSONObject.getString("easterEggInfo");
                C7573i.m23582a((Object) string, "params.getString(\"easterEggInfo\")");
                easterEggPageParams.setEasterEggInfo(m88860a(string));
                easterEggPageParams.setKeyWords(jSONObject.getString("keyWords"));
                easterEggPageParams.setEnterFrom(jSONObject.getString("enterFrom"));
                easterEggPageParams.setEnterMethod(jSONObject.getString("enterMethod"));
                WeakReference<Context> weakReference = this.f71428a;
                if (weakReference != null) {
                    context = (Context) weakReference.get();
                } else {
                    context = null;
                }
                C25222ad.m82927a(context, easterEggPageParams, -1);
            } catch (Exception e) {
                C27064b.m88836a(e, "ShowEasterEggMethod");
                aVar.mo71362a(0, e.getMessage());
                return;
            }
        }
        aVar.mo71363a((Object) new JSONArray());
    }
}
