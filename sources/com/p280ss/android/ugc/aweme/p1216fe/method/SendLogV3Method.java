package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.common.C6906g;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogV3Method */
public final class SendLogV3Method extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C27927a f73584a = new C27927a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.SendLogV3Method$a */
    public static final class C27927a {
        private C27927a() {
        }

        public /* synthetic */ C27927a(C7571f fVar) {
            this();
        }
    }

    public SendLogV3Method() {
        this(null, 1, null);
    }

    public SendLogV3Method(C11087a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        m91470b(jSONObject, aVar);
    }

    /* renamed from: b */
    private static void m91470b(JSONObject jSONObject, C27876a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (!TextUtils.isEmpty(optString) && optJSONObject != null) {
                Iterator keys = optJSONObject.keys();
                HashMap hashMap = new HashMap();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    String optString2 = optJSONObject.optString(str);
                    keys.remove();
                    Map map = hashMap;
                    C7573i.m23582a((Object) str, "key");
                    C7573i.m23582a((Object) optString2, "value");
                    map.put(str, optString2);
                }
                C6906g.m21515a(optString, hashMap);
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

    private /* synthetic */ SendLogV3Method(C11087a aVar, int i, C7571f fVar) {
        this(null);
    }
}
