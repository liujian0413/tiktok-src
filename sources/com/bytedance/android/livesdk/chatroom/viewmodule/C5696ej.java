package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.ej */
final /* synthetic */ class C5696ej implements OnClickListener {

    /* renamed from: a */
    private final PromotionStatusWidget f16787a;

    /* renamed from: b */
    private final long f16788b;

    C5696ej(PromotionStatusWidget promotionStatusWidget, long j) {
        this.f16787a = promotionStatusWidget;
        this.f16788b = j;
    }

    public final void onClick(View view) {
        this.f16787a.mo13993b(this.f16788b, view);
    }
}
