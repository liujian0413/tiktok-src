package com.bytedance.android.livesdk.rank;

import com.bytedance.android.livesdk.chatroom.model.C4922r;
import com.bytedance.android.livesdk.chatroom.model.C4923s;
import com.bytedance.android.livesdk.config.LiveSettingKeys;

/* renamed from: com.bytedance.android.livesdk.rank.m */
public final class C8851m {
    /* renamed from: a */
    public static int m26478a(boolean z) {
        C4922r rVar = (C4922r) LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG.mo10240a();
        if (!z || rVar == null || !rVar.f14075b) {
            return ((Integer) LiveSettingKeys.LIVE_DAILY_RANK.mo10240a()).intValue();
        }
        return rVar.f14074a;
    }

    /* renamed from: b */
    public static int m26479b(boolean z) {
        if (m26480c(z)) {
            return ((C4922r) LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG.mo10240a()).f14077d;
        }
        C4923s sVar = (C4923s) LiveSettingKeys.LIVE_RANK_CONFIG.mo10240a();
        if (sVar != null) {
            return sVar.f14077d;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m26480c(boolean z) {
        if (!z) {
            return z;
        }
        C4923s sVar = (C4923s) LiveSettingKeys.LIVE_RANK_ANCHOR_CONFIG.mo10240a();
        if (sVar == null || !sVar.f14075b) {
            return false;
        }
        return true;
    }
}
