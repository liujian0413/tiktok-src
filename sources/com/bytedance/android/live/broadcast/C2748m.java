package com.bytedance.android.live.broadcast;

import android.view.SurfaceView;

/* renamed from: com.bytedance.android.live.broadcast.m */
final /* synthetic */ class C2748m implements Runnable {

    /* renamed from: a */
    private final LiveBroadcastFragment f8704a;

    /* renamed from: b */
    private final SurfaceView f8705b;

    C2748m(LiveBroadcastFragment liveBroadcastFragment, SurfaceView surfaceView) {
        this.f8704a = liveBroadcastFragment;
        this.f8705b = surfaceView;
    }

    public final void run() {
        this.f8704a.mo8767a(this.f8705b);
    }
}
