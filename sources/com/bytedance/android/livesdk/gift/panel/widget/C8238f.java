package com.bytedance.android.livesdk.gift.panel.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.model.GiftPage;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.f */
final /* synthetic */ class C8238f implements OnClickListener {

    /* renamed from: a */
    private final GiftConfigurablePanelTabWidget f22614a;

    /* renamed from: b */
    private final View f22615b;

    /* renamed from: c */
    private final GiftPage f22616c;

    C8238f(GiftConfigurablePanelTabWidget giftConfigurablePanelTabWidget, View view, GiftPage giftPage) {
        this.f22614a = giftConfigurablePanelTabWidget;
        this.f22615b = view;
        this.f22616c = giftPage;
    }

    public final void onClick(View view) {
        this.f22614a.mo21326a(this.f22615b, this.f22616c, view);
    }
}
