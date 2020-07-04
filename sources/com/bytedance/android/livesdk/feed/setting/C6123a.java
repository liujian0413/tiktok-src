package com.bytedance.android.livesdk.feed.setting;

import android.content.Context;
import com.bytedance.android.live.base.p123sp.TTLiveSettingUtil;
import com.google.gson.C6711m;

/* renamed from: com.bytedance.android.livesdk.feed.setting.a */
public final class C6123a {
    /* renamed from: a */
    public static void m19072a(boolean z) {
        TTLiveSettingUtil.setLocalTest(true);
    }

    /* renamed from: a */
    public static void m19071a(Context context, C6711m mVar) {
        TTLiveSettingUtil.updateSettings(context, mVar);
    }
}
