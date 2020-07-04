package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.C9408g;
import com.bytedance.android.livesdkapi.service.C9515c;

/* renamed from: com.bytedance.android.livesdk.af */
public final class C3906af implements C9408g {
    /* renamed from: a */
    public final C9515c mo11446a() {
        return TTLiveSDKContext.getLiveService();
    }

    /* renamed from: a */
    public final <T> T mo11447a(Class<T> cls) {
        return TTLiveSDKContext.getService(cls);
    }
}
