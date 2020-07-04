package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.live.r */
final /* synthetic */ class C6067r implements OnClickListener {

    /* renamed from: a */
    private final HotsoonLiveAdViewHolder f17958a;

    /* renamed from: b */
    private final FeedItem f17959b;

    C6067r(HotsoonLiveAdViewHolder hotsoonLiveAdViewHolder, FeedItem feedItem) {
        this.f17958a = hotsoonLiveAdViewHolder;
        this.f17959b = feedItem;
    }

    public final void onClick(View view) {
        this.f17958a.mo14719c(this.f17959b, view);
    }
}
