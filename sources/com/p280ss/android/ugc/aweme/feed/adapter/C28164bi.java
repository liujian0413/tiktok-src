package com.p280ss.android.ugc.aweme.feed.adapter;

import com.p280ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bi */
final /* synthetic */ class C28164bi implements Runnable {

    /* renamed from: a */
    private final VideoViewHolder f74263a;

    /* renamed from: b */
    private final Video f74264b;

    C28164bi(VideoViewHolder videoViewHolder, Video video) {
        this.f74263a = videoViewHolder;
        this.f74264b = video;
    }

    public final void run() {
        this.f74263a.mo71691b(this.f74264b);
    }
}
