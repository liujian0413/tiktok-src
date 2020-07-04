package com.bytedance.android.livesdk;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.live.core.network.NetworkStat;

/* renamed from: com.bytedance.android.livesdk.f */
final /* synthetic */ class C5891f implements C0053p {

    /* renamed from: a */
    private final FansClubAutoLightFragment f17431a;

    C5891f(FansClubAutoLightFragment fansClubAutoLightFragment) {
        this.f17431a = fansClubAutoLightFragment;
    }

    public final void onChanged(Object obj) {
        this.f17431a.mo11342a((NetworkStat) obj);
    }
}
