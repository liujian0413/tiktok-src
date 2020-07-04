package com.bytedance.android.livesdk.log.p404a;

import com.bytedance.android.livesdk.log.p405b.C8435g;
import com.bytedance.common.utility.C6319n;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.i */
public final class C8418i extends C8410a<C8435g> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21572a(Map<String, String> map, C8435g gVar) {
        super.mo21572a(map, gVar);
        if (gVar != null) {
            if (gVar.f23071g > 0) {
                map.put("channel_id", String.valueOf(gVar.f23071g));
            }
            if (gVar.f23066b > 0) {
                map.put("invitee_id", String.valueOf(gVar.f23066b));
            }
            if (gVar.f23065a > 0) {
                map.put("inviter_id", String.valueOf(gVar.f23065a));
            }
            if (!C6319n.m19593a(gVar.f23075k)) {
                map.put("match_type", gVar.f23075k);
            }
            if (!C6319n.m19593a(gVar.f23067c)) {
                map.put("end_type", gVar.f23067c);
            }
            if (!C6319n.m19593a(gVar.f23068d)) {
                map.put("connection_time", gVar.f23068d);
            }
            if (!C6319n.m19593a(gVar.f23069e)) {
                map.put("invitee_list", gVar.f23069e);
            }
            if (!C6319n.m19593a(gVar.f23070f)) {
                map.put("is_rematch", gVar.f23070f);
            }
            map.put("pk_time", String.valueOf(gVar.f23074j));
            if (!C6319n.m19593a(gVar.f23072h)) {
                map.put("connection_type", gVar.f23072h);
                if (gVar.f23072h.equals("pk")) {
                    if (!C6319n.m19593a(gVar.f23073i)) {
                        map.put("title", gVar.f23073i);
                    }
                    if (gVar.f23074j > 0) {
                        map.put("pk_time", String.valueOf(gVar.f23074j));
                    }
                }
            }
        }
    }
}
