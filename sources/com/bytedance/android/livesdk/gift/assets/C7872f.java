package com.bytedance.android.livesdk.gift.assets;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.gift.assets.f */
public final class C7872f {

    /* renamed from: a */
    private static final Map<String, C7874h> f21272a = new HashMap();

    /* renamed from: a */
    public static C7874h m24128a(String str) {
        if (!f21272a.containsKey(str) || f21272a.get(str) == null) {
            f21272a.put(str, new C7866c(str));
        }
        return (C7874h) f21272a.get(str);
    }
}
