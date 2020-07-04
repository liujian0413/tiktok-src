package com.bytedance.android.livesdk.chatroom.event;

import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;

/* renamed from: com.bytedance.android.livesdk.chatroom.event.av */
public class C4430av {

    /* renamed from: a */
    public User f12864a;

    /* renamed from: b */
    public Bundle f12865b;

    /* renamed from: c */
    public PanelType f12866c;

    /* renamed from: d */
    public long f12867d;

    /* renamed from: e */
    private boolean f12868e;

    public C4430av() {
        this.f12868e = true;
        this.f12866c = PanelType.GIFT;
    }

    public C4430av(PanelType panelType) {
        this.f12868e = true;
        this.f12866c = panelType;
    }

    public C4430av(PanelType panelType, boolean z) {
        this(panelType);
        this.f12868e = z;
    }
}
