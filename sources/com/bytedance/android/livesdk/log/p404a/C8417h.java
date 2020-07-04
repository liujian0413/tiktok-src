package com.bytedance.android.livesdk.log.p404a;

import com.bytedance.android.livesdk.log.p405b.C8434f;
import com.bytedance.common.utility.C6319n;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.h */
public final class C8417h extends C8410a<C8434f> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21572a(Map map, Object obj) {
        m25598a(map, (C8434f) obj);
    }

    /* renamed from: a */
    private static void m25598a(Map<String, String> map, C8434f fVar) {
        if (fVar != null) {
            if (fVar.f23056a > 0) {
                map.put("channel_id", String.valueOf(fVar.f23056a));
            }
            if (fVar.f23057b > 0) {
                map.put("right_user_id", String.valueOf(fVar.f23057b));
            }
            map.put("is_oncemore", String.valueOf(fVar.f23064i));
            if (fVar.f23058c > 0) {
                map.put("pk_time", String.valueOf(fVar.f23058c));
                map.put("connection_type", fVar.f23059d);
                map.put("match_type", fVar.f23060e);
                if (fVar.f23061f > 0) {
                    map.put("pk_id", String.valueOf(fVar.f23061f));
                }
                if (C6319n.m19593a(fVar.f23062g)) {
                    map.put("title", fVar.f23062g);
                }
                if (fVar.f23063h > 0) {
                    map.put("backdoor_time", String.valueOf(fVar.f23063h));
                }
            } else {
                map.put("connection_type", fVar.f23059d);
            }
        }
    }
}
