package com.p280ss.android.ugc.aweme.bullet.bridge.framework;

import android.text.TextUtils;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.common.C6906g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method */
public final class SendLogV3Method extends BaseBridge {

    /* renamed from: c */
    public static final C23598a f62265c = new C23598a(null);

    /* renamed from: d */
    private final String f62266d = "sendLogV3";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method$a */
    public static final class C23598a {
        private C23598a() {
        }

        public /* synthetic */ C23598a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public final String mo25127c() {
        return this.f62266d;
    }

    public SendLogV3Method(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    public final void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        m77477b(jSONObject, aVar);
    }

    /* renamed from: b */
    private static void m77477b(JSONObject jSONObject, C23565a aVar) {
        if (jSONObject == null) {
            aVar.mo61493a(0, "");
            return;
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (TextUtils.isEmpty(optString) || optJSONObject == null) {
            aVar.mo61493a(0, "");
            return;
        }
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
        aVar.mo61494a((Object) new C6711m());
    }
}
