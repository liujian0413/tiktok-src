package com.bytedance.android.live.broadcast.effect.adapter;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.live.broadcast.effect.adapter.a */
final /* synthetic */ class C2587a implements OnClickListener {

    /* renamed from: a */
    private final LiveFilterAdapter f8315a;

    /* renamed from: b */
    private final int f8316b;

    /* renamed from: c */
    private final C2586b f8317c;

    C2587a(LiveFilterAdapter liveFilterAdapter, int i, C2586b bVar) {
        this.f8315a = liveFilterAdapter;
        this.f8316b = i;
        this.f8317c = bVar;
    }

    public final void onClick(View view) {
        this.f8315a.mo9207a(this.f8316b, this.f8317c, view);
    }
}
