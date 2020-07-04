package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.feed.live.g */
final /* synthetic */ class C6056g implements OnClickListener {

    /* renamed from: a */
    private final BaseLiveViewHolder f17942a;

    /* renamed from: b */
    private final Room f17943b;

    /* renamed from: c */
    private final PopupWindow f17944c;

    C6056g(BaseLiveViewHolder baseLiveViewHolder, Room room, PopupWindow popupWindow) {
        this.f17942a = baseLiveViewHolder;
        this.f17943b = room;
        this.f17944c = popupWindow;
    }

    public final void onClick(View view) {
        this.f17942a.mo14696a(this.f17943b, this.f17944c, view);
    }
}
