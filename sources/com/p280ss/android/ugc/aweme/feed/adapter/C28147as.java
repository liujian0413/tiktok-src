package com.p280ss.android.ugc.aweme.feed.adapter;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.as */
final /* synthetic */ class C28147as implements Runnable {

    /* renamed from: a */
    private final VideoViewHolder f74230a;

    /* renamed from: b */
    private final long f74231b;

    /* renamed from: c */
    private final int f74232c;

    /* renamed from: d */
    private final String f74233d;

    C28147as(VideoViewHolder videoViewHolder, long j, int i, String str) {
        this.f74230a = videoViewHolder;
        this.f74231b = j;
        this.f74232c = i;
        this.f74233d = str;
    }

    public final void run() {
        this.f74230a.mo71656a(this.f74231b, this.f74232c, this.f74233d);
    }
}
