package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: com.bytedance.android.livesdk.feed.live.k */
final /* synthetic */ class C6060k implements OnClickListener {

    /* renamed from: a */
    private final CommonLiveViewHolder f17948a;

    /* renamed from: b */
    private final FeedItem f17949b;

    /* renamed from: c */
    private final Room f17950c;

    C6060k(CommonLiveViewHolder commonLiveViewHolder, FeedItem feedItem, Room room) {
        this.f17948a = commonLiveViewHolder;
        this.f17949b = feedItem;
        this.f17950c = room;
    }

    public final void onClick(View view) {
        this.f17948a.mo14706a(this.f17949b, this.f17950c, view);
    }
}
