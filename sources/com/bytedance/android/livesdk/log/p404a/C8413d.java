package com.bytedance.android.livesdk.log.p404a;

import android.text.TextUtils;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.a.d */
public final class C8413d extends C8410a<C8431c> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21572a(Map<String, String> map, C8431c cVar) {
        super.mo21572a(map, cVar);
        if (cVar != null) {
            if (!TextUtils.isEmpty(cVar.f23049a)) {
                map.put("request_page", cVar.f23049a);
            }
            if (cVar.f23050b > 0) {
                map.put("to_user_id", String.valueOf(cVar.f23050b));
            }
            if (!TextUtils.isEmpty(cVar.f23051c)) {
                map.put("type", cVar.f23051c);
            }
            if (!TextUtils.isEmpty(cVar.f23052d)) {
                map.put("preview_source", cVar.f23052d);
            }
        }
    }
}
