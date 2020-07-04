package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;

/* renamed from: com.bytedance.android.livesdk.viewmodel.e */
public final class C9142e implements C0067b {
    /* renamed from: a */
    public final <T extends C0063u> T mo149a(Class<T> cls) {
        if (cls.isAssignableFrom(RoomStatsViewModel.class)) {
            return new RoomStatsViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
