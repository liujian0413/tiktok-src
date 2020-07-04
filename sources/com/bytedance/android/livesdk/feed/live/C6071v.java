package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.live.v */
final /* synthetic */ class C6071v implements OnClickListener {

    /* renamed from: a */
    private final HotsoonLiveAdViewHolder f17965a;

    /* renamed from: b */
    private final FeedItem f17966b;

    C6071v(HotsoonLiveAdViewHolder hotsoonLiveAdViewHolder, FeedItem feedItem) {
        this.f17965a = hotsoonLiveAdViewHolder;
        this.f17966b = feedItem;
    }

    public final void onClick(View view) {
        this.f17965a.mo14715a(this.f17966b, view);
    }
}
