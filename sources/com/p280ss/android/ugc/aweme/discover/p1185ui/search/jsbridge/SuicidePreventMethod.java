package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.discover.model.SearchPreventSuicide;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.C27064b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SuicidePreventMethod */
public final class SuicidePreventMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f71429a;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.SuicidePreventMethod$a */
    public static final class C27073a extends C6597a<SearchPreventSuicide> {
        C27073a() {
        }
    }

    public SuicidePreventMethod(WeakReference<Context> weakReference) {
        C7573i.m23587b(weakReference, "contextRef");
        this.f71429a = weakReference;
    }

    /* renamed from: a */
    private static SearchPreventSuicide m88862a(String str) {
        C7573i.m23587b(str, "result");
        SearchPreventSuicide searchPreventSuicide = (SearchPreventSuicide) C10944e.m32113a().mo15975a(str, new C27073a().type);
        C7573i.m23582a((Object) searchPreventSuicide, "list");
        return searchPreventSuicide;
    }

    public SuicidePreventMethod(WeakReference<Context> weakReference, C11087a aVar) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(aVar, "jsBridge");
        super(aVar);
        this.f71429a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("suicide_prevent_info");
                C7573i.m23582a((Object) string, "params.getString(\"suicide_prevent_info\")");
                C42961az.m136380a(m88862a(string));
            } catch (Exception e) {
                C27064b.m88836a(e, "SuicidePreventMethod");
                aVar.mo71362a(0, e.getMessage());
                return;
            }
        }
        aVar.mo71363a((Object) new JSONObject());
    }
}
