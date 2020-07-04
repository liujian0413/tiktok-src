package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0053p;
import com.bytedance.ies.sdk.widgets.KVData;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ep */
final /* synthetic */ class C5702ep implements C0053p {

    /* renamed from: a */
    private final RechargeWidget f16795a;

    C5702ep(RechargeWidget rechargeWidget) {
        this.f16795a = rechargeWidget;
    }

    public final void onChanged(Object obj) {
        this.f16795a.mo14002a((KVData) obj);
    }
}
