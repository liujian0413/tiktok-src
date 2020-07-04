package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

/* renamed from: com.bytedance.android.livesdk.feed.live.s */
final /* synthetic */ class C6068s implements OnClickListener {

    /* renamed from: a */
    private final HotsoonLiveAdViewHolder f17960a;

    /* renamed from: b */
    private final PopupWindow f17961b;

    C6068s(HotsoonLiveAdViewHolder hotsoonLiveAdViewHolder, PopupWindow popupWindow) {
        this.f17960a = hotsoonLiveAdViewHolder;
        this.f17961b = popupWindow;
    }

    public final void onClick(View view) {
        this.f17960a.mo14714a(this.f17961b, view);
    }
}
