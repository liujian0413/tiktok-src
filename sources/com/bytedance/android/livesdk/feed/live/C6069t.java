package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.live.t */
final /* synthetic */ class C6069t implements OnClickListener {

    /* renamed from: a */
    private final HotsoonLiveAdViewHolder f17962a;

    /* renamed from: b */
    private final FeedItem f17963b;

    C6069t(HotsoonLiveAdViewHolder hotsoonLiveAdViewHolder, FeedItem feedItem) {
        this.f17962a = hotsoonLiveAdViewHolder;
        this.f17963b = feedItem;
    }

    public final void onClick(View view) {
        this.f17962a.mo14717b(this.f17963b, view);
    }
}
