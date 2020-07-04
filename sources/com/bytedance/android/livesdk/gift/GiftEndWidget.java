package com.bytedance.android.livesdk.gift;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.C4441k;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftEndWidget extends LiveWidget {

    /* renamed from: a */
    private final DataCenter f21242a;

    public int getLayoutId() {
        return R.layout.anj;
    }

    public void onCreate() {
        super.onCreate();
        this.contentView.addOnLayoutChangeListener(new C7878b(this));
    }

    public GiftEndWidget(DataCenter dataCenter) {
        this.f21242a = dataCenter;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20593a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            this.f21242a.lambda$put$1$DataCenter("cmd_gift_dialog_switch", new C4441k(this.contentView.getMeasuredHeight(), true));
        }
    }
}
