package com.bytedance.android.live.broadcast;

import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.live.broadcast.p */
final /* synthetic */ class C2765p implements Callable {

    /* renamed from: a */
    private final LiveCameraResManager f8744a;

    C2765p(LiveCameraResManager liveCameraResManager) {
        this.f8744a = liveCameraResManager;
    }

    public final Object call() {
        return this.f8744a.lambda$loadResources$1$LiveCameraResManager();
    }
}
