package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.wschannel.C9817d;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.SsWsApp.C9822a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;

/* renamed from: com.bytedance.common.wschannel.server.f */
class C9846f {

    /* renamed from: a */
    private static final String f26845a = "f";

    /* renamed from: b */
    private final Context f26846b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Map<Integer, IWsApp> mo24407a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String b = C9817d.m28950a(this.f26846b).mo24287b();
            if (TextUtils.isEmpty(b)) {
                return linkedHashMap;
            }
            JSONArray jSONArray = new JSONArray(b);
            int length = jSONArray.length();
            if (length <= 0) {
                return linkedHashMap;
            }
            for (int i = 0; i < length; i++) {
                new C9822a();
                SsWsApp a = C9822a.m28980a(jSONArray.optJSONObject(i));
                if (m29060a((IWsApp) a)) {
                    linkedHashMap.put(Integer.valueOf(WsChannelService.m29015a((IWsApp) a)), a);
                }
            }
            return linkedHashMap;
        } catch (Exception unused) {
        }
    }

    C9846f(Context context) {
        this.f26846b = context;
    }

    /* renamed from: a */
    private static boolean m29060a(IWsApp iWsApp) {
        if (iWsApp != null && iWsApp.mo24145a() > 0 && iWsApp.mo24146b() > 0 && !C6319n.m19593a(iWsApp.mo24152h()) && iWsApp.mo24149e() > 0 && !iWsApp.mo24155k().isEmpty() && !C6319n.m19593a(iWsApp.mo24147c()) && iWsApp.mo24153i() > 0 && !C6319n.m19593a(iWsApp.mo24148d()) && iWsApp.mo24150f() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24408a(Map<Integer, IWsApp> map) {
        if (map != null) {
            JSONArray jSONArray = new JSONArray();
            synchronized (WsChannelService.class) {
                for (Entry entry : map.entrySet()) {
                    try {
                        if (m29060a((IWsApp) entry.getValue())) {
                            jSONArray.put(((IWsApp) entry.getValue()).mo24151g());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            try {
                C9817d.m28950a(this.f26846b).mo24285a(jSONArray.toString());
            } catch (Exception unused2) {
            }
        }
    }
}
