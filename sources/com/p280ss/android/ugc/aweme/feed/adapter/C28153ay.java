package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ay */
final /* synthetic */ class C28153ay implements Runnable {

    /* renamed from: a */
    private final VideoViewHolder f74243a;

    /* renamed from: b */
    private final String f74244b;

    /* renamed from: c */
    private final long f74245c;

    /* renamed from: d */
    private final int f74246d;

    /* renamed from: e */
    private final View f74247e;

    C28153ay(VideoViewHolder videoViewHolder, String str, long j, int i, View view) {
        this.f74243a = videoViewHolder;
        this.f74244b = str;
        this.f74245c = j;
        this.f74246d = i;
        this.f74247e = view;
    }

    public final void run() {
        this.f74243a.mo71667a(this.f74244b, this.f74245c, this.f74246d, this.f74247e);
    }
}
