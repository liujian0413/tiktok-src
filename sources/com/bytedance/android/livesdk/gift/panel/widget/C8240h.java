package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.model.GiftOperation;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.h */
final /* synthetic */ class C8240h implements OnClickListener {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f22618a;

    /* renamed from: b */
    private final String f22619b;

    /* renamed from: c */
    private final GiftOperation f22620c;

    C8240h(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget, String str, GiftOperation giftOperation) {
        this.f22618a = giftConfigurablePanelTabWidget;
        this.f22619b = str;
        this.f22620c = giftOperation;
    }

    public final void onClick(View view) {
        this.f22618a.mo21330a(this.f22619b, this.f22620c, view);
    }
}
