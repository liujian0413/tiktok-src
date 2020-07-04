package com.bytedance.android.livesdk.feed.live;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.live.base.model.feed.FeedItem;

/* renamed from: com.bytedance.android.livesdk.feed.live.o */
final /* synthetic */ class C6064o implements OnClickListener {

    /* renamed from: a */
    private final C6044b f17955a;

    /* renamed from: b */
    private final FeedItem f17956b;

    C6064o(C6044b bVar, FeedItem feedItem) {
        this.f17955a = bVar;
        this.f17956b = feedItem;
    }

    public final void onClick(View view) {
        this.f17955a.mo14711a(this.f17956b, view);
    }
}
