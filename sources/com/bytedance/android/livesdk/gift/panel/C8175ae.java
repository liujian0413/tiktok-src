package com.bytedance.android.livesdk.gift.panel;

import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.GiftEndWidget;
import com.bytedance.android.livesdk.gift.honor.LiveGiftHonorLevelWidget;
import com.bytedance.android.livesdk.gift.panel.widget.FakeMtGiftPanelBottomWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftConfigurablePanelTabWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel.SendToType;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelDoodleWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelGuestInfoWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelListWidget;
import com.bytedance.android.livesdk.gift.panel.widget.GiftPanelTabWidget;
import com.bytedance.android.livesdk.p428w.C9165b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;

/* renamed from: com.bytedance.android.livesdk.gift.panel.ae */
final class C8175ae {
    /* renamed from: b */
    static Widget m25049b() {
        return new GiftPanelListWidget();
    }

    /* renamed from: d */
    static Widget m25051d() {
        return new LiveGiftHonorLevelWidget();
    }

    /* renamed from: c */
    static Widget m25050c() {
        return C9165b.m27243a().mo22357a(FakeMtGiftPanelBottomWidget.class);
    }

    /* renamed from: a */
    static Widget m25045a() {
        ((Boolean) LiveSettingKeys.XT_DOODLE_GIFT_ENABLE.mo10240a()).booleanValue();
        return new GiftPanelDoodleWidget();
    }

    /* renamed from: a */
    static Widget m25047a(DataCenter dataCenter) {
        return new GiftEndWidget(dataCenter);
    }

    /* renamed from: a */
    static Widget m25048a(boolean z, SendToType sendToType) {
        if (!z || sendToType != SendToType.GUEST) {
            return null;
        }
        return new GiftPanelGuestInfoWidget();
    }

    /* renamed from: a */
    static Widget m25046a(SendToType sendToType, int i) {
        if (sendToType == SendToType.GUEST) {
            return null;
        }
        switch (i) {
            case 0:
                return new GiftPanelTabWidget();
            case 1:
                return new GiftConfigurablePanelTabWidget();
            default:
                return null;
        }
    }
}
