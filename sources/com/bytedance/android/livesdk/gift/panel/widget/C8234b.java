package com.bytedance.android.livesdk.gift.panel.widget;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.livesdk.gift.model.GiftOperation;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.b */
final /* synthetic */ class C8234b implements C0053p {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f22610a;

    C8234b(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget) {
        this.f22610a = giftConfigurablePanelTabWidget;
    }

    public final void onChanged(Object obj) {
        this.f22610a.mo21328a((GiftOperation) obj);
    }
}
