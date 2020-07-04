package com.bytedance.android.livesdk.log.p404a;

import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.common.utility.C6319n;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.k */
public class C8420k extends C8410a<C8438j> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21572a(Map<String, String> map, C8438j jVar) {
        super.mo21572a(map, jVar);
        if (jVar != null) {
            if (!C6319n.m19593a(jVar.f23080b)) {
                map.put("event_page", jVar.f23080b);
            }
            if (!C6319n.m19593a(jVar.f23081c)) {
                map.put("event_module", jVar.f23081c);
            }
            if (!C6319n.m19593a(jVar.f23082d)) {
                map.put("source", jVar.f23082d);
            }
            if (!C6319n.m19593a(jVar.f23083e)) {
                map.put("enter_from", jVar.f23083e);
            }
            if (!C6319n.m19593a(jVar.f23079a)) {
                map.put("event_belong", jVar.f23079a);
            }
            if (!C6319n.m19593a(jVar.f23084f)) {
                map.put("event_type", jVar.f23084f);
            }
            if (!C6319n.m19593a(jVar.f23085g)) {
                map.put("action_type", jVar.f23085g);
            }
            if (!C6319n.m19593a(jVar.f23086h)) {
                map.put("top_message_type", jVar.f23086h);
            }
        }
    }
}
