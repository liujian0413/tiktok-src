package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ek */
final /* synthetic */ class C5697ek implements OnClickListener {

    /* renamed from: a */
    private final PromotionStatusWidget f16789a;

    /* renamed from: b */
    private final long f16790b;

    C5697ek(PromotionStatusWidget promotionStatusWidget, long j) {
        this.f16789a = promotionStatusWidget;
        this.f16790b = j;
    }

    public final void onClick(View view) {
        this.f16789a.mo13992a(this.f16790b, view);
    }
}
