package com.bytedance.android.livesdk.log.p404a;

import com.bytedance.android.livesdk.log.p405b.C8437i;
import com.bytedance.android.livesdk.log.p405b.C8441m;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.o */
public final class C8424o extends C8410a<C8441m> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21572a(Map<String, String> map, C8441m mVar) {
        super.mo21572a(map, mVar);
        if (mVar != null) {
            map.put("gift_type", mVar.f23088a);
            map.put("gift_id", mVar.f23089b);
            map.put("money", String.valueOf(mVar.f23090c));
            if (C8437i.f23078b == mVar.f23091d) {
                map.put("guest_id", String.valueOf(mVar.f23092e));
            }
        }
    }
}
