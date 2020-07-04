package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.model.GiftOperation;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.view.topbar.f */
final /* synthetic */ class C7933f implements OnClickListener {

    /* renamed from: a */
    private final LiveNobleGiftView f21462a;

    /* renamed from: b */
    private final String f21463b;

    /* renamed from: c */
    private final GiftOperation f21464c;

    C7933f(LiveNobleGiftView liveNobleGiftView, String str, GiftOperation giftOperation) {
        this.f21462a = liveNobleGiftView;
        this.f21463b = str;
        this.f21464c = giftOperation;
    }

    public final void onClick(View view) {
        this.f21462a.mo20772a(this.f21463b, this.f21464c, view);
    }
}
