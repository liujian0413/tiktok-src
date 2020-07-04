package com.bytedance.android.livesdk.log.p404a;

import com.bytedance.android.livesdk.log.p405b.C8439k;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.l */
public final class C8421l extends C8410a<C8439k> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21572a(Map<String, String> map, C8439k kVar) {
        super.mo21572a(map, kVar);
        if (kVar != null && map.containsKey("_staging_flag")) {
            map.remove("_staging_flag");
        }
    }
}
